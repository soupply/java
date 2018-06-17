package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ServerSettingsResponse extends soupply.bedrock261.Packet
{

    public static final int ID = 103;

    public int formId;
    public String data;

    public ServerSettingsResponse()
    {
    }

    public ServerSettingsResponse(int formId, String data)
    {
        this.formId = formId;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(formId);
        byte[] zfy = _buffer.convertString(data);
        _buffer.writeVaruint((int)zfy.length);
        _buffer.writeBytes(zfy);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        formId = _buffer.readVaruint();
        final int bvzfy = _buffer.readVaruint();
        data = _buffer.readString(bvzfy);
    }

    public static ServerSettingsResponse fromBuffer(byte[] buffer)
    {
        ServerSettingsResponse packet = new ServerSettingsResponse();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
