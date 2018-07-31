package tf.benchmark

import io.gatling.core.action.builder.ActionBuilder
import tf.benchmark.checks.GrpcCheckSupport
import tf.benchmark.protocol.{GrpcProcessBuilder, GrpcProtocol, GrpcProtocolBuilder}

object Predef extends GrpcCheckSupport {

  /**
    * @return builder for protocol configuration
    */
  val grpc: GrpcProtocolBuilder.type = GrpcProtocolBuilder

  /**
    * @return builder for grpc call to remote server
    */
  def grpcCall: GrpcProcessBuilder.type = GrpcProcessBuilder

  implicit def grpcProtocolBuilder2grpcProtocol(builder: GrpcProtocolBuilder): GrpcProtocol = builder.build()

  implicit def grpcProcessBuilder2ActionBuilder(builder: GrpcProcessBuilder): ActionBuilder = builder.build()

}