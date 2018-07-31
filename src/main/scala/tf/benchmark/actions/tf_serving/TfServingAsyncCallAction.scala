package tf.benchmark.actions.tf_serving

import io.grpc.{ManagedChannel, ManagedChannelBuilder}
import org.tensorflow.framework.tensor.TensorProto
import tensorflow.serving.model.ModelSpec
import tensorflow.serving.predict._
import tensorflow.serving.prediction_service.PredictionServiceGrpc
import tensorflow.serving.prediction_service.PredictionServiceGrpc.PredictionServiceStub
import tf.benchmark.actions.GrpcExecutableAsyncAction

import scala.concurrent.Future

/**
  * Async call action
  */
object TfServingAsyncCallAction {

  /**
    * Constructor that needs couple of params in order to create valid gRPC connection
    *
    * @param host - server host
    * @param port - server port
    * @return - GrpcAsyncCallAction
    */
  def apply(name: String, host: String, port: Int, modelSpec: Option[ModelSpec], inputs: Map[String, TensorProto]): TfServingAsyncCallAction =
    new TfServingAsyncCallAction(name, host, port, modelSpec, inputs)
}

case class TfServingAsyncCallAction(name: String,
                                    host: String, port: Int,
                                    modelSpec: Option[ModelSpec], inputs: Map[String, TensorProto]) extends GrpcExecutableAsyncAction {

  var channel: ManagedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build
  val asyncCall: PredictionServiceStub = PredictionServiceGrpc.stub(channel)

  /**
    * Send async call to the server
    *
    * @return Future[GeneratedMessage]
    */
  override def executeAsync: Future[PredictResponse] = asyncCall.predict(
    new PredictRequest(modelSpec, inputs)
  )
}
