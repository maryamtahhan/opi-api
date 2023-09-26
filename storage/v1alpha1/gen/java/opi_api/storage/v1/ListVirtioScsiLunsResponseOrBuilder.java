// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface ListVirtioScsiLunsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListVirtioScsiLunsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Scsi Luns
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun virtio_scsi_luns = 1;</code>
   */
  java.util.List<opi_api.storage.v1.VirtioScsiLun> 
      getVirtioScsiLunsList();
  /**
   * <pre>
   * List of Scsi Luns
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun virtio_scsi_luns = 1;</code>
   */
  opi_api.storage.v1.VirtioScsiLun getVirtioScsiLuns(int index);
  /**
   * <pre>
   * List of Scsi Luns
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun virtio_scsi_luns = 1;</code>
   */
  int getVirtioScsiLunsCount();
  /**
   * <pre>
   * List of Scsi Luns
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun virtio_scsi_luns = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.VirtioScsiLunOrBuilder> 
      getVirtioScsiLunsOrBuilderList();
  /**
   * <pre>
   * List of Scsi Luns
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun virtio_scsi_luns = 1;</code>
   */
  opi_api.storage.v1.VirtioScsiLunOrBuilder getVirtioScsiLunsOrBuilder(
      int index);

  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
