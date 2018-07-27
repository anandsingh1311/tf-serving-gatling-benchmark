package tf.benchmark

import io.gatling.core.action.builder.ActionBuilder

object Predef extends GrpcDsl

/**
  * Implicits for protocol and action builder
  */
trait GrpcDsl extends GrpcCheckSupport {

  val GRPC: GrpcProtocolBuilder.type = GrpcProtocolBuilder

  def grpcCall: GrpcProcessBuilder.type = GrpcProcessBuilder

  implicit def grpcProtocolBuilder2grpcProtocol(builder: GrpcProtocolBuilder): GrpcProtocol = builder.build()

  implicit def grpcProcessBuilder2ActionBuilder(builder: GrpcProcessBuilder): ActionBuilder = builder.build()

}

