package tf.benchmark.protocol

import akka.actor.ActorSystem
import io.gatling.core
import io.gatling.core.CoreComponents
import io.gatling.core.config.GatlingConfiguration
import io.gatling.core.protocol.{Protocol, ProtocolKey}


object GrpcProtocol {

  val GrpcProtocolKey: ProtocolKey =

    new ProtocolKey {

      override type Protocol = GrpcProtocol
      override type Components = GrpcComponents

      override def protocolClass: scala.Predef.Class[core.protocol.Protocol] =
        classOf[GrpcProtocol].asInstanceOf[Class[core.protocol.Protocol]]

      override def defaultProtocolValue(configuration: GatlingConfiguration): GrpcProtocol =
        throw new IllegalStateException("Can't provide a default value for GrpcProtocol")

      override def newComponents(system: ActorSystem, coreComponents: CoreComponents): GrpcProtocol => GrpcComponents = {
        grpcProtocol => GrpcComponents(grpcProtocol)
      }

    }
}


/*
 * minimal implementation of Protocol
 * we just add some parameters and define types
 */
case class GrpcProtocol() extends Protocol {

  type Components = GrpcComponents

}