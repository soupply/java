package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Overload extends Type
{

    public soupply.bedrock141.type.Parameter[] parameters;

    public Overload()
    {
    }

    public Overload(soupply.bedrock141.type.Parameter[] parameters)
    {
        this.parameters = parameters;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)parameters.length);
        for(soupply.bedrock141.type.Parameter cfy1dvc:parameters)
        {
            cfy1dvc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bbcfzrcm = _buffer.readVaruint();
        parameters = new soupply.bedrock141.type.Parameter[bbcfzrcm];
        for(int cfy1dvc=0;cfy1dvc<parameters.length;cfy1dvc++)
        {
            parameters[cfy1dvc].decodeBody(_buffer);
        }
    }

}
