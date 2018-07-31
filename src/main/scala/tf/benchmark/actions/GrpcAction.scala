package tf.benchmark.actions

import akka.actor.ActorSystem
import io.gatling.core.stats.StatsEngine
import io.gatling.core.util.NameGen
import io.gatling.core.action.{Action, ExitableActorDelegatingAction}
import tf.benchmark.protocol.GrpcProtocol
import tf.benchmark.grpc.GrpcCheck

/**
  * Action that will create ActionActor and pass action class that will be triggered during simulation
  */
object GrpcAction extends NameGen {

  /**
    * @param action      - that which execSync or execAsync method will be called during the test (see GrpcActionActor)
    * @param checks      - what kind of result validations will be executed
    * @param protocol    - gRPC protocol
    * @param system      - actor system
    * @param statsEngine - engine to write results to
    * @param next        - next Action to be executed
    * @return - ExitableActorDelegatingAction
    */
  def apply(action: GrpcExecutableAction,
            checks: List[GrpcCheck],
            protocol: GrpcProtocol,
            system: ActorSystem,
            statsEngine: StatsEngine,
            next: Action): ExitableActorDelegatingAction = {
    val grpcActor = system.actorOf(GrpcActionActor.props(action, checks, protocol, statsEngine, next))
    new ExitableActorDelegatingAction(genName("TfServingGrpc"), statsEngine, next, grpcActor)
  }
}


