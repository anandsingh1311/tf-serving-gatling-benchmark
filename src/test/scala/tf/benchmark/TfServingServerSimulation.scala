package tf.benchmark


import scalapb.GeneratedMessage
import io.gatling.core.Predef._
import tensorflow.serving.predict.PredictResponse
import tf.benchmark.actions.tf.serving.TfServingAsyncCallAction

import scala.concurrent.duration._
import scala.io.Source

class TfServingServerSimulation extends Simulation {

  import Predef._

  val host = "localhost"
  val port = 9000
  val modelName = "out"
  val version = Option(0L)

  val json: String = Source.fromFile("src/test/resources/sample_request.json").getLines.mkString

  val grpcConfig = grpc()

  val grpcScenario = scenario("Test Tf Serving server")
    .exec(
      grpcCall(new TfServingAsyncCallAction(host, port, modelName, version))
        .check(GrpcCustomCheck((s: GeneratedMessage) => {
          s.asInstanceOf[PredictResponse].outputs.equals("OK")
        })))

  setUp(
    grpcScenario.inject(
      atOnceUsers(10),
      rampUsers(10) over (5 seconds),
      constantUsersPerSec(20) during (15 seconds),
      heavisideUsers(1000) over (20 seconds))
  ).protocols(grpcConfig)

}