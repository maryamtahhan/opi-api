// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface StatsVirtioScsiControllerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.StatsVirtioScsiControllerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Scsi Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <pre>
   * Scsi Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <pre>
   * Scsi Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}
