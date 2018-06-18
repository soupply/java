package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class BossBar extends soupply.java316.Packet
{

    public static final int ID = 12;

    public UUID uuid;
    public int action;

    public BossBar()
    {
        this.uuid = new UUID(0, 0);
    }

    public BossBar(UUID uuid, int action)
    {
        this.uuid = uuid;
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
        _buffer.writeUUID(uuid);
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        uuid = _buffer.readUUID();
        action = _buffer.readVaruint();
    }

    public static BossBar fromBuffer(byte[] buffer)
    {
        BossBar packet = new BossBar();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class Add extends soupply.java316.Packet
    {

        // color
        public static final int PINK = (int)0;
        public static final int BLUE = (int)1;
        public static final int RED = (int)2;
        public static final int GREEN = (int)3;
        public static final int YELLOW = (int)4;
        public static final int PURPLE = (int)5;
        public static final int WHITE = (int)6;

        // division
        public static final int NO_DIVISION = (int)0;
        public static final int SIX_NOTCHES = (int)1;
        public static final int TEN_NOTCHES = (int)2;
        public static final int TWELVE_NOTCHES = (int)3;
        public static final int TWENTY_NOTCHES = (int)4;

        // flags
        public static final byte DARK_SKY = (byte)1;
        public static final byte IS_DRAGON_BAR = (byte)2;

        public String title;
        public float health;
        public int color;
        public int division;
        public byte flags;

        public Add()
        {
        }

        public Add(String title, float health, int color, int division, byte flags)
        {
            this.title = title;
            this.health = health;
            this.color = color;
            this.division = division;
            this.flags = flags;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 0;
            encodeMainBody(_buffer);
            byte[] dlbu = _buffer.convertString(title);
            _buffer.writeVaruint((int)dlbu.length);
            _buffer.writeBytes(dlbu);
            _buffer.writeBigEndianFloat(health);
            _buffer.writeVaruint(color);
            _buffer.writeVaruint(division);
            _buffer.writeByte(flags);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvdlbu = _buffer.readVaruint();
            title = _buffer.readString(bvdlbu);
            health = _buffer.readBigEndianFloat();
            color = _buffer.readVaruint();
            division = _buffer.readVaruint();
            flags = _buffer.readByte();
        }

    }

    public class Remove extends soupply.java316.Packet
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 1;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
        }

    }

    public class UpdateHealth extends soupply.java316.Packet
    {

        public float health;

        public UpdateHealth()
        {
        }

        public UpdateHealth(float health)
        {
            this.health = health;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 2;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianFloat(health);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            health = _buffer.readBigEndianFloat();
        }

    }

    public class UpdateTitle extends soupply.java316.Packet
    {

        public String title;

        public UpdateTitle()
        {
        }

        public UpdateTitle(String title)
        {
            this.title = title;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 3;
            encodeMainBody(_buffer);
            byte[] dlbu = _buffer.convertString(title);
            _buffer.writeVaruint((int)dlbu.length);
            _buffer.writeBytes(dlbu);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvdlbu = _buffer.readVaruint();
            title = _buffer.readString(bvdlbu);
        }

    }

    public class UpdateStyle extends soupply.java316.Packet
    {

        // color
        public static final int PINK = (int)0;
        public static final int BLUE = (int)1;
        public static final int RED = (int)2;
        public static final int GREEN = (int)3;
        public static final int YELLOW = (int)4;
        public static final int PURPLE = (int)5;
        public static final int WHITE = (int)6;

        // division
        public static final int NO_DIVISION = (int)0;
        public static final int SIX_NOTCHES = (int)1;
        public static final int TEN_NOTCHES = (int)2;
        public static final int TWELVE_NOTCHES = (int)3;
        public static final int TWENTY_NOTCHES = (int)4;

        public int color;
        public int division;

        public UpdateStyle()
        {
        }

        public UpdateStyle(int color, int division)
        {
            this.color = color;
            this.division = division;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 4;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(color);
            _buffer.writeVaruint(division);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            color = _buffer.readVaruint();
            division = _buffer.readVaruint();
        }

    }

    public class UpdateFlags extends soupply.java316.Packet
    {

        // flags
        public static final byte DARK_SKY = (byte)1;
        public static final byte IS_DRAGON_BAR = (byte)2;

        public byte flags;

        public UpdateFlags()
        {
        }

        public UpdateFlags(byte flags)
        {
            this.flags = flags;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 5;
            encodeMainBody(_buffer);
            _buffer.writeByte(flags);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            flags = _buffer.readByte();
        }

    }

}
