// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/profiler/protobuf/xplane.proto

package org.tensorflow.proto.profiler;

public interface XStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.profiler.XStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * XStatMetadata.id of corresponding metadata.
   * </pre>
   *
   * <code>int64 metadata_id = 1;</code>
   */
  long getMetadataId();

  /**
   * <code>double double_value = 2;</code>
   */
  double getDoubleValue();

  /**
   * <code>uint64 uint64_value = 3;</code>
   */
  long getUint64Value();

  /**
   * <code>int64 int64_value = 4;</code>
   */
  long getInt64Value();

  /**
   * <code>string str_value = 5;</code>
   */
  java.lang.String getStrValue();
  /**
   * <code>string str_value = 5;</code>
   */
  com.google.protobuf.ByteString
      getStrValueBytes();

  /**
   * <code>bytes bytes_value = 6;</code>
   */
  com.google.protobuf.ByteString getBytesValue();

  /**
   * <pre>
   * A string value that stored in XStatMetadata::name.
   * </pre>
   *
   * <code>uint64 ref_value = 7;</code>
   */
  long getRefValue();

  public org.tensorflow.proto.profiler.XStat.ValueCase getValueCase();
}
