/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.newrelic.nrjmx.v2.jmx;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-06-21")
public enum JMXLoggerMessageLevel implements org.apache.thrift.TEnum {
  DEBUG(1),
  INFO(2),
  WARNING(3),
  ERROR(4);

  private final int value;

  private JMXLoggerMessageLevel(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static JMXLoggerMessageLevel findByValue(int value) { 
    switch (value) {
      case 1:
        return DEBUG;
      case 2:
        return INFO;
      case 3:
        return WARNING;
      case 4:
        return ERROR;
      default:
        return null;
    }
  }
}