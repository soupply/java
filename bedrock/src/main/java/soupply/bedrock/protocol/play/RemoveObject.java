package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class RemoveObject extends soupply.bedrock.Packet
{

    public static final int ID = 106;

    public String objectName;

    public RemoveObject()
    {
    }

    public RemoveObject(String objectName)
    {
        this.objectName = objectName;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
