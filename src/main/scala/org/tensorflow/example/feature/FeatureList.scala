// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.example.feature

/** Containers for sequential data.
  *
  * A FeatureList contains lists of Features.  These may hold zero or more
  * Feature values.
  *
  * FeatureLists are organized into categories by name.  The FeatureLists message
  * contains the mapping from name to FeatureList.
  */
@SerialVersionUID(0L)
final case class FeatureList(
    feature: _root_.scala.collection.Seq[org.tensorflow.example.feature.Feature] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[FeatureList] with scalapb.lenses.Updatable[FeatureList] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      feature.foreach(feature => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(feature.serializedSize) + feature.serializedSize)
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
      feature.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.example.feature.FeatureList = {
      val __feature = (_root_.scala.collection.immutable.Vector.newBuilder[org.tensorflow.example.feature.Feature] ++= this.feature)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __feature += _root_.scalapb.LiteParser.readMessage(_input__, org.tensorflow.example.feature.Feature.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      org.tensorflow.example.feature.FeatureList(
          feature = __feature.result()
      )
    }
    def clearFeature = copy(feature = _root_.scala.collection.Seq.empty)
    def addFeature(__vs: org.tensorflow.example.feature.Feature*): FeatureList = addAllFeature(__vs)
    def addAllFeature(__vs: TraversableOnce[org.tensorflow.example.feature.Feature]): FeatureList = copy(feature = feature ++ __vs)
    def withFeature(__v: _root_.scala.collection.Seq[org.tensorflow.example.feature.Feature]): FeatureList = copy(feature = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => feature
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(feature.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.example.feature.FeatureList
}

object FeatureList extends scalapb.GeneratedMessageCompanion[org.tensorflow.example.feature.FeatureList] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.example.feature.FeatureList] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.tensorflow.example.feature.FeatureList = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.tensorflow.example.feature.FeatureList(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[org.tensorflow.example.feature.Feature]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.example.feature.FeatureList] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.example.feature.FeatureList(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[org.tensorflow.example.feature.Feature]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = FeatureProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = FeatureProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = org.tensorflow.example.feature.Feature
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.example.feature.FeatureList(
  )
  implicit class FeatureListLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.example.feature.FeatureList]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.example.feature.FeatureList](_l) {
    def feature: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.tensorflow.example.feature.Feature]] = field(_.feature)((c_, f_) => c_.copy(feature = f_))
  }
  final val FEATURE_FIELD_NUMBER = 1
}