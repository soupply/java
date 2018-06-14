package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ContainerClose extends soupply.bedrock201.Packet
{

    public byte window;

    public ContainerClose()
    {
    }

    public ContainerClose(byte window)
    {
        this.window = window;
    }

}
