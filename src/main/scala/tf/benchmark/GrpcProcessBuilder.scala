package tf.benchmark

import tf.benchmark.actions.GrpcExecutableAction
import tf.benchmark.grpc.GrpcCheck


case class GrpcProcessBuilder(action: GrpcExecutableAction, checks: List[GrpcCheck] = Nil) extends GrpcCheckSupport{

  def check(grpcCheck: GrpcCheck*) = copy(checks = checks ::: grpcCheck.toList)

  def build(): ActionBuilder = new GrpcActionBuilder(action, checks)
}