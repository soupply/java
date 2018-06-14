package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ContainerClose extends soupply.bedrock160.Packet
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
