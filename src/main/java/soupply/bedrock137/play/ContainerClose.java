package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ContainerClose extends soupply.bedrock137.Packet
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
