package org.wololo.flatgeobuf.generated;
// automatically generated by the FlatBuffers compiler, do not modify

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Crs extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_24_12_23(); }
  public static Crs getRootAsCrs(ByteBuffer _bb) { return getRootAsCrs(_bb, new Crs()); }
  public static Crs getRootAsCrs(ByteBuffer _bb, Crs obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Crs __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String org() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer orgAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer orgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int code() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String name() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String description() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer descriptionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public String wkt() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer wktAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer wktInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public String codeString() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer codeStringAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer codeStringInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }

  public static int createCrs(FlatBufferBuilder builder,
      int orgOffset,
      int code,
      int nameOffset,
      int descriptionOffset,
      int wktOffset,
      int codeStringOffset) {
    builder.startTable(6);
    Crs.addCodeString(builder, codeStringOffset);
    Crs.addWkt(builder, wktOffset);
    Crs.addDescription(builder, descriptionOffset);
    Crs.addName(builder, nameOffset);
    Crs.addCode(builder, code);
    Crs.addOrg(builder, orgOffset);
    return Crs.endCrs(builder);
  }

  public static void startCrs(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addOrg(FlatBufferBuilder builder, int orgOffset) { builder.addOffset(0, orgOffset, 0); }
  public static void addCode(FlatBufferBuilder builder, int code) { builder.addInt(1, code, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(2, nameOffset, 0); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(3, descriptionOffset, 0); }
  public static void addWkt(FlatBufferBuilder builder, int wktOffset) { builder.addOffset(4, wktOffset, 0); }
  public static void addCodeString(FlatBufferBuilder builder, int codeStringOffset) { builder.addOffset(5, codeStringOffset, 0); }
  public static int endCrs(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Crs get(int j) { return get(new Crs(), j); }
    public Crs get(Crs obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}