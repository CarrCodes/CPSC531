// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test_amrm_token.proto

package org.apache.hadoop.yarn.proto;

public final class YarnSecurityTestAMRMTokenProtos {
  private YarnSecurityTestAMRMTokenProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AMRMTokenIdentifierForTestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.yarn.AMRMTokenIdentifierForTestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    boolean hasAppAttemptId();
    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto getAppAttemptId();
    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder getAppAttemptIdOrBuilder();

    /**
     * <code>optional int32 keyId = 2;</code>
     */
    boolean hasKeyId();
    /**
     * <code>optional int32 keyId = 2;</code>
     */
    int getKeyId();

    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code hadoop.yarn.AMRMTokenIdentifierForTestProto}
   */
  public  static final class AMRMTokenIdentifierForTestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.yarn.AMRMTokenIdentifierForTestProto)
      AMRMTokenIdentifierForTestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AMRMTokenIdentifierForTestProto.newBuilder() to construct.
    private AMRMTokenIdentifierForTestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AMRMTokenIdentifierForTestProto() {
      message_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AMRMTokenIdentifierForTestProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = appAttemptId_.toBuilder();
              }
              appAttemptId_ = input.readMessage(org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(appAttemptId_);
                appAttemptId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              keyId_ = input.readInt32();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              message_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.class, org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.Builder.class);
    }

    private int bitField0_;
    public static final int APPATTEMPTID_FIELD_NUMBER = 1;
    private org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto appAttemptId_;
    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    public boolean hasAppAttemptId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    public org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto getAppAttemptId() {
      return appAttemptId_ == null ? org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.getDefaultInstance() : appAttemptId_;
    }
    /**
     * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
     */
    public org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder getAppAttemptIdOrBuilder() {
      return appAttemptId_ == null ? org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.getDefaultInstance() : appAttemptId_;
    }

    public static final int KEYID_FIELD_NUMBER = 2;
    private int keyId_;
    /**
     * <code>optional int32 keyId = 2;</code>
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 keyId = 2;</code>
     */
    public int getKeyId() {
      return keyId_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private volatile java.lang.Object message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getAppAttemptId());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, keyId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, getAppAttemptId());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt32Size(2, keyId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto other = (org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto) obj;

      if (hasAppAttemptId() != other.hasAppAttemptId()) return false;
      if (hasAppAttemptId()) {
        if (!getAppAttemptId()
            .equals(other.getAppAttemptId())) return false;
      }
      if (hasKeyId() != other.hasKeyId()) return false;
      if (hasKeyId()) {
        if (getKeyId()
            != other.getKeyId()) return false;
      }
      if (hasMessage() != other.hasMessage()) return false;
      if (hasMessage()) {
        if (!getMessage()
            .equals(other.getMessage())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAppAttemptId()) {
        hash = (37 * hash) + APPATTEMPTID_FIELD_NUMBER;
        hash = (53 * hash) + getAppAttemptId().hashCode();
      }
      if (hasKeyId()) {
        hash = (37 * hash) + KEYID_FIELD_NUMBER;
        hash = (53 * hash) + getKeyId();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.yarn.AMRMTokenIdentifierForTestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.yarn.AMRMTokenIdentifierForTestProto)
        org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.class, org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAppAttemptIdFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (appAttemptIdBuilder_ == null) {
          appAttemptId_ = null;
        } else {
          appAttemptIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        keyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto getDefaultInstanceForType() {
        return org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto build() {
        org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto buildPartial() {
        org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto result = new org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (appAttemptIdBuilder_ == null) {
            result.appAttemptId_ = appAttemptId_;
          } else {
            result.appAttemptId_ = appAttemptIdBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.keyId_ = keyId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto) {
          return mergeFrom((org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto other) {
        if (other == org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto.getDefaultInstance()) return this;
        if (other.hasAppAttemptId()) {
          mergeAppAttemptId(other.getAppAttemptId());
        }
        if (other.hasKeyId()) {
          setKeyId(other.getKeyId());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto appAttemptId_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder> appAttemptIdBuilder_;
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public boolean hasAppAttemptId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto getAppAttemptId() {
        if (appAttemptIdBuilder_ == null) {
          return appAttemptId_ == null ? org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.getDefaultInstance() : appAttemptId_;
        } else {
          return appAttemptIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public Builder setAppAttemptId(org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto value) {
        if (appAttemptIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          appAttemptId_ = value;
          onChanged();
        } else {
          appAttemptIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public Builder setAppAttemptId(
          org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder builderForValue) {
        if (appAttemptIdBuilder_ == null) {
          appAttemptId_ = builderForValue.build();
          onChanged();
        } else {
          appAttemptIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public Builder mergeAppAttemptId(org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto value) {
        if (appAttemptIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              appAttemptId_ != null &&
              appAttemptId_ != org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.getDefaultInstance()) {
            appAttemptId_ =
              org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.newBuilder(appAttemptId_).mergeFrom(value).buildPartial();
          } else {
            appAttemptId_ = value;
          }
          onChanged();
        } else {
          appAttemptIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public Builder clearAppAttemptId() {
        if (appAttemptIdBuilder_ == null) {
          appAttemptId_ = null;
          onChanged();
        } else {
          appAttemptIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder getAppAttemptIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAppAttemptIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      public org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder getAppAttemptIdOrBuilder() {
        if (appAttemptIdBuilder_ != null) {
          return appAttemptIdBuilder_.getMessageOrBuilder();
        } else {
          return appAttemptId_ == null ?
              org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.getDefaultInstance() : appAttemptId_;
        }
      }
      /**
       * <code>optional .hadoop.yarn.ApplicationAttemptIdProto appAttemptId = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder> 
          getAppAttemptIdFieldBuilder() {
        if (appAttemptIdBuilder_ == null) {
          appAttemptIdBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProto.Builder, org.apache.hadoop.yarn.proto.YarnProtos.ApplicationAttemptIdProtoOrBuilder>(
                  getAppAttemptId(),
                  getParentForChildren(),
                  isClean());
          appAttemptId_ = null;
        }
        return appAttemptIdBuilder_;
      }

      private int keyId_ ;
      /**
       * <code>optional int32 keyId = 2;</code>
       */
      public boolean hasKeyId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 keyId = 2;</code>
       */
      public int getKeyId() {
        return keyId_;
      }
      /**
       * <code>optional int32 keyId = 2;</code>
       */
      public Builder setKeyId(int value) {
        bitField0_ |= 0x00000002;
        keyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 keyId = 2;</code>
       */
      public Builder clearKeyId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keyId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.yarn.AMRMTokenIdentifierForTestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.yarn.AMRMTokenIdentifierForTestProto)
    private static final org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto();
    }

    public static org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AMRMTokenIdentifierForTestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AMRMTokenIdentifierForTestProto>() {
      @java.lang.Override
      public AMRMTokenIdentifierForTestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AMRMTokenIdentifierForTestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AMRMTokenIdentifierForTestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AMRMTokenIdentifierForTestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.yarn.proto.YarnSecurityTestAMRMTokenProtos.AMRMTokenIdentifierForTestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025test_amrm_token.proto\022\013hadoop.yarn\032\021ya" +
      "rn_protos.proto\"\177\n\037AMRMTokenIdentifierFo" +
      "rTestProto\022<\n\014appAttemptId\030\001 \001(\0132&.hadoo" +
      "p.yarn.ApplicationAttemptIdProto\022\r\n\005keyI" +
      "d\030\002 \001(\005\022\017\n\007message\030\003 \001(\tBE\n\034org.apache.h" +
      "adoop.yarn.protoB\037YarnSecurityTestAMRMTo" +
      "kenProtos\210\001\001\240\001\001"
    };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.yarn.proto.YarnProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_yarn_AMRMTokenIdentifierForTestProto_descriptor,
        new java.lang.String[] { "AppAttemptId", "KeyId", "Message", });
    org.apache.hadoop.yarn.proto.YarnProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
