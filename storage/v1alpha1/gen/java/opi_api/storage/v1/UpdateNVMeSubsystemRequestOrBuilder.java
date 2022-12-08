// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface UpdateNVMeSubsystemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNVMeSubsystemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 1;</code>
   * @return Whether the nvMeSubsystem field is set.
   */
  boolean hasNvMeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 1;</code>
   * @return The nvMeSubsystem.
   */
  opi_api.storage.v1.NVMeSubsystem getNvMeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 1;</code>
   */
  opi_api.storage.v1.NVMeSubsystemOrBuilder getNvMeSubsystemOrBuilder();

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
