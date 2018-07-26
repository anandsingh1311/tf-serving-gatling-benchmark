// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package tensorflow.serving.regression

@SerialVersionUID(0L)
final case class RegressionResponse(
    result: scala.Option[tensorflow.serving.regression.RegressionResult] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[RegressionResponse] with scalapb.lenses.Updatable[RegressionResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (result.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(result.get.serializedSize) + result.get.serializedSize }
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
      result.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): tensorflow.serving.regression.RegressionResponse = {
      var __result = this.result
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __result = Option(_root_.scalapb.LiteParser.readMessage(_input__, __result.getOrElse(tensorflow.serving.regression.RegressionResult.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      tensorflow.serving.regression.RegressionResponse(
          result = __result
      )
    }
    def getResult: tensorflow.serving.regression.RegressionResult = result.getOrElse(tensorflow.serving.regression.RegressionResult.defaultInstance)
    def clearResult: RegressionResponse = copy(result = None)
    def withResult(__v: tensorflow.serving.regression.RegressionResult): RegressionResponse = copy(result = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => result.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => result.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = tensorflow.serving.regression.RegressionResponse
}

object RegressionResponse extends scalapb.GeneratedMessageCompanion[tensorflow.serving.regression.RegressionResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[tensorflow.serving.regression.RegressionResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): tensorflow.serving.regression.RegressionResponse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    tensorflow.serving.regression.RegressionResponse(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[tensorflow.serving.regression.RegressionResult]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[tensorflow.serving.regression.RegressionResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      tensorflow.serving.regression.RegressionResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[tensorflow.serving.regression.RegressionResult]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = RegressionProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = RegressionProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = tensorflow.serving.regression.RegressionResult
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = tensorflow.serving.regression.RegressionResponse(
  )
  implicit class RegressionResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.regression.RegressionResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, tensorflow.serving.regression.RegressionResponse](_l) {
    def result: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.regression.RegressionResult] = field(_.getResult)((c_, f_) => c_.copy(result = Option(f_)))
    def optionalResult: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[tensorflow.serving.regression.RegressionResult]] = field(_.result)((c_, f_) => c_.copy(result = f_))
  }
  final val RESULT_FIELD_NUMBER = 1
}
