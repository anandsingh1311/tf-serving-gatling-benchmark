// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.types

sealed trait DataType extends _root_.scalapb.GeneratedEnum {
  type EnumType = DataType
  def isDtInvalid: _root_.scala.Boolean = false
  def isDtFloat: _root_.scala.Boolean = false
  def isDtDouble: _root_.scala.Boolean = false
  def isDtInt32: _root_.scala.Boolean = false
  def isDtUint8: _root_.scala.Boolean = false
  def isDtInt16: _root_.scala.Boolean = false
  def isDtInt8: _root_.scala.Boolean = false
  def isDtString: _root_.scala.Boolean = false
  def isDtComplex64: _root_.scala.Boolean = false
  def isDtInt64: _root_.scala.Boolean = false
  def isDtBool: _root_.scala.Boolean = false
  def isDtQint8: _root_.scala.Boolean = false
  def isDtQuint8: _root_.scala.Boolean = false
  def isDtQint32: _root_.scala.Boolean = false
  def isDtBfloat16: _root_.scala.Boolean = false
  def isDtQint16: _root_.scala.Boolean = false
  def isDtQuint16: _root_.scala.Boolean = false
  def isDtUint16: _root_.scala.Boolean = false
  def isDtComplex128: _root_.scala.Boolean = false
  def isDtHalf: _root_.scala.Boolean = false
  def isDtResource: _root_.scala.Boolean = false
  def isDtFloatRef: _root_.scala.Boolean = false
  def isDtDoubleRef: _root_.scala.Boolean = false
  def isDtInt32Ref: _root_.scala.Boolean = false
  def isDtUint8Ref: _root_.scala.Boolean = false
  def isDtInt16Ref: _root_.scala.Boolean = false
  def isDtInt8Ref: _root_.scala.Boolean = false
  def isDtStringRef: _root_.scala.Boolean = false
  def isDtComplex64Ref: _root_.scala.Boolean = false
  def isDtInt64Ref: _root_.scala.Boolean = false
  def isDtBoolRef: _root_.scala.Boolean = false
  def isDtQint8Ref: _root_.scala.Boolean = false
  def isDtQuint8Ref: _root_.scala.Boolean = false
  def isDtQint32Ref: _root_.scala.Boolean = false
  def isDtBfloat16Ref: _root_.scala.Boolean = false
  def isDtQint16Ref: _root_.scala.Boolean = false
  def isDtQuint16Ref: _root_.scala.Boolean = false
  def isDtUint16Ref: _root_.scala.Boolean = false
  def isDtComplex128Ref: _root_.scala.Boolean = false
  def isDtHalfRef: _root_.scala.Boolean = false
  def isDtResourceRef: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[DataType] = org.tensorflow.framework.types.DataType
}

object DataType extends _root_.scalapb.GeneratedEnumCompanion[DataType] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[DataType] = this
  @SerialVersionUID(0L)
  case object DT_INVALID extends DataType {
    val value = 0
    val index = 0
    val name = "DT_INVALID"
    override def isDtInvalid: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_FLOAT extends DataType {
    val value = 1
    val index = 1
    val name = "DT_FLOAT"
    override def isDtFloat: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_DOUBLE extends DataType {
    val value = 2
    val index = 2
    val name = "DT_DOUBLE"
    override def isDtDouble: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT32 extends DataType {
    val value = 3
    val index = 3
    val name = "DT_INT32"
    override def isDtInt32: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_UINT8 extends DataType {
    val value = 4
    val index = 4
    val name = "DT_UINT8"
    override def isDtUint8: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT16 extends DataType {
    val value = 5
    val index = 5
    val name = "DT_INT16"
    override def isDtInt16: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT8 extends DataType {
    val value = 6
    val index = 6
    val name = "DT_INT8"
    override def isDtInt8: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_STRING extends DataType {
    val value = 7
    val index = 7
    val name = "DT_STRING"
    override def isDtString: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_COMPLEX64 extends DataType {
    val value = 8
    val index = 8
    val name = "DT_COMPLEX64"
    override def isDtComplex64: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT64 extends DataType {
    val value = 9
    val index = 9
    val name = "DT_INT64"
    override def isDtInt64: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_BOOL extends DataType {
    val value = 10
    val index = 10
    val name = "DT_BOOL"
    override def isDtBool: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT8 extends DataType {
    val value = 11
    val index = 11
    val name = "DT_QINT8"
    override def isDtQint8: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QUINT8 extends DataType {
    val value = 12
    val index = 12
    val name = "DT_QUINT8"
    override def isDtQuint8: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT32 extends DataType {
    val value = 13
    val index = 13
    val name = "DT_QINT32"
    override def isDtQint32: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_BFLOAT16 extends DataType {
    val value = 14
    val index = 14
    val name = "DT_BFLOAT16"
    override def isDtBfloat16: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT16 extends DataType {
    val value = 15
    val index = 15
    val name = "DT_QINT16"
    override def isDtQint16: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QUINT16 extends DataType {
    val value = 16
    val index = 16
    val name = "DT_QUINT16"
    override def isDtQuint16: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_UINT16 extends DataType {
    val value = 17
    val index = 17
    val name = "DT_UINT16"
    override def isDtUint16: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_COMPLEX128 extends DataType {
    val value = 18
    val index = 18
    val name = "DT_COMPLEX128"
    override def isDtComplex128: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_HALF extends DataType {
    val value = 19
    val index = 19
    val name = "DT_HALF"
    override def isDtHalf: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_RESOURCE extends DataType {
    val value = 20
    val index = 20
    val name = "DT_RESOURCE"
    override def isDtResource: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_FLOAT_REF extends DataType {
    val value = 101
    val index = 21
    val name = "DT_FLOAT_REF"
    override def isDtFloatRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_DOUBLE_REF extends DataType {
    val value = 102
    val index = 22
    val name = "DT_DOUBLE_REF"
    override def isDtDoubleRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT32_REF extends DataType {
    val value = 103
    val index = 23
    val name = "DT_INT32_REF"
    override def isDtInt32Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_UINT8_REF extends DataType {
    val value = 104
    val index = 24
    val name = "DT_UINT8_REF"
    override def isDtUint8Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT16_REF extends DataType {
    val value = 105
    val index = 25
    val name = "DT_INT16_REF"
    override def isDtInt16Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT8_REF extends DataType {
    val value = 106
    val index = 26
    val name = "DT_INT8_REF"
    override def isDtInt8Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_STRING_REF extends DataType {
    val value = 107
    val index = 27
    val name = "DT_STRING_REF"
    override def isDtStringRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_COMPLEX64_REF extends DataType {
    val value = 108
    val index = 28
    val name = "DT_COMPLEX64_REF"
    override def isDtComplex64Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_INT64_REF extends DataType {
    val value = 109
    val index = 29
    val name = "DT_INT64_REF"
    override def isDtInt64Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_BOOL_REF extends DataType {
    val value = 110
    val index = 30
    val name = "DT_BOOL_REF"
    override def isDtBoolRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT8_REF extends DataType {
    val value = 111
    val index = 31
    val name = "DT_QINT8_REF"
    override def isDtQint8Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QUINT8_REF extends DataType {
    val value = 112
    val index = 32
    val name = "DT_QUINT8_REF"
    override def isDtQuint8Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT32_REF extends DataType {
    val value = 113
    val index = 33
    val name = "DT_QINT32_REF"
    override def isDtQint32Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_BFLOAT16_REF extends DataType {
    val value = 114
    val index = 34
    val name = "DT_BFLOAT16_REF"
    override def isDtBfloat16Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QINT16_REF extends DataType {
    val value = 115
    val index = 35
    val name = "DT_QINT16_REF"
    override def isDtQint16Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_QUINT16_REF extends DataType {
    val value = 116
    val index = 36
    val name = "DT_QUINT16_REF"
    override def isDtQuint16Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_UINT16_REF extends DataType {
    val value = 117
    val index = 37
    val name = "DT_UINT16_REF"
    override def isDtUint16Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_COMPLEX128_REF extends DataType {
    val value = 118
    val index = 38
    val name = "DT_COMPLEX128_REF"
    override def isDtComplex128Ref: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_HALF_REF extends DataType {
    val value = 119
    val index = 39
    val name = "DT_HALF_REF"
    override def isDtHalfRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object DT_RESOURCE_REF extends DataType {
    val value = 120
    val index = 40
    val name = "DT_RESOURCE_REF"
    override def isDtResourceRef: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends DataType with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(DT_INVALID, DT_FLOAT, DT_DOUBLE, DT_INT32, DT_UINT8, DT_INT16, DT_INT8, DT_STRING, DT_COMPLEX64, DT_INT64, DT_BOOL, DT_QINT8, DT_QUINT8, DT_QINT32, DT_BFLOAT16, DT_QINT16, DT_QUINT16, DT_UINT16, DT_COMPLEX128, DT_HALF, DT_RESOURCE, DT_FLOAT_REF, DT_DOUBLE_REF, DT_INT32_REF, DT_UINT8_REF, DT_INT16_REF, DT_INT8_REF, DT_STRING_REF, DT_COMPLEX64_REF, DT_INT64_REF, DT_BOOL_REF, DT_QINT8_REF, DT_QUINT8_REF, DT_QINT32_REF, DT_BFLOAT16_REF, DT_QINT16_REF, DT_QUINT16_REF, DT_UINT16_REF, DT_COMPLEX128_REF, DT_HALF_REF, DT_RESOURCE_REF)
  def fromValue(value: _root_.scala.Int): DataType = value match {
    case 0 => DT_INVALID
    case 1 => DT_FLOAT
    case 2 => DT_DOUBLE
    case 3 => DT_INT32
    case 4 => DT_UINT8
    case 5 => DT_INT16
    case 6 => DT_INT8
    case 7 => DT_STRING
    case 8 => DT_COMPLEX64
    case 9 => DT_INT64
    case 10 => DT_BOOL
    case 11 => DT_QINT8
    case 12 => DT_QUINT8
    case 13 => DT_QINT32
    case 14 => DT_BFLOAT16
    case 15 => DT_QINT16
    case 16 => DT_QUINT16
    case 17 => DT_UINT16
    case 18 => DT_COMPLEX128
    case 19 => DT_HALF
    case 20 => DT_RESOURCE
    case 101 => DT_FLOAT_REF
    case 102 => DT_DOUBLE_REF
    case 103 => DT_INT32_REF
    case 104 => DT_UINT8_REF
    case 105 => DT_INT16_REF
    case 106 => DT_INT8_REF
    case 107 => DT_STRING_REF
    case 108 => DT_COMPLEX64_REF
    case 109 => DT_INT64_REF
    case 110 => DT_BOOL_REF
    case 111 => DT_QINT8_REF
    case 112 => DT_QUINT8_REF
    case 113 => DT_QINT32_REF
    case 114 => DT_BFLOAT16_REF
    case 115 => DT_QINT16_REF
    case 116 => DT_QUINT16_REF
    case 117 => DT_UINT16_REF
    case 118 => DT_COMPLEX128_REF
    case 119 => DT_HALF_REF
    case 120 => DT_RESOURCE_REF
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = TypesProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = TypesProto.scalaDescriptor.enums(0)
}