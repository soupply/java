package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.bedrock160.Packet
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
