package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class CommandBlockUpdate extends soupply.bedrock137.Packet
{

    public static final int ID = 78;

    public boolean updateBlock;
    public soupply.bedrock137.type.BlockPosition position;
    public int mode;
    public boolean redstoneMode;
    public boolean conditional;
    public long minecart;
    public String command;
    public String lastOutput;
    public String hover;
    public boolean trackOutput;

    public CommandBlockUpdate()
    {
        this.position = new soupply.bedrock137.type.BlockPosition();
    }

    public CommandBlockUpdate(boolean updateBlock, soupply.bedrock137.type.BlockPosition position, int mode, boolean redstoneMode, boolean conditional, long minecart, String command, String lastOutput, String hover, boolean trackOutput)
    {
        this.updateBlock = updateBlock;
        this.position = position;
        this.mode = mode;
        this.redstoneMode = redstoneMode;
        this.conditional = conditional;
        this.minecart = minecart;
        this.command = command;
        this.lastOutput = lastOutput;
        this.hover = hover;
        this.trackOutput = trackOutput;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(updateBlock);
        if(updateBlock==true)
        {
            position.encodeBody(_buffer);
            _buffer.writeVaruint(mode);
            _buffer.writeBool(redstoneMode);
            _buffer.writeBool(conditional);
        }
        if(updateBlock==false)
        {
            _buffer.writeVarlong(minecart);
        }
        byte[] y9bfz = _buffer.convertString(command);
        _buffer.writeVaruint((int)y9bfz.length);
        _buffer.writeBytes(y9bfz);
        byte[] bfd9dbd = _buffer.convertString(lastOutput);
        _buffer.writeVaruint((int)bfd9dbd.length);
        _buffer.writeBytes(bfd9dbd);
        byte[] a9zi = _buffer.convertString(hover);
        _buffer.writeVaruint((int)a9zi.length);
        _buffer.writeBytes(a9zi);
        _buffer.writeBool(trackOutput);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        updateBlock = _buffer.readBool();
        if(updateBlock==true)
        {
            position.decodeBody(_buffer);
            mode = _buffer.readVaruint();
            redstoneMode = _buffer.readBool();
            conditional = _buffer.readBool();
        }
        if(updateBlock==false)
        {
            minecart = _buffer.readVarlong();
        }
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        final int bvbfd9db = _buffer.readVaruint();
        lastOutput = _buffer.readString(bvbfd9db);
        final int bva9zi = _buffer.readVaruint();
        hover = _buffer.readString(bva9zi);
        trackOutput = _buffer.readBool();
    }

    public static CommandBlockUpdate fromBuffer(byte[] buffer)
    {
        CommandBlockUpdate packet = new CommandBlockUpdate();
        packet.safeDecode(buffer);
        return packet;
    }

}
