// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public interface ListVirtioBlksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListVirtioBlksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Virtio-Blk devices
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioBlk virtio_blks = 1;</code>
   */
  java.util.List<opi_api.storage.v1.VirtioBlk> 
      getVirtioBlksList();
  /**
   * <pre>
   * List of Virtio-Blk devices
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioBlk virtio_blks = 1;</code>
   */
  opi_api.storage.v1.VirtioBlk getVirtioBlks(int index);
  /**
   * <pre>
   * List of Virtio-Blk devices
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioBlk virtio_blks = 1;</code>
   */
  int getVirtioBlksCount();
  /**
   * <pre>
   * List of Virtio-Blk devices
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioBlk virtio_blks = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.VirtioBlkOrBuilder> 
      getVirtioBlksOrBuilderList();
  /**
   * <pre>
   * List of Virtio-Blk devices
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.VirtioBlk virtio_blks = 1;</code>
   */
  opi_api.storage.v1.VirtioBlkOrBuilder getVirtioBlksOrBuilder(
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
