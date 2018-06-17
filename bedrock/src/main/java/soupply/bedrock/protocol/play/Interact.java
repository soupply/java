package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class Interact extends soupply.bedrock.Packet
{

    public static final int ID = 33;

    // action
    public static final byte LEAVE_VEHICLE = (byte)3;
    public static final byte HOVER = (byte)4;
    public static final byte OPEN_INVENTORY = (byte)6;

    public byte action;
    public long target;
    public FloatXYZ targetPosition;

    public Interact()
    {
        this.targetPosition = new FloatXYZ();
    }

    public Interact(byte action, long target, FloatXYZ targetPosition)
    {
        this.action = action;
        this.target = target;
        this.targetPosition = targetPosition;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianByte(action);
        _buffer.writeVarlong(target);
        _buffer.writeLittleEndianFloat(targetPosition.x);
        _buffer.writeLittleEndianFloat(targetPosition.y);
        _buffer.writeLittleEndianFloat(targetPosition.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readLittleEndianByte();
        target = _buffer.readVarlong();
        targetPosition.x = _buffer.readLittleEndianFloat();
        targetPosition.y = _buffer.readLittleEndianFloat();
        targetPosition.z = _buffer.readLittleEndianFloat();
    }

    public static Interact fromBuffer(byte[] buffer)
    {
        Interact packet = new Interact();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
