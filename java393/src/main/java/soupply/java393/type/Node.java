package soupply.java393.type;

import java.util.*;
import soupply.util.*;

public class Node extends Type
{

    public byte flags;
    public int[] children;
    public int redirectNode;
    public String name;
    public String parser;
    public byte[] properties;

    public Node()
    {
    }

    public Node(byte flags, int[] children, int redirectNode, String name, String parser, byte[] properties)
    {
        this.flags = flags;
        this.children = children;
        this.redirectNode = redirectNode;
        this.name = name;
        this.parser = parser;
        this.properties = properties;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(flags);
        _buffer.writeVaruint((int)children.length);
        for(int yhbrz4:children)
        {
            _buffer.writeVaruint(yhbrz4);
        }
        if((flags&8)!=0)
        {
            _buffer.writeVaruint(redirectNode);
        }
        if((flags&1)!=0||(flags&2)!=0)
        {
            byte[] bfz = _buffer.convertString(name);
            _buffer.writeVaruint((int)bfz.length);
            _buffer.writeBytes(bfz);
        }
        if((flags&2)!=0)
        {
            byte[] cfcv = _buffer.convertString(parser);
            _buffer.writeVaruint((int)cfcv.length);
            _buffer.writeBytes(cfcv);
            _buffer.writeBytes(properties);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        flags = _buffer.readByte();
        final int bnaxcv = _buffer.readVaruint();
        children = new int[bnaxcv];
        for(int yhbrz4=0;yhbrz4<children.length;yhbrz4++)
        {
            children[yhbrz4] = _buffer.readVaruint();
        }
        if((flags&8)!=0)
        {
            redirectNode = _buffer.readVaruint();
        }
        if((flags&1)!=0||(flags&2)!=0)
        {
            final int bvbfz = _buffer.readVaruint();
            name = _buffer.readString(bvbfz);
        }
        if((flags&2)!=0)
        {
            final int bvcfcv = _buffer.readVaruint();
            parser = _buffer.readString(bvcfcv);
            properties = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
        }
    }

}
