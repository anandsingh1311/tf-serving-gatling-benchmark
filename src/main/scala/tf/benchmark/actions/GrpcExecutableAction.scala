package tf.benchmark.actions

import scalapb.GeneratedMessage

import scala.concurrent.Future

/**
  * Base trait for grpc actions. Might be useful:
  * -   `name` acts as a key for the action (name of the actor of the action)
  * -   Can be implemented as abstract class too.
  * -   Examples: GrpcExecutableAsyncAction and GrpcExecutableSyncAction
  */
trait GrpcExecutableAction {

  require(name.nonEmpty)

  def name: String

  def executeSync: Option[GeneratedMessage]

  def executeAsync: Future[GeneratedMessage]
}
