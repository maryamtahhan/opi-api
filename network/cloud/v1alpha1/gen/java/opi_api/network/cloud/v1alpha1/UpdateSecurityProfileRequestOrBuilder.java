// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface UpdateSecurityProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * updated securityprofile info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   * @return Whether the securityprofile field is set.
   */
  boolean hasSecurityprofile();
  /**
   * <pre>
   * updated securityprofile info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   * @return The securityprofile.
   */
  opi_api.network.cloud.v1alpha1.SecurityProfile getSecurityprofile();
  /**
   * <pre>
   * updated securityprofile info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder getSecurityprofileOrBuilder();

  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}