package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ContainerSetData extends soupply.bedrock150.Packet
{

    public byte window;
    public int property;
    public int value;

    public ContainerSetData()
    {
    }

    public ContainerSetData(byte window, int property, int value)
    {
        this.window = window;
        this.property = property;
        this.value = value;
    }

}
