// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

public interface UpdateEncryptedVolumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateEncryptedVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1;</code>
   * @return Whether the encryptedVolume field is set.
   */
  boolean hasEncryptedVolume();
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1;</code>
   * @return The encryptedVolume.
   */
  opi_api.storage.v1.EncryptedVolume getEncryptedVolume();
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1;</code>
   */
  opi_api.storage.v1.EncryptedVolumeOrBuilder getEncryptedVolumeOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
