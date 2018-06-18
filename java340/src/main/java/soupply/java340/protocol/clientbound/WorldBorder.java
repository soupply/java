package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WorldBorder extends soupply.java340.Packet
{

    public static final int ID = 56;

    public int action;

    public WorldBorder()
    {
    }

    public WorldBorder(int action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVaruint();
    }

    public static WorldBorder fromBuffer(byte[] buffer)
    {
        WorldBorder packet = new WorldBorder();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class SetSize extends Type
    {

        public double diameter;

        public SetSize()
        {
        }

        public SetSize(double diameter)
        {
            this.diameter = diameter;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 0;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianDouble(diameter);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            diameter = _buffer.readBigEndianDouble();
        }

    }

    public class LerpSize extends Type
    {

        public double oldDiameter;
        public double newDiameter;
        public long speed;

        public LerpSize()
        {
        }

        public LerpSize(double oldDiameter, double newDiameter, long speed)
        {
            this.oldDiameter = oldDiameter;
            this.newDiameter = newDiameter;
            this.speed = speed;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 1;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianDouble(oldDiameter);
            _buffer.writeBigEndianDouble(newDiameter);
            _buffer.writeVarulong(speed);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            oldDiameter = _buffer.readBigEndianDouble();
            newDiameter = _buffer.readBigEndianDouble();
            speed = _buffer.readVarulong();
        }

    }

    public class SetCenter extends Type
    {

        public DoubleXYZ center;

        public SetCenter()
        {
            this.center = new DoubleXYZ();
        }

        public SetCenter(DoubleXYZ center)
        {
            this.center = center;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 2;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianDouble(center.x);
            _buffer.writeBigEndianDouble(center.y);
            _buffer.writeBigEndianDouble(center.z);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            center.x = _buffer.readBigEndianDouble();
            center.y = _buffer.readBigEndianDouble();
            center.z = _buffer.readBigEndianDouble();
        }

    }

    public class Initialize extends Type
    {

        public DoubleXYZ center;
        public double oldDiameter;
        public double newDiameter;
        public long speed;
        public int portalTeleportBoundary;
        public int warningTime;
        public int warningBlocks;

        public Initialize()
        {
            this.center = new DoubleXYZ();
        }

        public Initialize(DoubleXYZ center, double oldDiameter, double newDiameter, long speed, int portalTeleportBoundary, int warningTime, int warningBlocks)
        {
            this.center = center;
            this.oldDiameter = oldDiameter;
            this.newDiameter = newDiameter;
            this.speed = speed;
            this.portalTeleportBoundary = portalTeleportBoundary;
            this.warningTime = warningTime;
            this.warningBlocks = warningBlocks;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 3;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianDouble(center.x);
            _buffer.writeBigEndianDouble(center.y);
            _buffer.writeBigEndianDouble(center.z);
            _buffer.writeBigEndianDouble(oldDiameter);
            _buffer.writeBigEndianDouble(newDiameter);
            _buffer.writeVarulong(speed);
            _buffer.writeVaruint(portalTeleportBoundary);
            _buffer.writeVaruint(warningTime);
            _buffer.writeVaruint(warningBlocks);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            center.x = _buffer.readBigEndianDouble();
            center.y = _buffer.readBigEndianDouble();
            center.z = _buffer.readBigEndianDouble();
            oldDiameter = _buffer.readBigEndianDouble();
            newDiameter = _buffer.readBigEndianDouble();
            speed = _buffer.readVarulong();
            portalTeleportBoundary = _buffer.readVaruint();
            warningTime = _buffer.readVaruint();
            warningBlocks = _buffer.readVaruint();
        }

    }

    public class SetWarningTime extends Type
    {

        public int warningTime;

        public SetWarningTime()
        {
        }

        public SetWarningTime(int warningTime)
        {
            this.warningTime = warningTime;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 4;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(warningTime);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            warningTime = _buffer.readVaruint();
        }

    }

    public class SetWarningBlocks extends Type
    {

        public int warningBlocks;

        public SetWarningBlocks()
        {
        }

        public SetWarningBlocks(int warningBlocks)
        {
            this.warningBlocks = warningBlocks;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 5;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(warningBlocks);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            warningBlocks = _buffer.readVaruint();
        }

    }

}
