package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class ServerSettingsResponse extends soupply.bedrock150.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
