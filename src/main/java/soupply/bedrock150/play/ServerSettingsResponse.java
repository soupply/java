package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ServerSettingsResponse extends soupply.bedrock150.Packet
{

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

}
