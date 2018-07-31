package tf.benchmark.protocol

import io.gatling.core.action.builder.ActionBuilder
import tf.benchmark.GrpcCheckSupport
import tf.benchmark.actions.GrpcExecutableAction
import tf.benchmark.grpc.GrpcCheck


case class GrpcProcessBuilder(action: GrpcExecutableAction,
                              checks: List[GrpcCheck] = Nil) extends GrpcCheckSupport {

  def check(grpcCheck: GrpcCheck*): GrpcProcessBuilder = copy(checks = checks ::: grpcCheck.toList)

  def build(): ActionBuilder = GrpcActionBuilder(action, checks)

}
