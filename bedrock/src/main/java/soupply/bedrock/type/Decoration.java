package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class Decoration extends Type
{

    public int rotationAndIcon;
    public ByteXZ position;
    public String label;
    public int color;

    public Decoration()
    {
        this.position = new ByteXZ();
    }

    public Decoration(int rotationAndIcon, ByteXZ position, String label, int color)
    {
        this.rotationAndIcon = rotationAndIcon;
        this.position = position;
        this.label = label;
        this.color = color;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(rotationAndIcon);
        _buffer.writeByte(position.x);
        _buffer.writeByte(position.z);
        byte[] bfzw = _buffer.convertString(label);
        _buffer.writeVaruint((int)bfzw.length);
        _buffer.writeBytes(bfzw);
        _buffer.writeLittleEndianInt(color);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        rotationAndIcon = _buffer.readVarint();
        position.x = _buffer.readByte();
        position.z = _buffer.readByte();
        final int bvbfzw = _buffer.readVaruint();
        label = _buffer.readString(bvbfzw);
        color = _buffer.readLittleEndianInt();
    }

}
