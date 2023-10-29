// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package opi_api.inventory.v1;

public interface InventoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.inventory.v1.Inventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * BIOS Inventory 
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   * @return Whether the bios field is set.
   */
  boolean hasBios();
  /**
   * <pre>
   * BIOS Inventory 
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   * @return The bios.
   */
  opi_api.inventory.v1.BIOSInfo getBios();
  /**
   * <pre>
   * BIOS Inventory 
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   */
  opi_api.inventory.v1.BIOSInfoOrBuilder getBiosOrBuilder();

  /**
   * <pre>
   * System Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <pre>
   * System Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   * @return The system.
   */
  opi_api.inventory.v1.SystemInfo getSystem();
  /**
   * <pre>
   * System Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   */
  opi_api.inventory.v1.SystemInfoOrBuilder getSystemOrBuilder();

  /**
   * <pre>
   * Baseboard Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   * @return Whether the baseboard field is set.
   */
  boolean hasBaseboard();
  /**
   * <pre>
   * Baseboard Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   * @return The baseboard.
   */
  opi_api.inventory.v1.BaseboardInfo getBaseboard();
  /**
   * <pre>
   * Baseboard Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   */
  opi_api.inventory.v1.BaseboardInfoOrBuilder getBaseboardOrBuilder();

  /**
   * <pre>
   * Chassis Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   * @return Whether the chassis field is set.
   */
  boolean hasChassis();
  /**
   * <pre>
   * Chassis Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   * @return The chassis.
   */
  opi_api.inventory.v1.ChassisInfo getChassis();
  /**
   * <pre>
   * Chassis Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   */
  opi_api.inventory.v1.ChassisInfoOrBuilder getChassisOrBuilder();

  /**
   * <pre>
   * CPU Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   * @return Whether the processor field is set.
   */
  boolean hasProcessor();
  /**
   * <pre>
   * CPU Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   * @return The processor.
   */
  opi_api.inventory.v1.CPUInfo getProcessor();
  /**
   * <pre>
   * CPU Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   */
  opi_api.inventory.v1.CPUInfoOrBuilder getProcessorOrBuilder();

  /**
   * <pre>
   * Memory Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <pre>
   * Memory Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   * @return The memory.
   */
  opi_api.inventory.v1.MemoryInfo getMemory();
  /**
   * <pre>
   * Memory Inventory
   * </pre>
   *
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   */
  opi_api.inventory.v1.MemoryInfoOrBuilder getMemoryOrBuilder();

  /**
   * <pre>
   * PCI Devices Inventory
   * </pre>
   *
   * <code>repeated .opi_api.inventory.v1.PCIeDeviceInfo pci = 7;</code>
   */
  java.util.List<opi_api.inventory.v1.PCIeDeviceInfo> 
      getPciList();
  /**
   * <pre>
   * PCI Devices Inventory
   * </pre>
   *
   * <code>repeated .opi_api.inventory.v1.PCIeDeviceInfo pci = 7;</code>
   */
  opi_api.inventory.v1.PCIeDeviceInfo getPci(int index);
  /**
   * <pre>
   * PCI Devices Inventory
   * </pre>
   *
   * <code>repeated .opi_api.inventory.v1.PCIeDeviceInfo pci = 7;</code>
   */
  int getPciCount();
  /**
   * <pre>
   * PCI Devices Inventory
   * </pre>
   *
   * <code>repeated .opi_api.inventory.v1.PCIeDeviceInfo pci = 7;</code>
   */
  java.util.List<? extends opi_api.inventory.v1.PCIeDeviceInfoOrBuilder> 
      getPciOrBuilderList();
  /**
   * <pre>
   * PCI Devices Inventory
   * </pre>
   *
   * <code>repeated .opi_api.inventory.v1.PCIeDeviceInfo pci = 7;</code>
   */
  opi_api.inventory.v1.PCIeDeviceInfoOrBuilder getPciOrBuilder(
      int index);
}