package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class CommandMessage extends Type
{

    public boolean isInternal;
    public String messageId;
    public String[] parameters;

    public CommandMessage()
    {
    }

    public CommandMessage(boolean isInternal, String messageId, String[] parameters)
    {
        this.isInternal = isInternal;
        this.messageId = messageId;
        this.parameters = parameters;
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
