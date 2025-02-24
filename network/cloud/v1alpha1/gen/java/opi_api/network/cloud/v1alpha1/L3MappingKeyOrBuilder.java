// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mapping.proto

package opi_api.network.cloud.v1alpha1;

public interface L3MappingKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.L3MappingKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * virtual private cloud of the IP mapping
   * </pre>
   *
   * <code>string vpc_name_ref = 1;</code>
   * @return The vpcNameRef.
   */
  java.lang.String getVpcNameRef();
  /**
   * <pre>
   * virtual private cloud of the IP mapping
   * </pre>
   *
   * <code>string vpc_name_ref = 1;</code>
   * @return The bytes for vpcNameRef.
   */
  com.google.protobuf.ByteString
      getVpcNameRefBytes();

  /**
   * <pre>
   * private/overlay IP of the mapping
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 2;</code>
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   * <pre>
   * private/overlay IP of the mapping
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 2;</code>
   * @return The ipAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getIpAddress();
  /**
   * <pre>
   * private/overlay IP of the mapping
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getIpAddressOrBuilder();
}
