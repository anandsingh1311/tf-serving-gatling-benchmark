// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.tensor

object TensorProtoCompanion extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    org.tensorflow.framework.resource_handle.ResourceHandleProto,
    org.tensorflow.framework.tensor_shape.TensorShapeProtoCompanion,
    org.tensorflow.framework.types.TypesProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    org.tensorflow.framework.tensor.TensorProto
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CiZ0ZW5zb3JmbG93L2NvcmUvZnJhbWV3b3JrL3RlbnNvci5wcm90bxIKdGVuc29yZmxvdxovdGVuc29yZmxvdy9jb3JlL2ZyY
  W1ld29yay9yZXNvdXJjZV9oYW5kbGUucHJvdG8aLHRlbnNvcmZsb3cvY29yZS9mcmFtZXdvcmsvdGVuc29yX3NoYXBlLnByb3RvG
  iV0ZW5zb3JmbG93L2NvcmUvZnJhbWV3b3JrL3R5cGVzLnByb3RvIsEECgtUZW5zb3JQcm90bxIqCgVkdHlwZRgBIAEoDjIULnRlb
  nNvcmZsb3cuRGF0YVR5cGVSBWR0eXBlEj8KDHRlbnNvcl9zaGFwZRgCIAEoCzIcLnRlbnNvcmZsb3cuVGVuc29yU2hhcGVQcm90b
  1ILdGVuc29yU2hhcGUSJQoOdmVyc2lvbl9udW1iZXIYAyABKAVSDXZlcnNpb25OdW1iZXISJQoOdGVuc29yX2NvbnRlbnQYBCABK
  AxSDXRlbnNvckNvbnRlbnQSHQoIaGFsZl92YWwYDSADKAVCAhABUgdoYWxmVmFsEh8KCWZsb2F0X3ZhbBgFIAMoAkICEAFSCGZsb
  2F0VmFsEiEKCmRvdWJsZV92YWwYBiADKAFCAhABUglkb3VibGVWYWwSGwoHaW50X3ZhbBgHIAMoBUICEAFSBmludFZhbBIdCgpzd
  HJpbmdfdmFsGAggAygMUglzdHJpbmdWYWwSJQoMc2NvbXBsZXhfdmFsGAkgAygCQgIQAVILc2NvbXBsZXhWYWwSHwoJaW50NjRfd
  mFsGAogAygDQgIQAVIIaW50NjRWYWwSHQoIYm9vbF92YWwYCyADKAhCAhABUgdib29sVmFsEiUKDGRjb21wbGV4X3ZhbBgMIAMoA
  UICEAFSC2Rjb21wbGV4VmFsEkoKE3Jlc291cmNlX2hhbmRsZV92YWwYDiADKAsyGi50ZW5zb3JmbG93LlJlc291cmNlSGFuZGxlU
  hFyZXNvdXJjZUhhbmRsZVZhbEItChhvcmcudGVuc29yZmxvdy5mcmFtZXdvcmtCDFRlbnNvclByb3Rvc1AB+AEBYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      org.tensorflow.framework.resource_handle.ResourceHandleProto.javaDescriptor,
      org.tensorflow.framework.tensor_shape.TensorShapeProtoCompanion.javaDescriptor,
      org.tensorflow.framework.types.TypesProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}