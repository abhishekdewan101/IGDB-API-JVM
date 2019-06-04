// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.ListEntryResult}
 */
public  final class ListEntryResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ListEntryResult)
    ListEntryResultOrBuilder {
  // Use ListEntryResult.newBuilder() to construct.
  private ListEntryResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListEntryResult() {
    listentries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_ListEntryResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_ListEntryResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ListEntryResult.class, proto.ListEntryResult.Builder.class);
  }

  public static final int LISTENTRIES_FIELD_NUMBER = 1;
  private java.util.List<proto.ListEntry> listentries_;
  /**
   * <code>repeated .proto.ListEntry listentries = 1;</code>
   */
  public java.util.List<proto.ListEntry> getListentriesList() {
    return listentries_;
  }
  /**
   * <code>repeated .proto.ListEntry listentries = 1;</code>
   */
  public java.util.List<? extends proto.ListEntryOrBuilder> 
      getListentriesOrBuilderList() {
    return listentries_;
  }
  /**
   * <code>repeated .proto.ListEntry listentries = 1;</code>
   */
  public int getListentriesCount() {
    return listentries_.size();
  }
  /**
   * <code>repeated .proto.ListEntry listentries = 1;</code>
   */
  public proto.ListEntry getListentries(int index) {
    return listentries_.get(index);
  }
  /**
   * <code>repeated .proto.ListEntry listentries = 1;</code>
   */
  public proto.ListEntryOrBuilder getListentriesOrBuilder(
      int index) {
    return listentries_.get(index);
  }

  public static proto.ListEntryResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListEntryResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListEntryResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListEntryResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListEntryResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListEntryResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListEntryResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ListEntryResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListEntryResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListEntryResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.ListEntryResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ListEntryResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ListEntryResult)
      proto.ListEntryResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_ListEntryResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_ListEntryResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ListEntryResult.class, proto.ListEntryResult.Builder.class);
    }

    // Construct using proto.ListEntryResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getListentriesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (listentriesBuilder_ == null) {
        listentries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listentriesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_ListEntryResult_descriptor;
    }

    public proto.ListEntryResult getDefaultInstanceForType() {
      return proto.ListEntryResult.getDefaultInstance();
    }

    public proto.ListEntryResult build() {
      proto.ListEntryResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.ListEntryResult buildPartial() {
      proto.ListEntryResult result = new proto.ListEntryResult(this);
      int from_bitField0_ = bitField0_;
      if (listentriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          listentries_ = java.util.Collections.unmodifiableList(listentries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.listentries_ = listentries_;
      } else {
        result.listentries_ = listentriesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.ListEntry> listentries_ =
      java.util.Collections.emptyList();
    private void ensureListentriesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        listentries_ = new java.util.ArrayList<proto.ListEntry>(listentries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.ListEntry, proto.ListEntry.Builder, proto.ListEntryOrBuilder> listentriesBuilder_;

    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public java.util.List<proto.ListEntry> getListentriesList() {
      if (listentriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(listentries_);
      } else {
        return listentriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public int getListentriesCount() {
      if (listentriesBuilder_ == null) {
        return listentries_.size();
      } else {
        return listentriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public proto.ListEntry getListentries(int index) {
      if (listentriesBuilder_ == null) {
        return listentries_.get(index);
      } else {
        return listentriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder setListentries(
        int index, proto.ListEntry value) {
      if (listentriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListentriesIsMutable();
        listentries_.set(index, value);
        onChanged();
      } else {
        listentriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder setListentries(
        int index, proto.ListEntry.Builder builderForValue) {
      if (listentriesBuilder_ == null) {
        ensureListentriesIsMutable();
        listentries_.set(index, builderForValue.build());
        onChanged();
      } else {
        listentriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder addListentries(proto.ListEntry value) {
      if (listentriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListentriesIsMutable();
        listentries_.add(value);
        onChanged();
      } else {
        listentriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder addListentries(
        int index, proto.ListEntry value) {
      if (listentriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListentriesIsMutable();
        listentries_.add(index, value);
        onChanged();
      } else {
        listentriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder addListentries(
        proto.ListEntry.Builder builderForValue) {
      if (listentriesBuilder_ == null) {
        ensureListentriesIsMutable();
        listentries_.add(builderForValue.build());
        onChanged();
      } else {
        listentriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder addListentries(
        int index, proto.ListEntry.Builder builderForValue) {
      if (listentriesBuilder_ == null) {
        ensureListentriesIsMutable();
        listentries_.add(index, builderForValue.build());
        onChanged();
      } else {
        listentriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder addAllListentries(
        java.lang.Iterable<? extends proto.ListEntry> values) {
      if (listentriesBuilder_ == null) {
        ensureListentriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, listentries_);
        onChanged();
      } else {
        listentriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder clearListentries() {
      if (listentriesBuilder_ == null) {
        listentries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listentriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public Builder removeListentries(int index) {
      if (listentriesBuilder_ == null) {
        ensureListentriesIsMutable();
        listentries_.remove(index);
        onChanged();
      } else {
        listentriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public proto.ListEntry.Builder getListentriesBuilder(
        int index) {
      return getListentriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public proto.ListEntryOrBuilder getListentriesOrBuilder(
        int index) {
      if (listentriesBuilder_ == null) {
        return listentries_.get(index);  } else {
        return listentriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public java.util.List<? extends proto.ListEntryOrBuilder> 
         getListentriesOrBuilderList() {
      if (listentriesBuilder_ != null) {
        return listentriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(listentries_);
      }
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public proto.ListEntry.Builder addListentriesBuilder() {
      return getListentriesFieldBuilder().addBuilder(
          proto.ListEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public proto.ListEntry.Builder addListentriesBuilder(
        int index) {
      return getListentriesFieldBuilder().addBuilder(
          index, proto.ListEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ListEntry listentries = 1;</code>
     */
    public java.util.List<proto.ListEntry.Builder> 
         getListentriesBuilderList() {
      return getListentriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.ListEntry, proto.ListEntry.Builder, proto.ListEntryOrBuilder> 
        getListentriesFieldBuilder() {
      if (listentriesBuilder_ == null) {
        listentriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.ListEntry, proto.ListEntry.Builder, proto.ListEntryOrBuilder>(
                listentries_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        listentries_ = null;
      }
      return listentriesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.ListEntryResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ListEntryResult)
  private static final proto.ListEntryResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ListEntryResult();
  }

  public static proto.ListEntryResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntryResult>
      PARSER = new com.google.protobuf.AbstractParser<ListEntryResult>() {
    public ListEntryResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListEntryResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntryResult> getParserForType() {
    return PARSER;
  }

  public proto.ListEntryResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
