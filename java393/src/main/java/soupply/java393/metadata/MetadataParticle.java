package soupply.java393.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataParticle extends MetadataValue
{

    public soupply.java393.type.Particle value;

    public MetadataParticle(byte id, soupply.java393.type.Particle value)
    {
        super(id, (byte)15);
        this.value = value;
    }

    public MetadataParticle(byte id)
    {
        this(id, new soupply.java393.type.Particle());
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        value.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value.decodeBody(_buffer);
    }

}
