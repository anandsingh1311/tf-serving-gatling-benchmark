// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package tensorflow.serving.predict

/** Response for PredictRequest on successful run.
  *
  * @param outputs
  *   Output tensors.
  */
@SerialVersionUID(0L)
final case class PredictResponse(
    outputs: scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto] = scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[PredictResponse] with scalapb.lenses.Updatable[PredictResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      outputs.foreach(outputs => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase(outputs).serializedSize) + tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase(outputs).serializedSize)
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
      outputs.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase(__v).serializedSize)
        tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase(__v).writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): tensorflow.serving.predict.PredictResponse = {
      val __outputs = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto] ++= this.outputs)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __outputs += tensorflow.serving.predict.PredictResponse._typemapper_outputs.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, tensorflow.serving.predict.PredictResponse.OutputsEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      tensorflow.serving.predict.PredictResponse(
          outputs = __outputs.result()
      )
    }
    def clearOutputs = copy(outputs = scala.collection.immutable.Map.empty)
    def addOutputs(__vs: (_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)*): PredictResponse = addAllOutputs(__vs)
    def addAllOutputs(__vs: TraversableOnce[(_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)]): PredictResponse = copy(outputs = outputs ++ __vs)
    def withOutputs(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto]): PredictResponse = copy(outputs = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => outputs.map(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(outputs.map(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = tensorflow.serving.predict.PredictResponse
}

object PredictResponse extends scalapb.GeneratedMessageCompanion[tensorflow.serving.predict.PredictResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[tensorflow.serving.predict.PredictResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): tensorflow.serving.predict.PredictResponse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    tensorflow.serving.predict.PredictResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[tensorflow.serving.predict.PredictResponse.OutputsEntry]].map(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toCustom)(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[tensorflow.serving.predict.PredictResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      tensorflow.serving.predict.PredictResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[tensorflow.serving.predict.PredictResponse.OutputsEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(tensorflow.serving.predict.PredictResponse._typemapper_outputs.toCustom)(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PredictProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PredictProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = tensorflow.serving.predict.PredictResponse.OutputsEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.tensorflow.serving.predict.PredictResponse.OutputsEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = tensorflow.serving.predict.PredictResponse(
  )
  @SerialVersionUID(0L)
  final case class OutputsEntry(
      key: _root_.scala.Predef.String = "",
      value: scala.Option[org.tensorflow.framework.tensor.TensorProto] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[OutputsEntry] with scalapb.lenses.Updatable[OutputsEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key) }
        if (value.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get.serializedSize) + value.get.serializedSize }
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
        {
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): tensorflow.serving.predict.PredictResponse.OutputsEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(org.tensorflow.framework.tensor.TensorProto.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        tensorflow.serving.predict.PredictResponse.OutputsEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): OutputsEntry = copy(key = __v)
      def getValue: org.tensorflow.framework.tensor.TensorProto = value.getOrElse(org.tensorflow.framework.tensor.TensorProto.defaultInstance)
      def clearValue: OutputsEntry = copy(value = None)
      def withValue(__v: org.tensorflow.framework.tensor.TensorProto): OutputsEntry = copy(value = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = tensorflow.serving.predict.PredictResponse.OutputsEntry
  }
  
  object OutputsEntry extends scalapb.GeneratedMessageCompanion[tensorflow.serving.predict.PredictResponse.OutputsEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[tensorflow.serving.predict.PredictResponse.OutputsEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): tensorflow.serving.predict.PredictResponse.OutputsEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      tensorflow.serving.predict.PredictResponse.OutputsEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.tensorflow.framework.tensor.TensorProto]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[tensorflow.serving.predict.PredictResponse.OutputsEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        tensorflow.serving.predict.PredictResponse.OutputsEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.tensorflow.framework.tensor.TensorProto]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = tensorflow.serving.predict.PredictResponse.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = tensorflow.serving.predict.PredictResponse.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = org.tensorflow.framework.tensor.TensorProto
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = tensorflow.serving.predict.PredictResponse.OutputsEntry(
    )
    implicit class OutputsEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.predict.PredictResponse.OutputsEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, tensorflow.serving.predict.PredictResponse.OutputsEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.tensor.TensorProto] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[org.tensorflow.framework.tensor.TensorProto]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[tensorflow.serving.predict.PredictResponse.OutputsEntry, (_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)] =
      _root_.scalapb.TypeMapper[tensorflow.serving.predict.PredictResponse.OutputsEntry, (_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)](__m => (__m.key, __m.getValue))(__p => tensorflow.serving.predict.PredictResponse.OutputsEntry(__p._1, Some(__p._2)))
  }
  
  implicit class PredictResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, tensorflow.serving.predict.PredictResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, tensorflow.serving.predict.PredictResponse](_l) {
    def outputs: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto]] = field(_.outputs)((c_, f_) => c_.copy(outputs = f_))
  }
  final val OUTPUTS_FIELD_NUMBER = 1
  @transient
  private val _typemapper_outputs: _root_.scalapb.TypeMapper[tensorflow.serving.predict.PredictResponse.OutputsEntry, (_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)] = implicitly[_root_.scalapb.TypeMapper[tensorflow.serving.predict.PredictResponse.OutputsEntry, (_root_.scala.Predef.String, org.tensorflow.framework.tensor.TensorProto)]]
}