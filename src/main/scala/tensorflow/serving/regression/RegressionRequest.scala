// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package tensorflow.serving.regression

/** @param modelSpec
  *   Model Specification.
  * @param input
  *   Input data.
  */
@SerialVersionUID(0L)
final case class RegressionRequest(
    modelSpec: scala.Option[tensorflow.serving.model.ModelSpec] = None,
    input: scala.Option[tensorflow.serving.input.Input] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[RegressionRequest] with scalapb.lenses.Updatable[RegressionRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (modelSpec.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(modelSpec.get.serializedSize) + modelSpec.get.serializedSize }
      if (input.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(input.get.serializedSize) + input.get.serializedSize }
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
      input.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): tensorflow.serving.regression.RegressionRequest = {
      var __modelSpec = this.modelSpec
      var __input = this.input
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __modelSpec = Option(_root_.scalapb.LiteParser.readMessage(_input__, __modelSpec.getOrElse(tensorflow.serving.model.ModelSpec.defaultInstance)))
          case 18 =>
            __input = Option(_root_.scalapb.LiteParser.readMessage(_input__, __input.getOrElse(tensorflow.serving.input.Input.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      tensorflow.serving.regression.RegressionRequest(
          modelSpec = __modelSpec,
          input = __input
      )
    }
    def getModelSpec: tensorflow.serving.model.ModelSpec = modelSpec.getOrElse(tensorflow.serving.model.ModelSpec.defaultInstance)
    def clearModelSpec: RegressionRequest = copy(modelSpec = None)
    def withModelSpec(__v: tensorflow.serving.model.ModelSpec): RegressionRequest = copy(modelSpec = Option(__v))
    def getInput: tensorflow.serving.input.Input = input.getOrElse(tensorflow.serving.input.Input.defaultInstance)
    def clearInput: RegressionRequest = copy(input = None)
    def withInput(__v: tensorflow.serving.input.Input): RegressionRequest = copy(input = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => modelSpec.orNull
        case 2 => input.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => modelSpec.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => input.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = tensorflow.serving.regression.RegressionRequest
}

object RegressionRequest extends scalapb.GeneratedMessageCompanion[tensorflow.serving.regression.RegressionRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[tensorflow.serving.regression.RegressionRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): tensorflow.serving.regression.RegressionRequest = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    tensorflow.serving.regression.RegressionRequest(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[tensorflow.serving.model.ModelSpec]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[tensorflow.serving.input.Input]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[tensorflow.serving.regression.RegressionRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      tensorflow.serving.regression.RegressionRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[tensorflow.serving.model.ModelSpec]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[tensorflow.serving.input.Input]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = RegressionProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = RegressionProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = tensorflow.serving.model.ModelSpec
      case 2 => __out = tensorflow.serving.input.Input
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = tensorflow.serving.regression.RegressionRequest(
  )
  implicit class RegressionRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.regression.RegressionRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, tensorflow.serving.regression.RegressionRequest](_l) {
    def modelSpec: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.model.ModelSpec] = field(_.getModelSpec)((c_, f_) => c_.copy(modelSpec = Option(f_)))
    def optionalModelSpec: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[tensorflow.serving.model.ModelSpec]] = field(_.modelSpec)((c_, f_) => c_.copy(modelSpec = f_))
    def input: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.input.Input] = field(_.getInput)((c_, f_) => c_.copy(input = Option(f_)))
    def optionalInput: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[tensorflow.serving.input.Input]] = field(_.input)((c_, f_) => c_.copy(input = f_))
  }
  final val MODEL_SPEC_FIELD_NUMBER = 1
  final val INPUT_FIELD_NUMBER = 2
}
