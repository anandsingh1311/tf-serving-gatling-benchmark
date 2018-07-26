// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.tensorflow.framework.graph

/** Represents the graph of operations
  *
  * @param versions
  *   Compatibility versions of the graph.  See core/public/version.h for version
  *   history.  The GraphDef version is distinct from the TensorFlow version, and
  *   each release of TensorFlow will support a range of GraphDef versions.
  * @param version
  *   Deprecated single version field; use versions above instead.  Since all
  *   GraphDef changes before "versions" was introduced were forward
  *   compatible, this field is entirely ignored.
  * @param library
  *   EXPERIMENTAL. DO NOT USE OR DEPEND ON THIS YET.
  *  
  *   "library" provides user-defined functions.
  *  
  *   Naming:
  *     * library.function.name are in a flat namespace.
  *       NOTE: We may need to change it to be hierarchical to support
  *       different orgs. E.g.,
  *       { "/google/nn", { ... }},
  *       { "/google/vision", { ... }}
  *       { "/org_foo/module_bar", { ... }}
  *       map&lt;string, FunctionDefLib&gt; named_lib;
  *     * If node[i].op is the name of one function in "library",
  *       node[i] is deemed as a function call. Otherwise, node[i].op
  *       must be a primitive operation supported by the runtime.
  *  
  *  
  *   Function call semantics:
  *  
  *     * The callee may start execution as soon as some of its inputs
  *       are ready. The caller may want to use Tuple() mechanism to
  *       ensure all inputs are ready in the same time.
  *  
  *     * The consumer of return values may start executing as soon as
  *       the return values the consumer depends on are ready.  The
  *       consumer may want to use Tuple() mechanism to ensure the
  *       consumer does not start until all return values of the callee
  *       function are ready.
  */
@SerialVersionUID(0L)
final case class GraphDef(
    node: _root_.scala.collection.Seq[org.tensorflow.framework.node_def.NodeDef] = _root_.scala.collection.Seq.empty,
    versions: scala.Option[org.tensorflow.framework.versions.VersionDef] = None,
    @scala.deprecated(message="Marked as deprecated in proto file", "") version: _root_.scala.Int = 0,
    library: scala.Option[org.tensorflow.framework.function.FunctionDefLibrary] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[GraphDef] with scalapb.lenses.Updatable[GraphDef] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      node.foreach(node => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(node.serializedSize) + node.serializedSize)
      if (versions.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(versions.get.serializedSize) + versions.get.serializedSize }
      if (version != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, version) }
      if (library.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(library.get.serializedSize) + library.get.serializedSize }
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
      node.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      library.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = version
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      versions.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.tensorflow.framework.graph.GraphDef = {
      val __node = (_root_.scala.collection.immutable.Vector.newBuilder[org.tensorflow.framework.node_def.NodeDef] ++= this.node)
      var __versions = this.versions
      var __version = this.version
      var __library = this.library
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __node += _root_.scalapb.LiteParser.readMessage(_input__, org.tensorflow.framework.node_def.NodeDef.defaultInstance)
          case 34 =>
            __versions = Option(_root_.scalapb.LiteParser.readMessage(_input__, __versions.getOrElse(org.tensorflow.framework.versions.VersionDef.defaultInstance)))
          case 24 =>
            __version = _input__.readInt32()
          case 18 =>
            __library = Option(_root_.scalapb.LiteParser.readMessage(_input__, __library.getOrElse(org.tensorflow.framework.function.FunctionDefLibrary.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      org.tensorflow.framework.graph.GraphDef(
          node = __node.result(),
          versions = __versions,
          version = __version,
          library = __library
      )
    }
    def clearNode = copy(node = _root_.scala.collection.Seq.empty)
    def addNode(__vs: org.tensorflow.framework.node_def.NodeDef*): GraphDef = addAllNode(__vs)
    def addAllNode(__vs: TraversableOnce[org.tensorflow.framework.node_def.NodeDef]): GraphDef = copy(node = node ++ __vs)
    def withNode(__v: _root_.scala.collection.Seq[org.tensorflow.framework.node_def.NodeDef]): GraphDef = copy(node = __v)
    def getVersions: org.tensorflow.framework.versions.VersionDef = versions.getOrElse(org.tensorflow.framework.versions.VersionDef.defaultInstance)
    def clearVersions: GraphDef = copy(versions = None)
    def withVersions(__v: org.tensorflow.framework.versions.VersionDef): GraphDef = copy(versions = Option(__v))
    def withVersion(__v: _root_.scala.Int): GraphDef = copy(version = __v)
    def getLibrary: org.tensorflow.framework.function.FunctionDefLibrary = library.getOrElse(org.tensorflow.framework.function.FunctionDefLibrary.defaultInstance)
    def clearLibrary: GraphDef = copy(library = None)
    def withLibrary(__v: org.tensorflow.framework.function.FunctionDefLibrary): GraphDef = copy(library = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => node
        case 4 => versions.orNull
        case 3 => {
          val __t = version
          if (__t != 0) __t else null
        }
        case 2 => library.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(node.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4 => versions.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PInt(version)
        case 2 => library.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.tensorflow.framework.graph.GraphDef
}

object GraphDef extends scalapb.GeneratedMessageCompanion[org.tensorflow.framework.graph.GraphDef] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.tensorflow.framework.graph.GraphDef] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.tensorflow.framework.graph.GraphDef = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.tensorflow.framework.graph.GraphDef(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[org.tensorflow.framework.node_def.NodeDef]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.tensorflow.framework.versions.VersionDef]],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[org.tensorflow.framework.function.FunctionDefLibrary]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.tensorflow.framework.graph.GraphDef] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.tensorflow.framework.graph.GraphDef(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[org.tensorflow.framework.node_def.NodeDef]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[org.tensorflow.framework.versions.VersionDef]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.tensorflow.framework.function.FunctionDefLibrary]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = GraphProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = GraphProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = org.tensorflow.framework.node_def.NodeDef
      case 4 => __out = org.tensorflow.framework.versions.VersionDef
      case 2 => __out = org.tensorflow.framework.function.FunctionDefLibrary
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.tensorflow.framework.graph.GraphDef(
  )
  implicit class GraphDefLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.graph.GraphDef]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.tensorflow.framework.graph.GraphDef](_l) {
    def node: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.tensorflow.framework.node_def.NodeDef]] = field(_.node)((c_, f_) => c_.copy(node = f_))
    def versions: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.versions.VersionDef] = field(_.getVersions)((c_, f_) => c_.copy(versions = Option(f_)))
    def optionalVersions: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[org.tensorflow.framework.versions.VersionDef]] = field(_.versions)((c_, f_) => c_.copy(versions = f_))
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def library: _root_.scalapb.lenses.Lens[UpperPB, org.tensorflow.framework.function.FunctionDefLibrary] = field(_.getLibrary)((c_, f_) => c_.copy(library = Option(f_)))
    def optionalLibrary: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[org.tensorflow.framework.function.FunctionDefLibrary]] = field(_.library)((c_, f_) => c_.copy(library = f_))
  }
  final val NODE_FIELD_NUMBER = 1
  final val VERSIONS_FIELD_NUMBER = 4
  final val VERSION_FIELD_NUMBER = 3
  final val LIBRARY_FIELD_NUMBER = 2
}