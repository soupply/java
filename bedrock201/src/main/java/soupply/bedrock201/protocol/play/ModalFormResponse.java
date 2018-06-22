package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class ModalFormResponse extends soupply.bedrock201.Packet
{

    public static final int ID = 101;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(formId);
        byte[] zfy = _buffer.convertString(data);
        _buffer.writeVaruint((int)zfy.length);
        _buffer.writeBytes(zfy);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        formId = _buffer.readVaruint();
        final int bvzfy = _buffer.readVaruint();
        data = _buffer.readString(bvzfy);
    }

    public static ModalFormResponse fromBuffer(byte[] buffer)
    {
        ModalFormResponse packet = new ModalFormResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
