package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ModalFormRequest extends soupply.bedrock201.Packet
{

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

}
