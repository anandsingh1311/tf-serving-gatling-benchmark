package tf.benchmark.actions.tf.serving

import tf.benchmark.actions.GrpcExecutableAsyncAction
import tensorflow.serving.prediction_service.PredictionServiceGrpc
import tensorflow.serving.prediction_service.PredictionServiceGrpc.PredictionServiceStub
import tensorflow.serving.predict._
import scalapb.GeneratedMessage
import tensorflow.serving.model.ModelSpec
import io.grpc.{ManagedChannel, ManagedChannelBuilder}

import scala.concurrent.Future

/**
  * Async call action
  */
object TfServingAsyncCallAction {

  /**
    * Constructor that needs couple of params in order to create valid gRPC connection
    *
    * @param host      - server host
    * @param port      - server port
    * @param modelName - name of deployed model
    * @param version   - model version deployed
    * @return - GrpcAsyncCallAction
    */
  def apply(host: String, port: Int, modelName: String, version: Option[Long]): TfServingAsyncCallAction =
    new TfServingAsyncCallAction(host, port, modelName, version)
}

class TfServingAsyncCallAction(host: String, port: Int, modelName: String, version: Option[Long]) extends GrpcExecutableAsyncAction {

  var channel: ManagedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build
  val asyncCall: PredictionServiceStub = PredictionServiceGrpc.stub(channel)
  val modelSpec: Option[ModelSpec] = Option(ModelSpec(modelName, version))

  /**
    * Send async call to the server
    *
    * @return Future[GeneratedMessage]
    */
  override def executeAsync: Future[GeneratedMessage] = asyncCall.predict(
    new PredictRequest(modelSpec, inputs = scala.None)
  )

}
