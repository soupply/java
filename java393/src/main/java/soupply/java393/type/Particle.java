package soupply.java393.type;

import java.util.*;
import soupply.util.*;

public class Particle extends Type
{

    public int id;
    public int dataVaruint;
    public float dataFloat;
    public soupply.java393.type.Slot dataSlot;

    public Particle()
    {
        this.dataSlot = new soupply.java393.type.Slot();
    }

    public Particle(int id, int dataVaruint, float dataFloat, soupply.java393.type.Slot dataSlot)
    {
        this.id = id;
        this.dataVaruint = dataVaruint;
        this.dataFloat = dataFloat;
        this.dataSlot = dataSlot;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(id);
        if(id==3||id==20)
        {
            _buffer.writeVaruint(dataVaruint);
        }
        if(id==11)
        {
            _buffer.writeBigEndianFloat(dataFloat);
        }
        if(id==27)
        {
            dataSlot.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        id = _buffer.readVaruint();
        if(id==3||id==20)
        {
            dataVaruint = _buffer.readVaruint();
        }
        if(id==11)
        {
            dataFloat = _buffer.readBigEndianFloat();
        }
        if(id==27)
        {
            dataSlot.decodeBody(_buffer);
        }
    }

}
