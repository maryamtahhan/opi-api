// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface UpdateSecurityRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * updated securityrule info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 1;</code>
   * @return Whether the securityrule field is set.
   */
  boolean hasSecurityrule();
  /**
   * <pre>
   * updated securityrule info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 1;</code>
   * @return The securityrule.
   */
  opi_api.network.cloud.v1alpha1.SecurityRule getSecurityrule();
  /**
   * <pre>
   * updated securityrule info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRule securityrule = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityRuleOrBuilder getSecurityruleOrBuilder();

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
