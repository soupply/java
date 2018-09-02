package soupply.bedrock282.type;

import java.util.*;
import soupply.util.*;

public class Score extends Type
{

    public UUID uuid;
    public String objectiveName;
    public int score;

    public Score()
    {
        this.uuid = new UUID(0, 0);
    }

    public Score(UUID uuid, String objectiveName, int score)
    {
        this.uuid = uuid;
        this.objectiveName = objectiveName;
        this.score = score;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(uuid);
        byte[] bjznaztf = _buffer.convertString(objectiveName);
        _buffer.writeVaruint((int)bjznaztf.length);
        _buffer.writeBytes(bjznaztf);
        _buffer.writeLittleEndianInt(score);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        uuid = _buffer.readUUID();
        final int bvbjznaz = _buffer.readVaruint();
        objectiveName = _buffer.readString(bvbjznaz);
        score = _buffer.readLittleEndianInt();
    }

}
