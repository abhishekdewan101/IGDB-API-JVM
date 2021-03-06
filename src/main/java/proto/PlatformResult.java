// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.PlatformResult}
 */
public  final class PlatformResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PlatformResult)
    PlatformResultOrBuilder {
  // Use PlatformResult.newBuilder() to construct.
  private PlatformResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformResult() {
    platforms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_PlatformResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_PlatformResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PlatformResult.class, proto.PlatformResult.Builder.class);
  }

  public static final int PLATFORMS_FIELD_NUMBER = 1;
  private java.util.List<proto.Platform> platforms_;
  /**
   * <code>repeated .proto.Platform platforms = 1;</code>
   */
  public java.util.List<proto.Platform> getPlatformsList() {
    return platforms_;
  }
  /**
   * <code>repeated .proto.Platform platforms = 1;</code>
   */
  public java.util.List<? extends proto.PlatformOrBuilder> 
      getPlatformsOrBuilderList() {
    return platforms_;
  }
  /**
   * <code>repeated .proto.Platform platforms = 1;</code>
   */
  public int getPlatformsCount() {
    return platforms_.size();
  }
  /**
   * <code>repeated .proto.Platform platforms = 1;</code>
   */
  public proto.Platform getPlatforms(int index) {
    return platforms_.get(index);
  }
  /**
   * <code>repeated .proto.Platform platforms = 1;</code>
   */
  public proto.PlatformOrBuilder getPlatformsOrBuilder(
      int index) {
    return platforms_.get(index);
  }

  public static proto.PlatformResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlatformResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PlatformResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlatformResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformResult parseFrom(
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
  public static Builder newBuilder(proto.PlatformResult prototype) {
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
   * Protobuf type {@code proto.PlatformResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PlatformResult)
      proto.PlatformResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_PlatformResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_PlatformResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PlatformResult.class, proto.PlatformResult.Builder.class);
    }

    // Construct using proto.PlatformResult.newBuilder()
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
        getPlatformsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (platformsBuilder_ == null) {
        platforms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        platformsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_PlatformResult_descriptor;
    }

    public proto.PlatformResult getDefaultInstanceForType() {
      return proto.PlatformResult.getDefaultInstance();
    }

    public proto.PlatformResult build() {
      proto.PlatformResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.PlatformResult buildPartial() {
      proto.PlatformResult result = new proto.PlatformResult(this);
      int from_bitField0_ = bitField0_;
      if (platformsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          platforms_ = java.util.Collections.unmodifiableList(platforms_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.platforms_ = platforms_;
      } else {
        result.platforms_ = platformsBuilder_.build();
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

    private java.util.List<proto.Platform> platforms_ =
      java.util.Collections.emptyList();
    private void ensurePlatformsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        platforms_ = new java.util.ArrayList<proto.Platform>(platforms_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder> platformsBuilder_;

    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public java.util.List<proto.Platform> getPlatformsList() {
      if (platformsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(platforms_);
      } else {
        return platformsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public int getPlatformsCount() {
      if (platformsBuilder_ == null) {
        return platforms_.size();
      } else {
        return platformsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public proto.Platform getPlatforms(int index) {
      if (platformsBuilder_ == null) {
        return platforms_.get(index);
      } else {
        return platformsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder setPlatforms(
        int index, proto.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.set(index, value);
        onChanged();
      } else {
        platformsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder setPlatforms(
        int index, proto.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.set(index, builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder addPlatforms(proto.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.add(value);
        onChanged();
      } else {
        platformsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder addPlatforms(
        int index, proto.Platform value) {
      if (platformsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformsIsMutable();
        platforms_.add(index, value);
        onChanged();
      } else {
        platformsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder addPlatforms(
        proto.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.add(builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder addPlatforms(
        int index, proto.Platform.Builder builderForValue) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.add(index, builderForValue.build());
        onChanged();
      } else {
        platformsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder addAllPlatforms(
        java.lang.Iterable<? extends proto.Platform> values) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, platforms_);
        onChanged();
      } else {
        platformsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder clearPlatforms() {
      if (platformsBuilder_ == null) {
        platforms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        platformsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public Builder removePlatforms(int index) {
      if (platformsBuilder_ == null) {
        ensurePlatformsIsMutable();
        platforms_.remove(index);
        onChanged();
      } else {
        platformsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public proto.Platform.Builder getPlatformsBuilder(
        int index) {
      return getPlatformsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public proto.PlatformOrBuilder getPlatformsOrBuilder(
        int index) {
      if (platformsBuilder_ == null) {
        return platforms_.get(index);  } else {
        return platformsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public java.util.List<? extends proto.PlatformOrBuilder> 
         getPlatformsOrBuilderList() {
      if (platformsBuilder_ != null) {
        return platformsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(platforms_);
      }
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public proto.Platform.Builder addPlatformsBuilder() {
      return getPlatformsFieldBuilder().addBuilder(
          proto.Platform.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public proto.Platform.Builder addPlatformsBuilder(
        int index) {
      return getPlatformsFieldBuilder().addBuilder(
          index, proto.Platform.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Platform platforms = 1;</code>
     */
    public java.util.List<proto.Platform.Builder> 
         getPlatformsBuilderList() {
      return getPlatformsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder> 
        getPlatformsFieldBuilder() {
      if (platformsBuilder_ == null) {
        platformsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder>(
                platforms_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        platforms_ = null;
      }
      return platformsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.PlatformResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PlatformResult)
  private static final proto.PlatformResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PlatformResult();
  }

  public static proto.PlatformResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformResult>
      PARSER = new com.google.protobuf.AbstractParser<PlatformResult>() {
    public PlatformResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlatformResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformResult> getParserForType() {
    return PARSER;
  }

  public proto.PlatformResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

