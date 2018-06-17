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
        this.uuid = new UUID();
    }

    public Modifier(UUID uuid, double amount, byte operation)
    {
        this.uuid = uuid;
        this.amount = amount;
        this.operation = operation;
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
