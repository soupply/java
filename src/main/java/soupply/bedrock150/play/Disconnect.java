package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.bedrock150.Packet
{

    public boolean hideDisconnectionScreen;
    public String message;

    public Disconnect()
    {
    }

    public Disconnect(boolean hideDisconnectionScreen, String message)
    {
        this.hideDisconnectionScreen = hideDisconnectionScreen;
        this.message = message;
    }

}
