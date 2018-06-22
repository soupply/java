package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Section extends Type
{

    public byte storageVersion = 0;
    public byte[] blockIds;
    public byte[] blockMetas;

    public Section()
    {
        this.blockIds = new byte[4096];
        this.blockMetas = new byte[2048];
    }

    public Section(byte storageVersion, byte[] blockIds, byte[] blockMetas)
    {
        this.storageVersion = storageVersion;
        this.blockIds = blockIds;
        this.blockMetas = blockMetas;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(storageVersion);
        _buffer.writeBytes(blockIds);
        _buffer.writeBytes(blockMetas);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        storageVersion = _buffer.readByte();
        blockIds = _buffer.readBytes(blockIds.length);
        blockMetas = _buffer.readBytes(blockMetas.length);
    }

}
