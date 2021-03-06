// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.ProductFamilyResult}
 */
public  final class ProductFamilyResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ProductFamilyResult)
    ProductFamilyResultOrBuilder {
  // Use ProductFamilyResult.newBuilder() to construct.
  private ProductFamilyResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductFamilyResult() {
    productfamilies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_ProductFamilyResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_ProductFamilyResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ProductFamilyResult.class, proto.ProductFamilyResult.Builder.class);
  }

  public static final int PRODUCTFAMILIES_FIELD_NUMBER = 1;
  private java.util.List<proto.ProductFamily> productfamilies_;
  /**
   * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
   */
  public java.util.List<proto.ProductFamily> getProductfamiliesList() {
    return productfamilies_;
  }
  /**
   * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
   */
  public java.util.List<? extends proto.ProductFamilyOrBuilder> 
      getProductfamiliesOrBuilderList() {
    return productfamilies_;
  }
  /**
   * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
   */
  public int getProductfamiliesCount() {
    return productfamilies_.size();
  }
  /**
   * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
   */
  public proto.ProductFamily getProductfamilies(int index) {
    return productfamilies_.get(index);
  }
  /**
   * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
   */
  public proto.ProductFamilyOrBuilder getProductfamiliesOrBuilder(
      int index) {
    return productfamilies_.get(index);
  }

  public static proto.ProductFamilyResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ProductFamilyResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ProductFamilyResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ProductFamilyResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ProductFamilyResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ProductFamilyResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ProductFamilyResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ProductFamilyResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ProductFamilyResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ProductFamilyResult parseFrom(
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
  public static Builder newBuilder(proto.ProductFamilyResult prototype) {
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
   * Protobuf type {@code proto.ProductFamilyResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ProductFamilyResult)
      proto.ProductFamilyResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_ProductFamilyResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_ProductFamilyResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ProductFamilyResult.class, proto.ProductFamilyResult.Builder.class);
    }

    // Construct using proto.ProductFamilyResult.newBuilder()
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
        getProductfamiliesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (productfamiliesBuilder_ == null) {
        productfamilies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productfamiliesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_ProductFamilyResult_descriptor;
    }

    public proto.ProductFamilyResult getDefaultInstanceForType() {
      return proto.ProductFamilyResult.getDefaultInstance();
    }

    public proto.ProductFamilyResult build() {
      proto.ProductFamilyResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.ProductFamilyResult buildPartial() {
      proto.ProductFamilyResult result = new proto.ProductFamilyResult(this);
      int from_bitField0_ = bitField0_;
      if (productfamiliesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          productfamilies_ = java.util.Collections.unmodifiableList(productfamilies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productfamilies_ = productfamilies_;
      } else {
        result.productfamilies_ = productfamiliesBuilder_.build();
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

    private java.util.List<proto.ProductFamily> productfamilies_ =
      java.util.Collections.emptyList();
    private void ensureProductfamiliesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        productfamilies_ = new java.util.ArrayList<proto.ProductFamily>(productfamilies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.ProductFamily, proto.ProductFamily.Builder, proto.ProductFamilyOrBuilder> productfamiliesBuilder_;

    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public java.util.List<proto.ProductFamily> getProductfamiliesList() {
      if (productfamiliesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productfamilies_);
      } else {
        return productfamiliesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public int getProductfamiliesCount() {
      if (productfamiliesBuilder_ == null) {
        return productfamilies_.size();
      } else {
        return productfamiliesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public proto.ProductFamily getProductfamilies(int index) {
      if (productfamiliesBuilder_ == null) {
        return productfamilies_.get(index);
      } else {
        return productfamiliesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder setProductfamilies(
        int index, proto.ProductFamily value) {
      if (productfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductfamiliesIsMutable();
        productfamilies_.set(index, value);
        onChanged();
      } else {
        productfamiliesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder setProductfamilies(
        int index, proto.ProductFamily.Builder builderForValue) {
      if (productfamiliesBuilder_ == null) {
        ensureProductfamiliesIsMutable();
        productfamilies_.set(index, builderForValue.build());
        onChanged();
      } else {
        productfamiliesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder addProductfamilies(proto.ProductFamily value) {
      if (productfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductfamiliesIsMutable();
        productfamilies_.add(value);
        onChanged();
      } else {
        productfamiliesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder addProductfamilies(
        int index, proto.ProductFamily value) {
      if (productfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductfamiliesIsMutable();
        productfamilies_.add(index, value);
        onChanged();
      } else {
        productfamiliesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder addProductfamilies(
        proto.ProductFamily.Builder builderForValue) {
      if (productfamiliesBuilder_ == null) {
        ensureProductfamiliesIsMutable();
        productfamilies_.add(builderForValue.build());
        onChanged();
      } else {
        productfamiliesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder addProductfamilies(
        int index, proto.ProductFamily.Builder builderForValue) {
      if (productfamiliesBuilder_ == null) {
        ensureProductfamiliesIsMutable();
        productfamilies_.add(index, builderForValue.build());
        onChanged();
      } else {
        productfamiliesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder addAllProductfamilies(
        java.lang.Iterable<? extends proto.ProductFamily> values) {
      if (productfamiliesBuilder_ == null) {
        ensureProductfamiliesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, productfamilies_);
        onChanged();
      } else {
        productfamiliesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder clearProductfamilies() {
      if (productfamiliesBuilder_ == null) {
        productfamilies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productfamiliesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public Builder removeProductfamilies(int index) {
      if (productfamiliesBuilder_ == null) {
        ensureProductfamiliesIsMutable();
        productfamilies_.remove(index);
        onChanged();
      } else {
        productfamiliesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public proto.ProductFamily.Builder getProductfamiliesBuilder(
        int index) {
      return getProductfamiliesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public proto.ProductFamilyOrBuilder getProductfamiliesOrBuilder(
        int index) {
      if (productfamiliesBuilder_ == null) {
        return productfamilies_.get(index);  } else {
        return productfamiliesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public java.util.List<? extends proto.ProductFamilyOrBuilder> 
         getProductfamiliesOrBuilderList() {
      if (productfamiliesBuilder_ != null) {
        return productfamiliesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productfamilies_);
      }
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public proto.ProductFamily.Builder addProductfamiliesBuilder() {
      return getProductfamiliesFieldBuilder().addBuilder(
          proto.ProductFamily.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public proto.ProductFamily.Builder addProductfamiliesBuilder(
        int index) {
      return getProductfamiliesFieldBuilder().addBuilder(
          index, proto.ProductFamily.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ProductFamily productfamilies = 1;</code>
     */
    public java.util.List<proto.ProductFamily.Builder> 
         getProductfamiliesBuilderList() {
      return getProductfamiliesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.ProductFamily, proto.ProductFamily.Builder, proto.ProductFamilyOrBuilder> 
        getProductfamiliesFieldBuilder() {
      if (productfamiliesBuilder_ == null) {
        productfamiliesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.ProductFamily, proto.ProductFamily.Builder, proto.ProductFamilyOrBuilder>(
                productfamilies_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        productfamilies_ = null;
      }
      return productfamiliesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.ProductFamilyResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ProductFamilyResult)
  private static final proto.ProductFamilyResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ProductFamilyResult();
  }

  public static proto.ProductFamilyResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductFamilyResult>
      PARSER = new com.google.protobuf.AbstractParser<ProductFamilyResult>() {
    public ProductFamilyResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductFamilyResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductFamilyResult> getParserForType() {
    return PARSER;
  }

  public proto.ProductFamilyResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

