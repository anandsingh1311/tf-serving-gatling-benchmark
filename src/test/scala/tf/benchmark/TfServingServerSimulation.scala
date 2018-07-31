package tf.benchmark


import java.io.{File, FileInputStream}

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import scalapb.GeneratedMessage
import tensorflow.serving.predict.{PredictRequest, PredictResponse}
import tf.benchmark.actions.tf_serving.TfServingSyncCallAction
import tf.benchmark.checks.GrpcCustomCheck

import scala.concurrent.duration._

class TfServingServerSimulation extends Simulation {

  import Predef._

  val host = "localhost"
  val port = 9000

  private val predictRequests: Stream[PredictRequest] =
    PredictRequest.streamFromDelimitedInput(
      new FileInputStream(new File("src/test/resources/requests.pb"))
    )

  // TODO: convert this to feed

  //  private val requestFeed: Array[Map[String, Object]] =
  //    predictRequests
  //      .map(
  //        _preReq => Map("modelSpec" -> _preReq.modelSpec, "inputs" -> _preReq.inputs)
  //      ).toArray

  val grpcConfig = grpc()

  val grpcScenario: ScenarioBuilder =
    scenario("Tensorflow Serving Server via Sync Stub Call")
      //.feed(requestFeed)
      .exec(
      grpcCall(
        TfServingSyncCallAction("async", host, port, predictRequests.head.modelSpec, predictRequests.head.inputs)
      ).check(
        GrpcCustomCheck((s: GeneratedMessage) => s.asInstanceOf[PredictResponse].outputs.nonEmpty)
      )
    )

  setUp(
    grpcScenario.inject(
      atOnceUsers(10),
      rampUsers(10) over (5 seconds),
      constantUsersPerSec(20) during (15 seconds),
      heavisideUsers(1000) over (20 seconds))
  ).protocols(grpcConfig)

}