// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeControllerStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeControllerStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}
