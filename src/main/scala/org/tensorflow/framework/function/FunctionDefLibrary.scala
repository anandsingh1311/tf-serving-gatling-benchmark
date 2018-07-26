// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.function

/** A library is a set of named functions.
  */
@SerialVersionUID(0L)
final case class FunctionDefLibrary(
    function: _root_.scala.collection.Seq[org.tensorflow.framework.function.FunctionDef] = _root_.scala.collection.Seq.empty,
    gradient: _root_.scala.collection.Seq[org.tensorflow.framework.function.GradientDef] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[FunctionDefLibrary] with scalapb.lenses.Updatable[FunctionDefLibrary] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      function.foreach(function => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(function.serializedSize) + function.serializedSize)
      gradient.foreach(gradient => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(gradient.serializedSize) + gradient.serializedSize)
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
      function.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      gradient.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.function.FunctionDefLibrary = {
      val __function = (_root_.scala.collection.immutable.Vector.newBuilder[org.tensorflow.framework.function.FunctionDef] ++= this.function)
      val __gradient = (_root_.scala.collection.immutable.Vector.newBuilder[org.tensorflow.framework.function.GradientDef] ++= this.gradient)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __function += _root_.scalapb.LiteParser.readMessage(_input__, org.tensorflow.framework.function.FunctionDef.defaultInstance)
          case 18 =>
            __gradient += _root_.scalapb.LiteParser.readMessage(_input__, org.tensorflow.framework.function.GradientDef.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      org.tensorflow.framework.function.FunctionDefLibrary(
          function = __function.result(),
          gradient = __gradient.result()
      )
    }
    def clearFunction = copy(function = _root_.scala.collection.Seq.empty)
    def addFunction(__vs: org.tensorflow.framework.function.FunctionDef*): FunctionDefLibrary = addAllFunction(__vs)
    def addAllFunction(__vs: TraversableOnce[org.tensorflow.framework.function.FunctionDef]): FunctionDefLibrary = copy(function = function ++ __vs)
    def withFunction(__v: _root_.scala.collection.Seq[org.tensorflow.framework.function.FunctionDef]): FunctionDefLibrary = copy(function = __v)
    def clearGradient = copy(gradient = _root_.scala.collection.Seq.empty)
    def addGradient(__vs: org.tensorflow.framework.function.GradientDef*): FunctionDefLibrary = addAllGradient(__vs)
    def addAllGradient(__vs: TraversableOnce[org.tensorflow.framework.function.GradientDef]): FunctionDefLibrary = copy(gradient = gradient ++ __vs)
    def withGradient(__v: _root_.scala.collection.Seq[org.tensorflow.framework.function.GradientDef]): FunctionDefLibrary = copy(gradient = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => function
        case 2 => gradient
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(function.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PRepeated(gradient.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.function.FunctionDefLibrary
}

object FunctionDefLibrary extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.function.FunctionDefLibrary] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.function.FunctionDefLibrary] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.tensorflow.framework.function.FunctionDefLibrary = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.tensorflow.framework.function.FunctionDefLibrary(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[org.tensorflow.framework.function.FunctionDef]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[org.tensorflow.framework.function.GradientDef]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.function.FunctionDefLibrary] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.function.FunctionDefLibrary(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[org.tensorflow.framework.function.FunctionDef]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[org.tensorflow.framework.function.GradientDef]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = FunctionProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = FunctionProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = org.tensorflow.framework.function.FunctionDef
      case 2 => __out = org.tensorflow.framework.function.GradientDef
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.function.FunctionDefLibrary(
  )
  implicit class FunctionDefLibraryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.function.FunctionDefLibrary]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.function.FunctionDefLibrary](_l) {
    def function: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.tensorflow.framework.function.FunctionDef]] = field(_.function)((c_, f_) => c_.copy(function = f_))
    def gradient: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.tensorflow.framework.function.GradientDef]] = field(_.gradient)((c_, f_) => c_.copy(gradient = f_))
  }
  final val FUNCTION_FIELD_NUMBER = 1
  final val GRADIENT_FIELD_NUMBER = 2
}