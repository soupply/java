package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Modifier extends Type
{

    // operation
    public static final byte ADD_SUBSTRACT_AMOUNT = (byte)0;
    public static final byte ADD_SUBSTRACT_AMOUNT_PERCENTAGE = (byte)1;
    public static final byte MULTIPLY_AMOUNT_PERCENTAGE = (byte)2;

    public UUID uuid;
    public double amount;
    public byte operation;

    public Modifier()
    {
        this.uuid = new UUID(0, 0);
    }

    public Modifier(UUID uuid, double amount, byte operation)
    {
        this.uuid = uuid;
        this.amount = amount;
        this.operation = operation;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(uuid);
        _buffer.writeBigEndianDouble(amount);
        _buffer.writeByte(operation);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        uuid = _buffer.readUUID();
        amount = _buffer.readBigEndianDouble();
        operation = _buffer.readByte();
    }

}
