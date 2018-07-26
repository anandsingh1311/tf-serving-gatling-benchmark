package test.scala.tf.benchmark

import ch.tamedia.gatling.GrpcCustomCheck
import ch.tamedia.gatling.actions.impl.{GrpcAsyncCallAction, GrpcSyncCallAction}
import com.trueaccord.scalapb.GeneratedMessage
import main.scala.com.spr.intuition.logging.LogResponse

import io.gatling.core.Predef._
import scala.concurrent.duration._
import scala.io.Source

class TfServingServerSimulation extends Simulation {

  import com.spr.intuition.gatling.Predef._

  val host = "localhost"
  val port = 50051


  val json: String = Source.fromFile("src/test/resources/sample_request.json").getLines.mkString

  val grpcConfig = GRPC()

  val grpcScenario = scenario("Test GRPC server")
    .exec(grpcCall(GrpcAsyncCallAction("async", host, port, json)).check(new GrpcCustomCheck((s: GeneratedMessage) => {
      s.asInstanceOf[LogResponse].message.equals("OK")
    })))
    .exec(grpcCall(GrpcSyncCallAction("sync", host, port, json)).check(new GrpcCustomCheck((s: GeneratedMessage) => {
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