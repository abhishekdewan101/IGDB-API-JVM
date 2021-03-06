// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.SocialMetricSourceSocialNetworkEnum}
 */
public enum SocialMetricSourceSocialNetworkEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SOCIALMETRICSOURCE_SOCIAL_NETWORK_NULL = 0;</code>
   */
  SOCIALMETRICSOURCE_SOCIAL_NETWORK_NULL(0),
  /**
   * <code>SOCIALMETRICSOURCE_OFFICIAL = 1;</code>
   */
  SOCIALMETRICSOURCE_OFFICIAL(1),
  /**
   * <code>SOCIALMETRICSOURCE_WIKIA = 2;</code>
   */
  SOCIALMETRICSOURCE_WIKIA(2),
  /**
   * <code>SOCIALMETRICSOURCE_WIKIPEDIA = 3;</code>
   */
  SOCIALMETRICSOURCE_WIKIPEDIA(3),
  /**
   * <code>SOCIALMETRICSOURCE_FACEBOOK = 4;</code>
   */
  SOCIALMETRICSOURCE_FACEBOOK(4),
  /**
   * <code>SOCIALMETRICSOURCE_TWITTER = 5;</code>
   */
  SOCIALMETRICSOURCE_TWITTER(5),
  /**
   * <code>SOCIALMETRICSOURCE_TWITCH = 6;</code>
   */
  SOCIALMETRICSOURCE_TWITCH(6),
  /**
   * <code>SOCIALMETRICSOURCE_INSTAGRAM = 8;</code>
   */
  SOCIALMETRICSOURCE_INSTAGRAM(8),
  /**
   * <code>SOCIALMETRICSOURCE_YOUTUBE = 9;</code>
   */
  SOCIALMETRICSOURCE_YOUTUBE(9),
  /**
   * <code>SOCIALMETRICSOURCE_IPHONE = 10;</code>
   */
  SOCIALMETRICSOURCE_IPHONE(10),
  /**
   * <code>SOCIALMETRICSOURCE_IPAD = 11;</code>
   */
  SOCIALMETRICSOURCE_IPAD(11),
  /**
   * <code>SOCIALMETRICSOURCE_ANDROID = 12;</code>
   */
  SOCIALMETRICSOURCE_ANDROID(12),
  /**
   * <code>SOCIALMETRICSOURCE_STEAM = 13;</code>
   */
  SOCIALMETRICSOURCE_STEAM(13),
  /**
   * <code>SOCIALMETRICSOURCE_REDDIT = 14;</code>
   */
  SOCIALMETRICSOURCE_REDDIT(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SOCIALMETRICSOURCE_SOCIAL_NETWORK_NULL = 0;</code>
   */
  public static final int SOCIALMETRICSOURCE_SOCIAL_NETWORK_NULL_VALUE = 0;
  /**
   * <code>SOCIALMETRICSOURCE_OFFICIAL = 1;</code>
   */
  public static final int SOCIALMETRICSOURCE_OFFICIAL_VALUE = 1;
  /**
   * <code>SOCIALMETRICSOURCE_WIKIA = 2;</code>
   */
  public static final int SOCIALMETRICSOURCE_WIKIA_VALUE = 2;
  /**
   * <code>SOCIALMETRICSOURCE_WIKIPEDIA = 3;</code>
   */
  public static final int SOCIALMETRICSOURCE_WIKIPEDIA_VALUE = 3;
  /**
   * <code>SOCIALMETRICSOURCE_FACEBOOK = 4;</code>
   */
  public static final int SOCIALMETRICSOURCE_FACEBOOK_VALUE = 4;
  /**
   * <code>SOCIALMETRICSOURCE_TWITTER = 5;</code>
   */
  public static final int SOCIALMETRICSOURCE_TWITTER_VALUE = 5;
  /**
   * <code>SOCIALMETRICSOURCE_TWITCH = 6;</code>
   */
  public static final int SOCIALMETRICSOURCE_TWITCH_VALUE = 6;
  /**
   * <code>SOCIALMETRICSOURCE_INSTAGRAM = 8;</code>
   */
  public static final int SOCIALMETRICSOURCE_INSTAGRAM_VALUE = 8;
  /**
   * <code>SOCIALMETRICSOURCE_YOUTUBE = 9;</code>
   */
  public static final int SOCIALMETRICSOURCE_YOUTUBE_VALUE = 9;
  /**
   * <code>SOCIALMETRICSOURCE_IPHONE = 10;</code>
   */
  public static final int SOCIALMETRICSOURCE_IPHONE_VALUE = 10;
  /**
   * <code>SOCIALMETRICSOURCE_IPAD = 11;</code>
   */
  public static final int SOCIALMETRICSOURCE_IPAD_VALUE = 11;
  /**
   * <code>SOCIALMETRICSOURCE_ANDROID = 12;</code>
   */
  public static final int SOCIALMETRICSOURCE_ANDROID_VALUE = 12;
  /**
   * <code>SOCIALMETRICSOURCE_STEAM = 13;</code>
   */
  public static final int SOCIALMETRICSOURCE_STEAM_VALUE = 13;
  /**
   * <code>SOCIALMETRICSOURCE_REDDIT = 14;</code>
   */
  public static final int SOCIALMETRICSOURCE_REDDIT_VALUE = 14;


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
  public static SocialMetricSourceSocialNetworkEnum valueOf(int value) {
    return forNumber(value);
  }

  public static SocialMetricSourceSocialNetworkEnum forNumber(int value) {
    switch (value) {
      case 0: return SOCIALMETRICSOURCE_SOCIAL_NETWORK_NULL;
      case 1: return SOCIALMETRICSOURCE_OFFICIAL;
      case 2: return SOCIALMETRICSOURCE_WIKIA;
      case 3: return SOCIALMETRICSOURCE_WIKIPEDIA;
      case 4: return SOCIALMETRICSOURCE_FACEBOOK;
      case 5: return SOCIALMETRICSOURCE_TWITTER;
      case 6: return SOCIALMETRICSOURCE_TWITCH;
      case 8: return SOCIALMETRICSOURCE_INSTAGRAM;
      case 9: return SOCIALMETRICSOURCE_YOUTUBE;
      case 10: return SOCIALMETRICSOURCE_IPHONE;
      case 11: return SOCIALMETRICSOURCE_IPAD;
      case 12: return SOCIALMETRICSOURCE_ANDROID;
      case 13: return SOCIALMETRICSOURCE_STEAM;
      case 14: return SOCIALMETRICSOURCE_REDDIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SocialMetricSourceSocialNetworkEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SocialMetricSourceSocialNetworkEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SocialMetricSourceSocialNetworkEnum>() {
          public SocialMetricSourceSocialNetworkEnum findValueByNumber(int number) {
            return SocialMetricSourceSocialNetworkEnum.forNumber(number);
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
        .getEnumTypes().get(22);
  }

  private static final SocialMetricSourceSocialNetworkEnum[] VALUES = values();

  public static SocialMetricSourceSocialNetworkEnum valueOf(
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

  private SocialMetricSourceSocialNetworkEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.SocialMetricSourceSocialNetworkEnum)
}

