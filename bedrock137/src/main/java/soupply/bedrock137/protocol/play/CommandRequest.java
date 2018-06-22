package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class CommandRequest extends soupply.bedrock137.Packet
{

    public static final int ID = 77;

    // type
    public static final int PLAYER = (int)0;
    public static final int COMMAND_BLOCK = (int)1;
    public static final int MINECART_COMMAND_BLOCK = (int)2;
    public static final int DEV_CONSOLE = (int)3;

    public String command;
    public int type;
    public String requestId;
    public int playerId;

    public CommandRequest()
    {
    }

    public CommandRequest(String command, int type, String requestId, int playerId)
    {
        this.command = command;
        this.type = type;
        this.requestId = requestId;
        this.playerId = playerId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] y9bfz = _buffer.convertString(command);
        _buffer.writeVaruint((int)y9bfz.length);
        _buffer.writeBytes(y9bfz);
        _buffer.writeVaruint(type);
        byte[] cvdvdl = _buffer.convertString(requestId);
        _buffer.writeVaruint((int)cvdvdl.length);
        _buffer.writeBytes(cvdvdl);
        if(type==3)
        {
            _buffer.writeVarint(playerId);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        type = _buffer.readVaruint();
        final int bvcvdvdl = _buffer.readVaruint();
        requestId = _buffer.readString(bvcvdvdl);
        if(type==3)
        {
            playerId = _buffer.readVarint();
        }
    }

    public static CommandRequest fromBuffer(byte[] buffer)
    {
        CommandRequest packet = new CommandRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
