package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class AvailableCommands extends soupply.bedrock141.Packet
{

    public static final int ID = 76;

    public String[] enumValues;
    public String[] unknown1;
    public soupply.bedrock141.type.Enum[] enums;
    public soupply.bedrock141.type.Command[] commands;

    public AvailableCommands()
    {
    }

    public AvailableCommands(String[] enumValues, String[] unknown1, soupply.bedrock141.type.Enum[] enums, soupply.bedrock141.type.Command[] commands)
    {
        this.enumValues = enumValues;
        this.unknown1 = unknown1;
        this.enums = enums;
        this.commands = commands;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)enumValues.length);
        for(String z5bzbvc:enumValues)
        {
            byte[] evejy = _buffer.convertString(z5bzbvc);
            _buffer.writeVaruint((int)evejy.length);
            _buffer.writeBytes(evejy);
        }
        _buffer.writeVaruint((int)unknown1.length);
        for(String d5b9be:unknown1)
        {
            byte[] zvoj = _buffer.convertString(d5b9be);
            _buffer.writeVaruint((int)zvoj.length);
            _buffer.writeBytes(zvoj);
        }
        _buffer.writeVaruint((int)enums.length);
        for(soupply.bedrock141.type.Enum z5bm:enums)
        {
            z5bm.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)commands.length);
        for(soupply.bedrock141.type.Command y9bfzm:commands)
        {
            y9bfzm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvd1yxzm = _buffer.readVaruint();
        for(int z5bzbvc=0;z5bzbvc<enumValues.length;z5bzbvc++)
        {
            final int bvz5bzbv = _buffer.readVaruint();
            enumValues[z5bzbvc] = _buffer.readString(bvz5bzbv);
        }
        final int bva5d4 = _buffer.readVaruint();
        for(int d5b9be=0;d5b9be<unknown1.length;d5b9be++)
        {
            final int bvd5b9bf = _buffer.readVaruint();
            unknown1[d5b9be] = _buffer.readString(bvd5b9bf);
        }
        final int bvd1 = _buffer.readVaruint();
        for(int z5bm=0;z5bm<enums.length;z5bm++)
        {
            enums[z5bm].decodeBody(_buffer);
        }
        final int bnb1br = _buffer.readVaruint();
        for(int y9bfzm=0;y9bfzm<commands.length;y9bfzm++)
        {
            commands[y9bfzm].decodeBody(_buffer);
        }
    }

    public static AvailableCommands fromBuffer(byte[] buffer)
    {
        AvailableCommands packet = new AvailableCommands();
        packet.safeDecode(buffer);
        return packet;
    }

}
