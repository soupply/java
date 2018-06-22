package soupply.bedrock261.type;

import java.util.*;
import soupply.util.*;

public class CommandMessage extends Type
{

    public boolean isInternal;
    public String messageId;
    public String[] parameters;

    public CommandMessage()
    {
    }

    public CommandMessage(boolean isInternal, String messageId, String[] parameters)
    {
        this.isInternal = isInternal;
        this.messageId = messageId;
        this.parameters = parameters;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(isInternal);
        byte[] bvcfzl = _buffer.convertString(messageId);
        _buffer.writeVaruint((int)bvcfzl.length);
        _buffer.writeBytes(bvcfzl);
        _buffer.writeVaruint((int)parameters.length);
        for(String cfy1dvc:parameters)
        {
            byte[] yzmry = _buffer.convertString(cfy1dvc);
            _buffer.writeVaruint((int)yzmry.length);
            _buffer.writeBytes(yzmry);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        isInternal = _buffer.readBool();
        final int bvbvcfzl = _buffer.readVaruint();
        messageId = _buffer.readString(bvbvcfzl);
        final int bbcfzrcm = _buffer.readVaruint();
        parameters = new String[bbcfzrcm];
        for(int cfy1dvc=0;cfy1dvc<parameters.length;cfy1dvc++)
        {
            final int bvcfy1dv = _buffer.readVaruint();
            parameters[cfy1dvc] = _buffer.readString(bvcfy1dv);
        }
    }

}
