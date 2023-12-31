// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Information about a Tensor necessary for feeding or retrieval.
 * </pre>
 * <p>
 * Protobuf type {@code tensorflow.TensorInfo}
 */
public final class TensorInfo extends
                              com.google.protobuf.GeneratedMessageV3 implements
                                                                     // @@protoc_insertion_point(message_implements:tensorflow.TensorInfo)
                                                                             TensorInfoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use TensorInfo.newBuilder() to construct.
    private TensorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private TensorInfo() {
        name_ = "";
        dtype_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new TensorInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_TensorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_TensorInfo_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.tensorflow.framework.TensorInfo.class, org.tensorflow.framework.TensorInfo.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";

    /**
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
        }
    }

    /**
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            name_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int DTYPE_FIELD_NUMBER = 2;
    private int dtype_ = 0;

    /**
     * <code>.tensorflow.DataType dtype = 2;</code>
     *
     * @return The enum numeric value on the wire for dtype.
     */
    @java.lang.Override
    public int getDtypeValue() {
        return dtype_;
    }

    /**
     * <code>.tensorflow.DataType dtype = 2;</code>
     *
     * @return The dtype.
     */
    @java.lang.Override
    public org.tensorflow.framework.DataType getDtype() {
        org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.forNumber(dtype_);
        return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
    }

    public static final int TENSOR_SHAPE_FIELD_NUMBER = 3;
    private org.tensorflow.framework.TensorShapeProto tensorShape_;

    /**
     * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
     *
     * @return Whether the tensorShape field is set.
     */
    @java.lang.Override
    public boolean hasTensorShape() {
        return tensorShape_ != null;
    }

    /**
     * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
     *
     * @return The tensorShape.
     */
    @java.lang.Override
    public org.tensorflow.framework.TensorShapeProto getTensorShape() {
        return tensorShape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : tensorShape_;
    }

    /**
     * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
     */
    @java.lang.Override
    public org.tensorflow.framework.TensorShapeProtoOrBuilder getTensorShapeOrBuilder() {
        return tensorShape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : tensorShape_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
        }
        if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
            output.writeEnum(2, dtype_);
        }
        if (tensorShape_ != null) {
            output.writeMessage(3, getTensorShape());
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
        }
        if (dtype_ != org.tensorflow.framework.DataType.DT_INVALID.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(2, dtype_);
        }
        if (tensorShape_ != null) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, getTensorShape());
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.tensorflow.framework.TensorInfo)) {
            return super.equals(obj);
        }
        org.tensorflow.framework.TensorInfo other = (org.tensorflow.framework.TensorInfo) obj;

        if (!getName()
                .equals(other.getName())) return false;
        if (dtype_ != other.dtype_) return false;
        if (hasTensorShape() != other.hasTensorShape()) return false;
        if (hasTensorShape()) {
            if (!getTensorShape()
                    .equals(other.getTensorShape())) return false;
        }
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        hash = (37 * hash) + DTYPE_FIELD_NUMBER;
        hash = (53 * hash) + dtype_;
        if (hasTensorShape()) {
            hash = (37 * hash) + TENSOR_SHAPE_FIELD_NUMBER;
            hash = (53 * hash) + getTensorShape().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.tensorflow.framework.TensorInfo parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.tensorflow.framework.TensorInfo parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.tensorflow.framework.TensorInfo parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {return newBuilder();}

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.tensorflow.framework.TensorInfo prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * Information about a Tensor necessary for feeding or retrieval.
     * </pre>
     * <p>
     * Protobuf type {@code tensorflow.TensorInfo}
     */
    public static final class Builder extends
                                      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                                                                                              // @@protoc_insertion_point(builder_implements:tensorflow.TensorInfo)
                                                                                                      org.tensorflow.framework.TensorInfoOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_TensorInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_TensorInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            org.tensorflow.framework.TensorInfo.class,
                            org.tensorflow.framework.TensorInfo.Builder.class);
        }

        // Construct using org.tensorflow.framework.TensorInfo.newBuilder()
        private Builder() {

        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);

        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            name_ = "";
            dtype_ = 0;
            tensorShape_ = null;
            if (tensorShapeBuilder_ != null) {
                tensorShapeBuilder_.dispose();
                tensorShapeBuilder_ = null;
            }
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_TensorInfo_descriptor;
        }

        @java.lang.Override
        public org.tensorflow.framework.TensorInfo getDefaultInstanceForType() {
            return org.tensorflow.framework.TensorInfo.getDefaultInstance();
        }

        @java.lang.Override
        public org.tensorflow.framework.TensorInfo build() {
            org.tensorflow.framework.TensorInfo result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public org.tensorflow.framework.TensorInfo buildPartial() {
            org.tensorflow.framework.TensorInfo result = new org.tensorflow.framework.TensorInfo(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(org.tensorflow.framework.TensorInfo result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.name_ = name_;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.dtype_ = dtype_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.tensorShape_ = tensorShapeBuilder_ == null
                        ? tensorShape_
                        : tensorShapeBuilder_.build();
            }
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof org.tensorflow.framework.TensorInfo) {
                return mergeFrom((org.tensorflow.framework.TensorInfo) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(org.tensorflow.framework.TensorInfo other) {
            if (other == org.tensorflow.framework.TensorInfo.getDefaultInstance()) return this;
            if (!other.getName().isEmpty()) {
                name_ = other.name_;
                bitField0_ |= 0x00000001;
                onChanged();
            }
            if (other.dtype_ != 0) {
                setDtypeValue(other.getDtypeValue());
            }
            if (other.hasTensorShape()) {
                mergeTensorShape(other.getTensorShape());
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            name_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 16: {
                            dtype_ = input.readEnum();
                            bitField0_ |= 0x00000002;
                            break;
                        } // case 16
                        case 26: {
                            input.readMessage(
                                    getTensorShapeFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000004;
                            break;
                        } // case 26
                        default: {
                            if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                done = true; // was an endgroup tag
                            }
                            break;
                        } // default:
                    } // switch (tag)
                } // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            } // finally
            return this;
        }

        private int bitField0_;

        private java.lang.Object name_ = "";

        /**
         * <code>string name = 1;</code>
         *
         * @return The name.
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string name = 1;</code>
         *
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string name = 1;</code>
         *
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            name_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>string name = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            name_ = getDefaultInstance().getName();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>string name = 1;</code>
         *
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            name_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        private int dtype_ = 0;

        /**
         * <code>.tensorflow.DataType dtype = 2;</code>
         *
         * @return The enum numeric value on the wire for dtype.
         */
        @java.lang.Override
        public int getDtypeValue() {
            return dtype_;
        }

        /**
         * <code>.tensorflow.DataType dtype = 2;</code>
         *
         * @param value The enum numeric value on the wire for dtype to set.
         * @return This builder for chaining.
         */
        public Builder setDtypeValue(int value) {
            dtype_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.DataType dtype = 2;</code>
         *
         * @return The dtype.
         */
        @java.lang.Override
        public org.tensorflow.framework.DataType getDtype() {
            org.tensorflow.framework.DataType result = org.tensorflow.framework.DataType.forNumber(dtype_);
            return result == null ? org.tensorflow.framework.DataType.UNRECOGNIZED : result;
        }

        /**
         * <code>.tensorflow.DataType dtype = 2;</code>
         *
         * @param value The dtype to set.
         * @return This builder for chaining.
         */
        public Builder setDtype(org.tensorflow.framework.DataType value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000002;
            dtype_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.DataType dtype = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDtype() {
            bitField0_ = (bitField0_ & ~0x00000002);
            dtype_ = 0;
            onChanged();
            return this;
        }

        private org.tensorflow.framework.TensorShapeProto tensorShape_;
        private com.google.protobuf.SingleFieldBuilderV3<
                org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> tensorShapeBuilder_;

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         *
         * @return Whether the tensorShape field is set.
         */
        public boolean hasTensorShape() {
            return ((bitField0_ & 0x00000004) != 0);
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         *
         * @return The tensorShape.
         */
        public org.tensorflow.framework.TensorShapeProto getTensorShape() {
            if (tensorShapeBuilder_ == null) {
                return tensorShape_ ==
                       null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : tensorShape_;
            } else {
                return tensorShapeBuilder_.getMessage();
            }
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public Builder setTensorShape(org.tensorflow.framework.TensorShapeProto value) {
            if (tensorShapeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                tensorShape_ = value;
            } else {
                tensorShapeBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public Builder setTensorShape(
                org.tensorflow.framework.TensorShapeProto.Builder builderForValue) {
            if (tensorShapeBuilder_ == null) {
                tensorShape_ = builderForValue.build();
            } else {
                tensorShapeBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public Builder mergeTensorShape(org.tensorflow.framework.TensorShapeProto value) {
            if (tensorShapeBuilder_ == null) {
                if (((bitField0_ & 0x00000004) != 0) &&
                    tensorShape_ != null &&
                    tensorShape_ != org.tensorflow.framework.TensorShapeProto.getDefaultInstance()) {
                    getTensorShapeBuilder().mergeFrom(value);
                } else {
                    tensorShape_ = value;
                }
            } else {
                tensorShapeBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public Builder clearTensorShape() {
            bitField0_ = (bitField0_ & ~0x00000004);
            tensorShape_ = null;
            if (tensorShapeBuilder_ != null) {
                tensorShapeBuilder_.dispose();
                tensorShapeBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public org.tensorflow.framework.TensorShapeProto.Builder getTensorShapeBuilder() {
            bitField0_ |= 0x00000004;
            onChanged();
            return getTensorShapeFieldBuilder().getBuilder();
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        public org.tensorflow.framework.TensorShapeProtoOrBuilder getTensorShapeOrBuilder() {
            if (tensorShapeBuilder_ != null) {
                return tensorShapeBuilder_.getMessageOrBuilder();
            } else {
                return tensorShape_ == null ?
                        org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : tensorShape_;
            }
        }

        /**
         * <code>.tensorflow.TensorShapeProto tensor_shape = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>
        getTensorShapeFieldBuilder() {
            if (tensorShapeBuilder_ == null) {
                tensorShapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>(
                        getTensorShape(),
                        getParentForChildren(),
                        isClean());
                tensorShape_ = null;
            }
            return tensorShapeBuilder_;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:tensorflow.TensorInfo)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.TensorInfo)
    private static final org.tensorflow.framework.TensorInfo DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new org.tensorflow.framework.TensorInfo();
    }

    public static org.tensorflow.framework.TensorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TensorInfo>
            PARSER = new com.google.protobuf.AbstractParser<TensorInfo>() {
        @java.lang.Override
        public TensorInfo parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
                builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                        .setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
        }
    };

    public static com.google.protobuf.Parser<TensorInfo> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TensorInfo> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

