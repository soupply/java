package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class CraftingEvent extends soupply.bedrock160.Packet
{

    public static final int ID = 53;

    public byte window;
    public int type;
    public soupply.bedrock160.type.McpeUuid uuid;
    public soupply.bedrock160.type.Slot[] input;
    public soupply.bedrock160.type.Slot[] output;

    public CraftingEvent()
    {
        this.uuid = new soupply.bedrock160.type.McpeUuid();
    }

    public CraftingEvent(byte window, int type, soupply.bedrock160.type.McpeUuid uuid, soupply.bedrock160.type.Slot[] input, soupply.bedrock160.type.Slot[] output)
    {
        this.window = window;
        this.type = type;
        this.uuid = uuid;
        this.input = input;
        this.output = output;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianByte(window);
        _buffer.writeVarint(type);
        uuid.encodeBody(_buffer);
        _buffer.writeVaruint((int)input.length);
        for(soupply.bedrock160.type.Slot a5dq:input)
        {
            a5dq.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)output.length);
        for(soupply.bedrock160.type.Slot bvcv:output)
        {
            bvcv.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readLittleEndianByte();
        type = _buffer.readVarint();
        uuid.decodeBody(_buffer);
        final int blcv = _buffer.readVaruint();
        for(int a5dq=0;a5dq<input.length;a5dq++)
        {
            input[a5dq].decodeBody(_buffer);
        }
        final int b9dbd = _buffer.readVaruint();
        for(int bvcv=0;bvcv<output.length;bvcv++)
        {
            output[bvcv].decodeBody(_buffer);
        }
    }

    public static CraftingEvent fromBuffer(byte[] buffer)
    {
        CraftingEvent packet = new CraftingEvent();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
