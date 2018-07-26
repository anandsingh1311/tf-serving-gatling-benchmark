package tensorflow.serving.prediction_service

object PredictionServiceGrpc {
  val METHOD_CLASSIFY: _root_.io.grpc.MethodDescriptor[tensorflow.serving.classification.ClassificationRequest, tensorflow.serving.classification.ClassificationResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("tensorflow.serving.PredictionService", "Classify"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.classification.ClassificationRequest))
      .setResponseMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.classification.ClassificationResponse))
      .build()
  
  val METHOD_REGRESS: _root_.io.grpc.MethodDescriptor[tensorflow.serving.regression.RegressionRequest, tensorflow.serving.regression.RegressionResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("tensorflow.serving.PredictionService", "Regress"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.regression.RegressionRequest))
      .setResponseMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.regression.RegressionResponse))
      .build()
  
  val METHOD_PREDICT: _root_.io.grpc.MethodDescriptor[tensorflow.serving.predict.PredictRequest, tensorflow.serving.predict.PredictResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("tensorflow.serving.PredictionService", "Predict"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.predict.PredictRequest))
      .setResponseMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.predict.PredictResponse))
      .build()
  
  val METHOD_GET_MODEL_METADATA: _root_.io.grpc.MethodDescriptor[tensorflow.serving.get_model_metadata.GetModelMetadataRequest, tensorflow.serving.get_model_metadata.GetModelMetadataResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("tensorflow.serving.PredictionService", "GetModelMetadata"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.get_model_metadata.GetModelMetadataRequest))
      .setResponseMarshaller(new scalapb.grpc.Marshaller(tensorflow.serving.get_model_metadata.GetModelMetadataResponse))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("tensorflow.serving.PredictionService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(tensorflow.serving.prediction_service.PredictionServiceProto.javaDescriptor))
      .addMethod(METHOD_CLASSIFY)
      .addMethod(METHOD_REGRESS)
      .addMethod(METHOD_PREDICT)
      .addMethod(METHOD_GET_MODEL_METADATA)
      .build()
  
  trait PredictionService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = PredictionService
    def classify(request: tensorflow.serving.classification.ClassificationRequest): scala.concurrent.Future[tensorflow.serving.classification.ClassificationResponse]
    def regress(request: tensorflow.serving.regression.RegressionRequest): scala.concurrent.Future[tensorflow.serving.regression.RegressionResponse]
    def predict(request: tensorflow.serving.predict.PredictRequest): scala.concurrent.Future[tensorflow.serving.predict.PredictResponse]
    def getModelMetadata(request: tensorflow.serving.get_model_metadata.GetModelMetadataRequest): scala.concurrent.Future[tensorflow.serving.get_model_metadata.GetModelMetadataResponse]
  }
  
  object PredictionService extends _root_.scalapb.grpc.ServiceCompanion[PredictionService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[PredictionService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = tensorflow.serving.prediction_service.PredictionServiceProto.javaDescriptor.getServices().get(0)
  }
  
  trait PredictionServiceBlockingClient {
    def serviceCompanion = PredictionService
    def classify(request: tensorflow.serving.classification.ClassificationRequest): tensorflow.serving.classification.ClassificationResponse
    def regress(request: tensorflow.serving.regression.RegressionRequest): tensorflow.serving.regression.RegressionResponse
    def predict(request: tensorflow.serving.predict.PredictRequest): tensorflow.serving.predict.PredictResponse
    def getModelMetadata(request: tensorflow.serving.get_model_metadata.GetModelMetadataRequest): tensorflow.serving.get_model_metadata.GetModelMetadataResponse
  }
  
  class PredictionServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[PredictionServiceBlockingStub](channel, options) with PredictionServiceBlockingClient {
    override def classify(request: tensorflow.serving.classification.ClassificationRequest): tensorflow.serving.classification.ClassificationResponse = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_CLASSIFY, options), request)
    }
    
    override def regress(request: tensorflow.serving.regression.RegressionRequest): tensorflow.serving.regression.RegressionResponse = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_REGRESS, options), request)
    }
    
    override def predict(request: tensorflow.serving.predict.PredictRequest): tensorflow.serving.predict.PredictResponse = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_PREDICT, options), request)
    }
    
    override def getModelMetadata(request: tensorflow.serving.get_model_metadata.GetModelMetadataRequest): tensorflow.serving.get_model_metadata.GetModelMetadataResponse = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_GET_MODEL_METADATA, options), request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): PredictionServiceBlockingStub = new PredictionServiceBlockingStub(channel, options)
  }
  
  class PredictionServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[PredictionServiceStub](channel, options) with PredictionService {
    override def classify(request: tensorflow.serving.classification.ClassificationRequest): scala.concurrent.Future[tensorflow.serving.classification.ClassificationResponse] = {
      scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_CLASSIFY, options), request))
    }
    
    override def regress(request: tensorflow.serving.regression.RegressionRequest): scala.concurrent.Future[tensorflow.serving.regression.RegressionResponse] = {
      scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_REGRESS, options), request))
    }
    
    override def predict(request: tensorflow.serving.predict.PredictRequest): scala.concurrent.Future[tensorflow.serving.predict.PredictResponse] = {
      scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_PREDICT, options), request))
    }
    
    override def getModelMetadata(request: tensorflow.serving.get_model_metadata.GetModelMetadataRequest): scala.concurrent.Future[tensorflow.serving.get_model_metadata.GetModelMetadataResponse] = {
      scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_GET_MODEL_METADATA, options), request))
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): PredictionServiceStub = new PredictionServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: PredictionService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_CLASSIFY,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tensorflow.serving.classification.ClassificationRequest, tensorflow.serving.classification.ClassificationResponse] {
        override def invoke(request: tensorflow.serving.classification.ClassificationRequest, observer: _root_.io.grpc.stub.StreamObserver[tensorflow.serving.classification.ClassificationResponse]): Unit =
          serviceImpl.classify(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_REGRESS,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tensorflow.serving.regression.RegressionRequest, tensorflow.serving.regression.RegressionResponse] {
        override def invoke(request: tensorflow.serving.regression.RegressionRequest, observer: _root_.io.grpc.stub.StreamObserver[tensorflow.serving.regression.RegressionResponse]): Unit =
          serviceImpl.regress(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_PREDICT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tensorflow.serving.predict.PredictRequest, tensorflow.serving.predict.PredictResponse] {
        override def invoke(request: tensorflow.serving.predict.PredictRequest, observer: _root_.io.grpc.stub.StreamObserver[tensorflow.serving.predict.PredictResponse]): Unit =
          serviceImpl.predict(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_MODEL_METADATA,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tensorflow.serving.get_model_metadata.GetModelMetadataRequest, tensorflow.serving.get_model_metadata.GetModelMetadataResponse] {
        override def invoke(request: tensorflow.serving.get_model_metadata.GetModelMetadataRequest, observer: _root_.io.grpc.stub.StreamObserver[tensorflow.serving.get_model_metadata.GetModelMetadataResponse]): Unit =
          serviceImpl.getModelMetadata(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): PredictionServiceBlockingStub = new PredictionServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): PredictionServiceStub = new PredictionServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = tensorflow.serving.prediction_service.PredictionServiceProto.javaDescriptor.getServices().get(0)
  
}