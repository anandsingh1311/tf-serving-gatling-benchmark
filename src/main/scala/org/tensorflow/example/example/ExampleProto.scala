// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.example.example

object ExampleProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    org.tensorflow.example.feature.FeatureProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    org.tensorflow.example.example.Example,
    org.tensorflow.example.example.SequenceExample
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CiV0ZW5zb3JmbG93L2NvcmUvZXhhbXBsZS9leGFtcGxlLnByb3RvEgp0ZW5zb3JmbG93GiV0ZW5zb3JmbG93L2NvcmUvZXhhb
  XBsZS9mZWF0dXJlLnByb3RvIjsKB0V4YW1wbGUSMAoIZmVhdHVyZXMYASABKAsyFC50ZW5zb3JmbG93LkZlYXR1cmVzUghmZWF0d
  XJlcyKAAQoPU2VxdWVuY2VFeGFtcGxlEi4KB2NvbnRleHQYASABKAsyFC50ZW5zb3JmbG93LkZlYXR1cmVzUgdjb250ZXh0Ej0KD
  WZlYXR1cmVfbGlzdHMYAiABKAsyGC50ZW5zb3JmbG93LkZlYXR1cmVMaXN0c1IMZmVhdHVyZUxpc3RzQiwKFm9yZy50ZW5zb3Jmb
  G93LmV4YW1wbGVCDUV4YW1wbGVQcm90b3NQAfgBAWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      org.tensorflow.example.feature.FeatureProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}