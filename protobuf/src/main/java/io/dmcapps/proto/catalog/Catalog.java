// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog-product.proto

package io.dmcapps.proto.catalog;

public final class Catalog {
  private Catalog() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_dmcapps_proto_catalog_Category_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_dmcapps_proto_catalog_Category_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_dmcapps_proto_catalog_Brand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_dmcapps_proto_catalog_Brand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_dmcapps_proto_catalog_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_dmcapps_proto_catalog_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_dmcapps_proto_catalog_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_dmcapps_proto_catalog_ProductResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025catalog-product.proto\022\030io.dmcapps.prot" +
      "o.catalog\"\273\001\n\010Category\022\n\n\002id\030\001 \001(\003\022\016\n\006pa" +
      "rent\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\0229\n\006status\030\004 \001(\016" +
      "2).io.dmcapps.proto.catalog.Category.Sta" +
      "tus\"J\n\006Status\022\013\n\007UNKNOWN\020\000\022\013\n\007PENDING\020\001\022" +
      "\013\n\007CREATED\020\002\022\013\n\007UPDATED\020\003\022\014\n\010REJECTED\020\004\"" +
      "\266\001\n\005Brand\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\017\n\007p" +
      "icture\030\003 \001(\t\0226\n\006status\030\004 \001(\0162&.io.dmcapp" +
      "s.proto.catalog.Brand.Status\"J\n\006Status\022\013" +
      "\n\007UNKNOWN\020\000\022\013\n\007PENDING\020\001\022\013\n\007CREATED\020\002\022\013\n" +
      "\007UPDATED\020\003\022\014\n\010REJECTED\020\004\"\240\002\n\007Product\022\n\n\002" +
      "id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022.\n\005brand\030\003 \001(\0132\037." +
      "io.dmcapps.proto.catalog.Brand\0224\n\010catego" +
      "ry\030\004 \001(\0132\".io.dmcapps.proto.catalog.Cate" +
      "gory\022\017\n\007picture\030\005 \001(\t\0228\n\006status\030\006 \001(\0162(." +
      "io.dmcapps.proto.catalog.Product.Status\"" +
      "J\n\006Status\022\013\n\007UNKNOWN\020\000\022\013\n\007PENDING\020\001\022\013\n\007C" +
      "REATED\020\002\022\013\n\007UPDATED\020\003\022\014\n\010REJECTED\020\004\"F\n\017P" +
      "roductResponse\0223\n\010products\030\001 \003(\0132!.io.dm" +
      "capps.proto.catalog.ProductB\013B\007CatalogP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_dmcapps_proto_catalog_Category_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_dmcapps_proto_catalog_Category_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_dmcapps_proto_catalog_Category_descriptor,
        new java.lang.String[] { "Id", "Parent", "Name", "Status", });
    internal_static_io_dmcapps_proto_catalog_Brand_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_dmcapps_proto_catalog_Brand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_dmcapps_proto_catalog_Brand_descriptor,
        new java.lang.String[] { "Id", "Name", "Picture", "Status", });
    internal_static_io_dmcapps_proto_catalog_Product_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_dmcapps_proto_catalog_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_dmcapps_proto_catalog_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Brand", "Category", "Picture", "Status", });
    internal_static_io_dmcapps_proto_catalog_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_dmcapps_proto_catalog_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_dmcapps_proto_catalog_ProductResponse_descriptor,
        new java.lang.String[] { "Products", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
