// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface CompanyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Company)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .google.protobuf.Timestamp changeDate = 2;</code>
   */
  boolean hasChangeDate();
  /**
   * <code>optional .google.protobuf.Timestamp changeDate = 2;</code>
   */
  com.google.protobuf.Timestamp getChangeDate();
  /**
   * <code>optional .google.protobuf.Timestamp changeDate = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getChangeDateOrBuilder();

  /**
   * <code>optional .proto.DateFormatStartDateCategoryEnum changeDateCategory = 3;</code>
   */
  int getChangeDateCategoryValue();
  /**
   * <code>optional .proto.DateFormatStartDateCategoryEnum changeDateCategory = 3;</code>
   */
  proto.DateFormatStartDateCategoryEnum getChangeDateCategory();

  /**
   * <code>optional .proto.Company changedCompanyId = 4;</code>
   */
  boolean hasChangedCompanyId();
  /**
   * <code>optional .proto.Company changedCompanyId = 4;</code>
   */
  proto.Company getChangedCompanyId();
  /**
   * <code>optional .proto.Company changedCompanyId = 4;</code>
   */
  proto.CompanyOrBuilder getChangedCompanyIdOrBuilder();

  /**
   * <code>optional int32 country = 5;</code>
   */
  int getCountry();

  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 6;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 6;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>optional string description = 7;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 7;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  java.util.List<proto.Game> 
      getDevelopedList();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  proto.Game getDeveloped(int index);
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  int getDevelopedCount();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getDevelopedOrBuilderList();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  proto.GameOrBuilder getDevelopedOrBuilder(
      int index);

  /**
   * <code>optional .proto.CompanyLogo logo = 9;</code>
   */
  boolean hasLogo();
  /**
   * <code>optional .proto.CompanyLogo logo = 9;</code>
   */
  proto.CompanyLogo getLogo();
  /**
   * <code>optional .proto.CompanyLogo logo = 9;</code>
   */
  proto.CompanyLogoOrBuilder getLogoOrBuilder();

  /**
   * <code>optional string name = 10;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 10;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .proto.Company parent = 11;</code>
   */
  boolean hasParent();
  /**
   * <code>optional .proto.Company parent = 11;</code>
   */
  proto.Company getParent();
  /**
   * <code>optional .proto.Company parent = 11;</code>
   */
  proto.CompanyOrBuilder getParentOrBuilder();

  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  java.util.List<proto.Game> 
      getPublishedList();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  proto.Game getPublished(int index);
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  int getPublishedCount();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getPublishedOrBuilderList();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  proto.GameOrBuilder getPublishedOrBuilder(
      int index);

  /**
   * <code>optional string slug = 13;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>optional string slug = 13;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>optional .google.protobuf.Timestamp startDate = 14;</code>
   */
  boolean hasStartDate();
  /**
   * <code>optional .google.protobuf.Timestamp startDate = 14;</code>
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <code>optional .google.protobuf.Timestamp startDate = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <code>optional .proto.DateFormatStartDateCategoryEnum startDateCategory = 15;</code>
   */
  int getStartDateCategoryValue();
  /**
   * <code>optional .proto.DateFormatStartDateCategoryEnum startDateCategory = 15;</code>
   */
  proto.DateFormatStartDateCategoryEnum getStartDateCategory();

  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 16;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 16;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>optional string url = 17;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 17;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  java.util.List<proto.CompanyWebsite> 
      getWebsitesList();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  proto.CompanyWebsite getWebsites(int index);
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  int getWebsitesCount();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  java.util.List<? extends proto.CompanyWebsiteOrBuilder> 
      getWebsitesOrBuilderList();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  proto.CompanyWebsiteOrBuilder getWebsitesOrBuilder(
      int index);
}
