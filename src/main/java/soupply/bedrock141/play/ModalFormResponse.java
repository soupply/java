package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class ModalFormResponse extends soupply.bedrock141.Packet
{

    public int formId;
    public String data;

    public ModalFormResponse()
    {
    }

    public ModalFormResponse(int formId, String data)
    {
        this.formId = formId;
        this.data = data;
    }

}
