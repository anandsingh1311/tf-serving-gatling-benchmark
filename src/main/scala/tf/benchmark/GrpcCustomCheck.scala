package tf.benchmark


import scalapb.GeneratedMessage
import io.gatling.commons.validation.{Failure, Validation}
import io.gatling.core.check.CheckResult
import io.gatling.core.session.Session
import tf.benchmark.grpc.GrpcCheck

import scala.collection.mutable

/**
  * Simple match class, checking if response message (GeneratedMessage) satisfy checker function.
  * It is possible to write more complex checkers in case they are needed.
  *
  * @param func predicate function to check the constraints on the response message
  */
case class GrpcCustomCheck(func: GeneratedMessage => Boolean) extends GrpcCheck {

  override def check(response: GeneratedMessage, session: Session)(implicit cache: mutable.Map[Any, Any]): Validation[CheckResult] = {
    if (func(response)) {
      CheckResult.NoopCheckResultSuccess
    } else {
      Failure("Grpc check failed")
    }
  }
}
