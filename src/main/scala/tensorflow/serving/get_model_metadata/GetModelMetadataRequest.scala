// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package tensorflow.serving.get_model_metadata

/** @param modelSpec
  *   Model Specification indicating which model we are querying for metadata.
  * @param metadataField
  *   Metadata fields to get. Currently supported: "signature_def".
  */
@SerialVersionUID(0L)
final case class GetModelMetadataRequest(
    modelSpec: scala.Option[tensorflow.serving.model.ModelSpec] = None,
    metadataField: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[GetModelMetadataRequest] with scalapb.lenses.Updatable[GetModelMetadataRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (modelSpec.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(modelSpec.get.serializedSize) + modelSpec.get.serializedSize }
      metadataField.foreach(metadataField => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, metadataField))
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      modelSpec.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      metadataField.foreach { __v =>
        _output__.writeString(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): tensorflow.serving.get_model_metadata.GetModelMetadataRequest = {
      var __modelSpec = this.modelSpec
      val __metadataField = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.metadataField)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __modelSpec = Option(_root_.scalapb.LiteParser.readMessage(_input__, __modelSpec.getOrElse(tensorflow.serving.model.ModelSpec.defaultInstance)))
          case 18 =>
            __metadataField += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      tensorflow.serving.get_model_metadata.GetModelMetadataRequest(
          modelSpec = __modelSpec,
          metadataField = __metadataField.result()
      )
    }
    def getModelSpec: tensorflow.serving.model.ModelSpec = modelSpec.getOrElse(tensorflow.serving.model.ModelSpec.defaultInstance)
    def clearModelSpec: GetModelMetadataRequest = copy(modelSpec = None)
    def withModelSpec(__v: tensorflow.serving.model.ModelSpec): GetModelMetadataRequest = copy(modelSpec = Option(__v))
    def clearMetadataField = copy(metadataField = _root_.scala.collection.Seq.empty)
    def addMetadataField(__vs: _root_.scala.Predef.String*): GetModelMetadataRequest = addAllMetadataField(__vs)
    def addAllMetadataField(__vs: TraversableOnce[_root_.scala.Predef.String]): GetModelMetadataRequest = copy(metadataField = metadataField ++ __vs)
    def withMetadataField(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): GetModelMetadataRequest = copy(metadataField = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => modelSpec.orNull
        case 2 => metadataField
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => modelSpec.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(metadataField.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = tensorflow.serving.get_model_metadata.GetModelMetadataRequest
}

object GetModelMetadataRequest extends scalapb.GeneratedMessageCompanion[tensorflow.serving.get_model_metadata.GetModelMetadataRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[tensorflow.serving.get_model_metadata.GetModelMetadataRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): tensorflow.serving.get_model_metadata.GetModelMetadataRequest = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    tensorflow.serving.get_model_metadata.GetModelMetadataRequest(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[tensorflow.serving.model.ModelSpec]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[tensorflow.serving.get_model_metadata.GetModelMetadataRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      tensorflow.serving.get_model_metadata.GetModelMetadataRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[tensorflow.serving.model.ModelSpec]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = GetModelMetadataProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = GetModelMetadataProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = tensorflow.serving.model.ModelSpec
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = tensorflow.serving.get_model_metadata.GetModelMetadataRequest(
  )
  implicit class GetModelMetadataRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.get_model_metadata.GetModelMetadataRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, tensorflow.serving.get_model_metadata.GetModelMetadataRequest](_l) {
    def modelSpec: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.model.ModelSpec] = field(_.getModelSpec)((c_, f_) => c_.copy(modelSpec = Option(f_)))
    def optionalModelSpec: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[tensorflow.serving.model.ModelSpec]] = field(_.modelSpec)((c_, f_) => c_.copy(modelSpec = f_))
    def metadataField: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.metadataField)((c_, f_) => c_.copy(metadataField = f_))
  }
  final val MODEL_SPEC_FIELD_NUMBER = 1
  final val METADATA_FIELD_FIELD_NUMBER = 2
}