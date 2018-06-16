package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class PurchaseReceipt extends soupply.bedrock141.Packet
{

    public static final int ID = 92;

    public String[] unknown0;

    public PurchaseReceipt()
    {
    }

    public PurchaseReceipt(String[] unknown0)
    {
        this.unknown0 = unknown0;
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
