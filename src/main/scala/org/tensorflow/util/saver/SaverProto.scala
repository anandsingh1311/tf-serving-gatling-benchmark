// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.util.saver

object SaverProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    org.tensorflow.util.saver.SaverDef
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CiR0ZW5zb3JmbG93L2NvcmUvcHJvdG9idWYvc2F2ZXIucHJvdG8SCnRlbnNvcmZsb3ciiQMKCFNhdmVyRGVmEjAKFGZpbGVuY
  W1lX3RlbnNvcl9uYW1lGAEgASgJUhJmaWxlbmFtZVRlbnNvck5hbWUSKAoQc2F2ZV90ZW5zb3JfbmFtZRgCIAEoCVIOc2F2ZVRlb
  nNvck5hbWUSJgoPcmVzdG9yZV9vcF9uYW1lGAMgASgJUg1yZXN0b3JlT3BOYW1lEh4KC21heF90b19rZWVwGAQgASgFUgltYXhUb
  0tlZXASGAoHc2hhcmRlZBgFIAEoCFIHc2hhcmRlZBJACh1rZWVwX2NoZWNrcG9pbnRfZXZlcnlfbl9ob3VycxgGIAEoAlIZa2Vlc
  ENoZWNrcG9pbnRFdmVyeU5Ib3VycxJGCgd2ZXJzaW9uGAcgASgOMiwudGVuc29yZmxvdy5TYXZlckRlZi5DaGVja3BvaW50Rm9yb
  WF0VmVyc2lvblIHdmVyc2lvbiI1ChdDaGVja3BvaW50Rm9ybWF0VmVyc2lvbhIKCgZMRUdBQ1kQABIGCgJWMRABEgYKAlYyEAJCJ
  woTb3JnLnRlbnNvcmZsb3cudXRpbEILU2F2ZXJQcm90b3NQAfgBAWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}