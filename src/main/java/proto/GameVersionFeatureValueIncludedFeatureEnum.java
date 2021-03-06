// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.GameVersionFeatureValueIncludedFeatureEnum}
 */
public enum GameVersionFeatureValueIncludedFeatureEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_INCLUDED = 0;</code>
   */
  NOT_INCLUDED(0),
  /**
   * <code>INCLUDED = 1;</code>
   */
  INCLUDED(1),
  /**
   * <code>PRE_ORDER_ONLY = 2;</code>
   */
  PRE_ORDER_ONLY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOT_INCLUDED = 0;</code>
   */
  public static final int NOT_INCLUDED_VALUE = 0;
  /**
   * <code>INCLUDED = 1;</code>
   */
  public static final int INCLUDED_VALUE = 1;
  /**
   * <code>PRE_ORDER_ONLY = 2;</code>
   */
  public static final int PRE_ORDER_ONLY_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GameVersionFeatureValueIncludedFeatureEnum valueOf(int value) {
    return forNumber(value);
  }

  public static GameVersionFeatureValueIncludedFeatureEnum forNumber(int value) {
    switch (value) {
      case 0: return NOT_INCLUDED;
      case 1: return INCLUDED;
      case 2: return PRE_ORDER_ONLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameVersionFeatureValueIncludedFeatureEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameVersionFeatureValueIncludedFeatureEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameVersionFeatureValueIncludedFeatureEnum>() {
          public GameVersionFeatureValueIncludedFeatureEnum findValueByNumber(int number) {
            return GameVersionFeatureValueIncludedFeatureEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.IGDBProtoFile.getDescriptor()
        .getEnumTypes().get(15);
  }

  private static final GameVersionFeatureValueIncludedFeatureEnum[] VALUES = values();

  public static GameVersionFeatureValueIncludedFeatureEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GameVersionFeatureValueIncludedFeatureEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.GameVersionFeatureValueIncludedFeatureEnum)
}

