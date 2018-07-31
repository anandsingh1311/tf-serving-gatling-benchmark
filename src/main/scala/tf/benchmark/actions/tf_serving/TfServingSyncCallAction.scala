package tf.benchmark.actions.tf_serving

import io.grpc.{ManagedChannel, ManagedChannelBuilder}
import org.tensorflow.framework.tensor.TensorProto
import tensorflow.serving.model.ModelSpec
import tensorflow.serving.predict.{PredictRequest, PredictResponse}
import tensorflow.serving.prediction_service.PredictionServiceGrpc
import tensorflow.serving.prediction_service.PredictionServiceGrpc.PredictionServiceBlockingStub
import tf.benchmark.actions.GrpcExecutableSyncAction

/**
  * Sync call action
  */
object TfServingSyncCallAction {

  /**
    *
    * Constructor that needs couple of params in order to create valid gRPC connection
    *
    * @param name      - function name
    * @param host      - server host
    * @param port      - server port
    * @param modelSpec - spec of model deployed
    * @param inputs    - request for prediction
    * @return - TfServingSyncCallAction
    */
  def apply(name: String,
            host: String, port: Int,
            modelSpec: Option[ModelSpec], inputs: Map[String, TensorProto]): TfServingSyncCallAction =
    new TfServingSyncCallAction(name, host, port, modelSpec, inputs)

}

case class TfServingSyncCallAction(name: String,
                                   host: String, port: Int,
                                   modelSpec: Option[ModelSpec], inputs: Map[String, TensorProto]) extends GrpcExecutableSyncAction {

  var channel: ManagedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build
  val blockingCall: PredictionServiceBlockingStub = PredictionServiceGrpc.blockingStub(channel)

  /**
    * Create sync call to the server
    *
    * @return Option[GeneratedMessage]
    */
  override def executeSync: Option[PredictResponse] = Some(blockingCall.predict(PredictRequest(modelSpec, inputs)))

}
