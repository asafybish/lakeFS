// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.treeverse.clients.catalog

@SerialVersionUID(0L)
final case class Entry(
    address: _root_.scala.Predef.String = "",
    lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
    size: _root_.scala.Long = 0L,
    eTag: _root_.scala.Predef.String = "",
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = _root_.scala.collection.immutable.Map.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Entry] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = address
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (lastModified.isDefined) {
        val __value = lastModified.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = size
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(3, __value)
        }
      };
      
      {
        val __value = eTag
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      metadata.foreach { __item =>
        val __value = io.treeverse.clients.catalog.Entry._typemapper_metadata.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = address
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      lastModified.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = size
        if (__v != 0L) {
          _output__.writeInt64(3, __v)
        }
      };
      {
        val __v = eTag
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      metadata.foreach { __v =>
        val __m = io.treeverse.clients.catalog.Entry._typemapper_metadata.toBase(__v)
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withAddress(__v: _root_.scala.Predef.String): Entry = copy(address = __v)
    def getLastModified: com.google.protobuf.timestamp.Timestamp = lastModified.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearLastModified: Entry = copy(lastModified = _root_.scala.None)
    def withLastModified(__v: com.google.protobuf.timestamp.Timestamp): Entry = copy(lastModified = Option(__v))
    def withSize(__v: _root_.scala.Long): Entry = copy(size = __v)
    def withETag(__v: _root_.scala.Predef.String): Entry = copy(eTag = __v)
    def clearMetadata = copy(metadata = _root_.scala.collection.immutable.Map.empty)
    def addMetadata(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): Entry = addAllMetadata(__vs)
    def addAllMetadata(__vs: Iterable[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): Entry = copy(metadata = metadata ++ __vs)
    def withMetadata(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): Entry = copy(metadata = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = address
          if (__t != "") __t else null
        }
        case 2 => lastModified.orNull
        case 3 => {
          val __t = size
          if (__t != 0L) __t else null
        }
        case 4 => {
          val __t = eTag
          if (__t != "") __t else null
        }
        case 5 => metadata.iterator.map(io.treeverse.clients.catalog.Entry._typemapper_metadata.toBase(_)).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(address)
        case 2 => lastModified.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PLong(size)
        case 4 => _root_.scalapb.descriptors.PString(eTag)
        case 5 => _root_.scalapb.descriptors.PRepeated(metadata.iterator.map(io.treeverse.clients.catalog.Entry._typemapper_metadata.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.treeverse.clients.catalog.Entry
    // @@protoc_insertion_point(GeneratedMessage[catalog.Entry])
}

object Entry extends scalapb.GeneratedMessageCompanion[io.treeverse.clients.catalog.Entry] with scalapb.HasBuilder[io.treeverse.clients.catalog.Entry] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.treeverse.clients.catalog.Entry] with scalapb.HasBuilder[io.treeverse.clients.catalog.Entry] = this
  def merge(`_message__`: io.treeverse.clients.catalog.Entry, `_input__`: _root_.com.google.protobuf.CodedInputStream): io.treeverse.clients.catalog.Entry = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.treeverse.clients.catalog.Entry] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.treeverse.clients.catalog.Entry(
        address = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        lastModified = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]),
        size = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        eTag = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        metadata = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[io.treeverse.clients.catalog.Entry.MetadataEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(io.treeverse.clients.catalog.Entry._typemapper_metadata.toCustom(_)).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CatalogProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CatalogProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.timestamp.Timestamp
      case 5 => __out = io.treeverse.clients.catalog.Entry.MetadataEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.io.treeverse.clients.catalog.Entry.MetadataEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.treeverse.clients.catalog.Entry(
    address = "",
    lastModified = _root_.scala.None,
    size = 0L,
    eTag = "",
    metadata = _root_.scala.collection.immutable.Map.empty
  )
  final class Builder private (
    private var __address: _root_.scala.Predef.String,
    private var __lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
    private var __size: _root_.scala.Long,
    private var __eTag: _root_.scala.Predef.String,
    private val __metadata: _root_.scala.collection.mutable.Builder[(_root_.scala.Predef.String, _root_.scala.Predef.String), _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[io.treeverse.clients.catalog.Entry] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __address = _input__.readStringRequireUtf8()
          case 18 =>
            __lastModified = Option(__lastModified.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.timestamp.Timestamp](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 24 =>
            __size = _input__.readInt64()
          case 34 =>
            __eTag = _input__.readStringRequireUtf8()
          case 42 =>
            __metadata += io.treeverse.clients.catalog.Entry._typemapper_metadata.toCustom(_root_.scalapb.LiteParser.readMessage[io.treeverse.clients.catalog.Entry.MetadataEntry](_input__))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): io.treeverse.clients.catalog.Entry = {
      io.treeverse.clients.catalog.Entry(
        address = __address,
        lastModified = __lastModified,
        size = __size,
        eTag = __eTag,
        metadata = __metadata.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[io.treeverse.clients.catalog.Entry, io.treeverse.clients.catalog.Entry.Builder] {
    def apply(): Builder = new Builder(
      __address = "",
      __lastModified = _root_.scala.None,
      __size = 0L,
      __eTag = "",
      __metadata = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String],
      `_unknownFields__` = null
    )
    def apply(`_message__`: io.treeverse.clients.catalog.Entry): Builder = new Builder(
        __address = _message__.address,
        __lastModified = _message__.lastModified,
        __size = _message__.size,
        __eTag = _message__.eTag,
        __metadata = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= _message__.metadata,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = io.treeverse.clients.catalog.Entry.Builder()
  def newBuilder(`_message__`: io.treeverse.clients.catalog.Entry): Builder = io.treeverse.clients.catalog.Entry.Builder(_message__)
  @SerialVersionUID(0L)
  final case class MetadataEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = "",
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MetadataEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = value
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
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
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withKey(__v: _root_.scala.Predef.String): MetadataEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): MetadataEntry = copy(value = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = io.treeverse.clients.catalog.Entry.MetadataEntry
      // @@protoc_insertion_point(GeneratedMessage[catalog.Entry.MetadataEntry])
  }
  
  object MetadataEntry extends scalapb.GeneratedMessageCompanion[io.treeverse.clients.catalog.Entry.MetadataEntry] with scalapb.HasBuilder[io.treeverse.clients.catalog.Entry.MetadataEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.treeverse.clients.catalog.Entry.MetadataEntry] with scalapb.HasBuilder[io.treeverse.clients.catalog.Entry.MetadataEntry] = this
    def merge(`_message__`: io.treeverse.clients.catalog.Entry.MetadataEntry, `_input__`: _root_.com.google.protobuf.CodedInputStream): io.treeverse.clients.catalog.Entry.MetadataEntry = newBuilder(_message__).merge(_input__).result()
    implicit def messageReads: _root_.scalapb.descriptors.Reads[io.treeverse.clients.catalog.Entry.MetadataEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        io.treeverse.clients.catalog.Entry.MetadataEntry(
          key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = io.treeverse.clients.catalog.Entry.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = io.treeverse.clients.catalog.Entry.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = io.treeverse.clients.catalog.Entry.MetadataEntry(
      key = "",
      value = ""
    )
    final class Builder private (
      private var __key: _root_.scala.Predef.String,
      private var __value: _root_.scala.Predef.String,
      private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
    ) extends _root_.scalapb.MessageBuilder[io.treeverse.clients.catalog.Entry.MetadataEntry] {
      def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readStringRequireUtf8()
            case 18 =>
              __value = _input__.readStringRequireUtf8()
            case tag =>
              if (_unknownFields__ == null) {
                _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
              }
              _unknownFields__.parseField(tag, _input__)
          }
        }
        this
      }
      def result(): io.treeverse.clients.catalog.Entry.MetadataEntry = {
        io.treeverse.clients.catalog.Entry.MetadataEntry(
          key = __key,
          value = __value,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
        )
      }
    }
    object Builder extends _root_.scalapb.MessageBuilderCompanion[io.treeverse.clients.catalog.Entry.MetadataEntry, io.treeverse.clients.catalog.Entry.MetadataEntry.Builder] {
      def apply(): Builder = new Builder(
        __key = "",
        __value = "",
        `_unknownFields__` = null
      )
      def apply(`_message__`: io.treeverse.clients.catalog.Entry.MetadataEntry): Builder = new Builder(
          __key = _message__.key,
          __value = _message__.value,
          `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
      )
    }
    def newBuilder: Builder = io.treeverse.clients.catalog.Entry.MetadataEntry.Builder()
    def newBuilder(`_message__`: io.treeverse.clients.catalog.Entry.MetadataEntry): Builder = io.treeverse.clients.catalog.Entry.MetadataEntry.Builder(_message__)
    implicit class MetadataEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.treeverse.clients.catalog.Entry.MetadataEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.treeverse.clients.catalog.Entry.MetadataEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    @transient
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[io.treeverse.clients.catalog.Entry.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[io.treeverse.clients.catalog.Entry.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => io.treeverse.clients.catalog.Entry.MetadataEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.io.treeverse.clients.catalog.Entry.MetadataEntry = _root_.io.treeverse.clients.catalog.Entry.MetadataEntry(
      key,
      value
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[catalog.Entry.MetadataEntry])
  }
  
  implicit class EntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.treeverse.clients.catalog.Entry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.treeverse.clients.catalog.Entry](_l) {
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.address)((c_, f_) => c_.copy(address = f_))
    def lastModified: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getLastModified)((c_, f_) => c_.copy(lastModified = Option(f_)))
    def optionalLastModified: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.lastModified)((c_, f_) => c_.copy(lastModified = f_))
    def size: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.size)((c_, f_) => c_.copy(size = f_))
    def eTag: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.eTag)((c_, f_) => c_.copy(eTag = f_))
    def metadata: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.metadata)((c_, f_) => c_.copy(metadata = f_))
  }
  final val ADDRESS_FIELD_NUMBER = 1
  final val LAST_MODIFIED_FIELD_NUMBER = 2
  final val SIZE_FIELD_NUMBER = 3
  final val E_TAG_FIELD_NUMBER = 4
  final val METADATA_FIELD_NUMBER = 5
  @transient
  private[catalog] val _typemapper_metadata: _root_.scalapb.TypeMapper[io.treeverse.clients.catalog.Entry.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[io.treeverse.clients.catalog.Entry.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    address: _root_.scala.Predef.String,
    lastModified: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
    size: _root_.scala.Long,
    eTag: _root_.scala.Predef.String,
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]
  ): _root_.io.treeverse.clients.catalog.Entry = _root_.io.treeverse.clients.catalog.Entry(
    address,
    lastModified,
    size,
    eTag,
    metadata
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[catalog.Entry])
}
