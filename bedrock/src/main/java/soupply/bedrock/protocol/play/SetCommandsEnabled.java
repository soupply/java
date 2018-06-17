package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetCommandsEnabled extends soupply.bedrock.Packet
{

    public static final int ID = 59;

    public boolean enabled;

    public SetCommandsEnabled()
    {
    }

    public SetCommandsEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(enabled);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        enabled = _buffer.readBool();
    }

    public static SetCommandsEnabled fromBuffer(byte[] buffer)
    {
        SetCommandsEnabled packet = new SetCommandsEnabled();
        packet.safeDecode(buffer);
        return packet;
    }

}
