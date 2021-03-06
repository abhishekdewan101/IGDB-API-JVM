// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface TitleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Title)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .proto.Game games = 4;</code>
   */
  java.util.List<proto.Game> 
      getGamesList();
  /**
   * <code>repeated .proto.Game games = 4;</code>
   */
  proto.Game getGames(int index);
  /**
   * <code>repeated .proto.Game games = 4;</code>
   */
  int getGamesCount();
  /**
   * <code>repeated .proto.Game games = 4;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getGamesOrBuilderList();
  /**
   * <code>repeated .proto.Game games = 4;</code>
   */
  proto.GameOrBuilder getGamesOrBuilder(
      int index);

  /**
   * <code>optional string name = 5;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 5;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string slug = 6;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>optional string slug = 6;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 7;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 7;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>optional string url = 8;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 8;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
