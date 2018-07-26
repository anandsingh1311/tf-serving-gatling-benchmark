package tf.benchmark

import com.thesamet.gatling.GrpcCustomCheck
import tf.benchmark.actions.impl.{GrpcAsyncCallAction, GrpcSyncCallAction}
import com.thesamet.scalapb.GeneratedMessage
import io.gatling.core.Predef._
import tf.benchmark.GrpcCustomCheck

import scala.concurrent.duration._
import scala.io.Source

class TfServingServerSimulation extends Simulation {

  import tf.benchmark.Predef._

  val host = "localhost"
  val port = 50051

  val json: String = Source.fromFile("src/test/resources/sample_request.json").getLines.mkString

  val grpcConfig = GRPC()

  val grpcScenario = scenario("Test Tf Serving server")
    .exec(
      grpcCall(GrpcAsyncCallAction("async", host, port, json)).check(GrpcCustomCheck((s: GeneratedMessage) => {
        s.asInstanceOf[LogResponse].message.equals("OK")
      })))

  setUp(
    grpcScenario.inject(
      atOnceUsers(10),
      rampUsers(10) over (5 seconds),
      constantUsersPerSec(20) during (15 seconds),
      heavisideUsers(1000) over (20 seconds))
  ).protocols(grpcConfig)

}