// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.TimeToBeat}
 */
public  final class TimeToBeat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.TimeToBeat)
    TimeToBeatOrBuilder {
  // Use TimeToBeat.newBuilder() to construct.
  private TimeToBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeToBeat() {
    id_ = 0L;
    completely_ = 0;
    hastly_ = 0;
    normally_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_TimeToBeat_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_TimeToBeat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.TimeToBeat.class, proto.TimeToBeat.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int COMPLETELY_FIELD_NUMBER = 2;
  private int completely_;
  /**
   * <code>optional int32 completely = 2;</code>
   */
  public int getCompletely() {
    return completely_;
  }

  public static final int GAME_FIELD_NUMBER = 3;
  private proto.Game game_;
  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  public boolean hasGame() {
    return game_ != null;
  }
  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  public proto.Game getGame() {
    return game_ == null ? proto.Game.getDefaultInstance() : game_;
  }
  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  public proto.GameOrBuilder getGameOrBuilder() {
    return getGame();
  }

  public static final int HASTLY_FIELD_NUMBER = 4;
  private int hastly_;
  /**
   * <code>optional int32 hastly = 4;</code>
   */
  public int getHastly() {
    return hastly_;
  }

  public static final int NORMALLY_FIELD_NUMBER = 5;
  private int normally_;
  /**
   * <code>optional int32 normally = 5;</code>
   */
  public int getNormally() {
    return normally_;
  }

  public static proto.TimeToBeat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TimeToBeat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TimeToBeat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TimeToBeat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TimeToBeat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TimeToBeat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.TimeToBeat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.TimeToBeat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.TimeToBeat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TimeToBeat parseFrom(
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
  public static Builder newBuilder(proto.TimeToBeat prototype) {
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
   * Protobuf type {@code proto.TimeToBeat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.TimeToBeat)
      proto.TimeToBeatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_TimeToBeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_TimeToBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.TimeToBeat.class, proto.TimeToBeat.Builder.class);
    }

    // Construct using proto.TimeToBeat.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      completely_ = 0;

      if (gameBuilder_ == null) {
        game_ = null;
      } else {
        game_ = null;
        gameBuilder_ = null;
      }
      hastly_ = 0;

      normally_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_TimeToBeat_descriptor;
    }

    public proto.TimeToBeat getDefaultInstanceForType() {
      return proto.TimeToBeat.getDefaultInstance();
    }

    public proto.TimeToBeat build() {
      proto.TimeToBeat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.TimeToBeat buildPartial() {
      proto.TimeToBeat result = new proto.TimeToBeat(this);
      result.id_ = id_;
      result.completely_ = completely_;
      if (gameBuilder_ == null) {
        result.game_ = game_;
      } else {
        result.game_ = gameBuilder_.build();
      }
      result.hastly_ = hastly_;
      result.normally_ = normally_;
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

    private long id_ ;
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int completely_ ;
    /**
     * <code>optional int32 completely = 2;</code>
     */
    public int getCompletely() {
      return completely_;
    }
    /**
     * <code>optional int32 completely = 2;</code>
     */
    public Builder setCompletely(int value) {
      
      completely_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 completely = 2;</code>
     */
    public Builder clearCompletely() {
      
      completely_ = 0;
      onChanged();
      return this;
    }

    private proto.Game game_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gameBuilder_;
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public boolean hasGame() {
      return gameBuilder_ != null || game_ != null;
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public proto.Game getGame() {
      if (gameBuilder_ == null) {
        return game_ == null ? proto.Game.getDefaultInstance() : game_;
      } else {
        return gameBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public Builder setGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        game_ = value;
        onChanged();
      } else {
        gameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public Builder setGame(
        proto.Game.Builder builderForValue) {
      if (gameBuilder_ == null) {
        game_ = builderForValue.build();
        onChanged();
      } else {
        gameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public Builder mergeGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (game_ != null) {
          game_ =
            proto.Game.newBuilder(game_).mergeFrom(value).buildPartial();
        } else {
          game_ = value;
        }
        onChanged();
      } else {
        gameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public Builder clearGame() {
      if (gameBuilder_ == null) {
        game_ = null;
        onChanged();
      } else {
        game_ = null;
        gameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public proto.Game.Builder getGameBuilder() {
      
      onChanged();
      return getGameFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    public proto.GameOrBuilder getGameOrBuilder() {
      if (gameBuilder_ != null) {
        return gameBuilder_.getMessageOrBuilder();
      } else {
        return game_ == null ?
            proto.Game.getDefaultInstance() : game_;
      }
    }
    /**
     * <code>optional .proto.Game game = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> 
        getGameFieldBuilder() {
      if (gameBuilder_ == null) {
        gameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Game, proto.Game.Builder, proto.GameOrBuilder>(
                getGame(),
                getParentForChildren(),
                isClean());
        game_ = null;
      }
      return gameBuilder_;
    }

    private int hastly_ ;
    /**
     * <code>optional int32 hastly = 4;</code>
     */
    public int getHastly() {
      return hastly_;
    }
    /**
     * <code>optional int32 hastly = 4;</code>
     */
    public Builder setHastly(int value) {
      
      hastly_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 hastly = 4;</code>
     */
    public Builder clearHastly() {
      
      hastly_ = 0;
      onChanged();
      return this;
    }

    private int normally_ ;
    /**
     * <code>optional int32 normally = 5;</code>
     */
    public int getNormally() {
      return normally_;
    }
    /**
     * <code>optional int32 normally = 5;</code>
     */
    public Builder setNormally(int value) {
      
      normally_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 normally = 5;</code>
     */
    public Builder clearNormally() {
      
      normally_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.TimeToBeat)
  }

  // @@protoc_insertion_point(class_scope:proto.TimeToBeat)
  private static final proto.TimeToBeat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.TimeToBeat();
  }

  public static proto.TimeToBeat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeToBeat>
      PARSER = new com.google.protobuf.AbstractParser<TimeToBeat>() {
    public TimeToBeat parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeToBeat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeToBeat> getParserForType() {
    return PARSER;
  }

  public proto.TimeToBeat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

