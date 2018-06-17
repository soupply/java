package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class CommandRequest extends soupply.bedrock201.Packet
{

    public static final int ID = 77;

    // type
    public static final int PLAYER = (int)0;
    public static final int COMMAND_BLOCK = (int)1;
    public static final int MINECART_COMMAND_BLOCK = (int)2;
    public static final int DEV_CONSOLE = (int)3;

    public String command;
    public int type;
    public soupply.bedrock201.type.McpeUuid uuid;
    public String requestId;
    public int playerId;
    public boolean internal;

    public CommandRequest()
    {
        this.uuid = new soupply.bedrock201.type.McpeUuid();
    }

    public CommandRequest(String command, int type, soupply.bedrock201.type.McpeUuid uuid, String requestId, int playerId, boolean internal)
    {
        this.command = command;
        this.type = type;
        this.uuid = uuid;
        this.requestId = requestId;
        this.playerId = playerId;
        this.internal = internal;
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
        uuid.encodeBody(_buffer);
        byte[] cvdvdl = _buffer.convertString(requestId);
        _buffer.writeVaruint((int)cvdvdl.length);
        _buffer.writeBytes(cvdvdl);
        _buffer.writeVarint(playerId);
        _buffer.writeBool(internal);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        type = _buffer.readVaruint();
        uuid.decodeBody(_buffer);
        final int bvcvdvdl = _buffer.readVaruint();
        requestId = _buffer.readString(bvcvdvdl);
        playerId = _buffer.readVarint();
        internal = _buffer.readBool();
    }

    public static CommandRequest fromBuffer(byte[] buffer)
    {
        CommandRequest packet = new CommandRequest();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
