// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface WebsiteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Website)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .proto.WebsiteCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>optional .proto.WebsiteCategoryEnum category = 2;</code>
   */
  proto.WebsiteCategoryEnum getCategory();

  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  boolean hasGame();
  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  proto.Game getGame();
  /**
   * <code>optional .proto.Game game = 3;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>optional bool trusted = 4;</code>
   */
  boolean getTrusted();

  /**
   * <code>optional string url = 5;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 5;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
