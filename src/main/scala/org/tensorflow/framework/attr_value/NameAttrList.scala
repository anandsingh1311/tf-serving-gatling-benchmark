// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.attr_value

/** A list of attr names and their values. The whole list is attached
  * with a string name.  E.g., MatMul[T=float].
  */
@SerialVersionUID(0L)
final case class NameAttrList(
    name: _root_.scala.Predef.String = "",
    attr: scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue] = scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[NameAttrList] with scalapb.lenses.Updatable[NameAttrList] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      attr.foreach(attr => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase(attr).serializedSize) + org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase(attr).serializedSize)
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      attr.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase(__v).serializedSize)
        org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase(__v).writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.attr_value.NameAttrList = {
      var __name = this.name
      val __attr = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue] ++= this.attr)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __attr += org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, org.tensorflow.framework.attr_value.NameAttrList.AttrEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      org.tensorflow.framework.attr_value.NameAttrList(
          name = __name,
          attr = __attr.result()
      )
    }
    def withName(__v: _root_.scala.Predef.String): NameAttrList = copy(name = __v)
    def clearAttr = copy(attr = scala.collection.immutable.Map.empty)
    def addAttr(__vs: (_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)*): NameAttrList = addAllAttr(__vs)
    def addAllAttr(__vs: TraversableOnce[(_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)]): NameAttrList = copy(attr = attr ++ __vs)
    def withAttr(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue]): NameAttrList = copy(attr = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => attr.map(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(attr.map(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.attr_value.NameAttrList
}

object NameAttrList extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.attr_value.NameAttrList] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.attr_value.NameAttrList] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.tensorflow.framework.attr_value.NameAttrList = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.tensorflow.framework.attr_value.NameAttrList(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry]].map(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toCustom)(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.attr_value.NameAttrList] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.attr_value.NameAttrList(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(org.tensorflow.framework.attr_value.NameAttrList._typemapper_attr.toCustom)(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AttrValueProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AttrValueProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = org.tensorflow.framework.attr_value.NameAttrList.AttrEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.org.tensorflow.framework.attr_value.NameAttrList.AttrEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.attr_value.NameAttrList(
  )
  @SerialVersionUID(0L)
  final case class AttrEntry(
      key: _root_.scala.Predef.String = "",
      value: scala.Option[org.tensorflow.framework.attr_value.AttrValue] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[AttrEntry] with scalapb.lenses.Updatable[AttrEntry] {
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
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.attr_value.NameAttrList.AttrEntry = {
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
              __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(org.tensorflow.framework.attr_value.AttrValue.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        org.tensorflow.framework.attr_value.NameAttrList.AttrEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): AttrEntry = copy(key = __v)
      def getValue: org.tensorflow.framework.attr_value.AttrValue = value.getOrElse(org.tensorflow.framework.attr_value.AttrValue.defaultInstance)
      def clearValue: AttrEntry = copy(value = None)
      def withValue(__v: org.tensorflow.framework.attr_value.AttrValue): AttrEntry = copy(value = Option(__v))
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
      def companion = org.tensorflow.framework.attr_value.NameAttrList.AttrEntry
  }
  
  object AttrEntry extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.tensorflow.framework.attr_value.NameAttrList.AttrEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      org.tensorflow.framework.attr_value.NameAttrList.AttrEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.tensorflow.framework.attr_value.AttrValue]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        org.tensorflow.framework.attr_value.NameAttrList.AttrEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.tensorflow.framework.attr_value.AttrValue]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = org.tensorflow.framework.attr_value.NameAttrList.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = org.tensorflow.framework.attr_value.NameAttrList.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = org.tensorflow.framework.attr_value.AttrValue
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = org.tensorflow.framework.attr_value.NameAttrList.AttrEntry(
    )
    implicit class AttrEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.attr_value.NameAttrList.AttrEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.attr_value.NameAttrList.AttrEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.attr_value.AttrValue] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[org.tensorflow.framework.attr_value.AttrValue]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry, (_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)] =
      _root_.scalapb.TypeMapper[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry, (_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)](__m => (__m.key, __m.getValue))(__p => org.tensorflow.framework.attr_value.NameAttrList.AttrEntry(__p._1, Some(__p._2)))
  }
  
  implicit class NameAttrListLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.attr_value.NameAttrList]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.attr_value.NameAttrList](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def attr: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue]] = field(_.attr)((c_, f_) => c_.copy(attr = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val ATTR_FIELD_NUMBER = 2
  @transient
  private val _typemapper_attr: _root_.scalapb.TypeMapper[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry, (_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)] = implicitly[_root_.scalapb.TypeMapper[org.tensorflow.framework.attr_value.NameAttrList.AttrEntry, (_root_.scala.Predef.String, org.tensorflow.framework.attr_value.AttrValue)]]
}