package tf.benchmark.actions.impl

import tf.benchmark.actions.GrpcExecutableAsyncAction
import tensorflow.serving.prediction_service.PredictionServiceGrpc
import tensorflow.serving.prediction_service.PredictionServiceGrpc.PredictionServiceStub
import tensorflow.serving.predict._
import com.thesamet.scalapb.GeneratedMessage
import tensorflow.serving.model.ModelSpec

import scala.concurrent.Future

/**
  * Async call action
  */
object GrpcAsyncCallAction {

  /**
    * Constructor that needs couple of params in order to create valid gRPC connection
    *
    * @param host      - server host
    * @param port      - server port
    * @param modelName - name of deployed model
    * @param version   - model version deployed
    * @return - GrpcAsyncCallAction
    */
  def apply(host: String, port: Int, modelName: String, version: Int): GrpcAsyncCallAction = new GrpcAsyncCallAction(host, port, modelName, version)
}

class GrpcAsyncCallAction(host: String, port: Int, modelName: String, version: Int) extends GrpcExecutableAsyncAction {

  var channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build
  val asyncCall: PredictionServiceStub = PredictionServiceGrpc.stub(channel)
  val modelSpec: ModelSpec = ModelSpec(modelName, version)

  /**
    * Send async call to the server
    *
    * @return Future[GeneratedMessage]
    */
  override def executeAsync: Future[GeneratedMessage] = asyncCall.predict(
    PredictRequest(modelSpec, inputs =)
  )

}
