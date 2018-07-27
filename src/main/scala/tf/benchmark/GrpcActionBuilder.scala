package tf.benchmark

import io.gatling.core.action.Action
import io.gatling.core.action.builder.ActionBuilder
import io.gatling.core.protocol.Protocols
import io.gatling.core.structure.ScenarioContext
import tf.benchmark.actions.{GrpcAction, GrpcExecutableAction}
import tf.benchmark.grpc._

/**
  * Responsible to create specific action. Note in our case it uses functionName as criteria to decide if action will
  * execute sync or async call. In some other cases different criteria can be used.
  *
  * @param action - grpc action used for testing
  * @param checks - The way how response can be validated.
  */
case class GrpcActionBuilder(action: GrpcExecutableAction, checks: List[GrpcCheck]) extends ActionBuilder {

  def grpcProtocol(protocols: Protocols): GrpcProtocol = {
    protocols.protocol[GrpcProtocol].getOrElse(throw new UnsupportedOperationException("gRPC protocol wasn't registered"))
  }

  override def build(ctx: ScenarioContext, next: Action): Action = {
    GrpcAction(action, checks, new GrpcProtocol, ctx.system, ctx.coreComponents.statsEngine, next)
  }
}
