// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface RateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Rate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .proto.Game game = 2;</code>
   */
  boolean hasGame();
  /**
   * <code>optional .proto.Game game = 2;</code>
   */
  proto.Game getGame();
  /**
   * <code>optional .proto.Game game = 2;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>optional double rating = 3;</code>
   */
  double getRating();

  /**
   * <code>optional .proto.User user = 4;</code>
   */
  boolean hasUser();
  /**
   * <code>optional .proto.User user = 4;</code>
   */
  proto.User getUser();
  /**
   * <code>optional .proto.User user = 4;</code>
   */
  proto.UserOrBuilder getUserOrBuilder();
}
