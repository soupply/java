package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ModalFormRequest extends soupply.bedrock150.Packet
{

    public static final int ID = 100;

    public int formId;
    public String data;

    public ModalFormRequest()
    {
    }

    public ModalFormRequest(int formId, String data)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
