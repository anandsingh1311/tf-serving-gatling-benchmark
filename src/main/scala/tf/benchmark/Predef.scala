package tf.benchmark

import io.gatling.core.action.builder.ActionBuilder
import tf.benchmark.protocol.{GrpcProcessBuilder, GrpcProtocol, GrpcProtocolBuilder}

object Predef extends GrpcCheckSupport {

  val grpc: GrpcProtocolBuilder.type = GrpcProtocolBuilder

  def grpcCall: GrpcProcessBuilder.type = GrpcProcessBuilder

  implicit def grpcProtocolBuilder2grpcProtocol(builder: GrpcProtocolBuilder): GrpcProtocol = builder.build()

  implicit def grpcProcessBuilder2ActionBuilder(builder: GrpcProcessBuilder): ActionBuilder = builder.build()

}