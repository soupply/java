package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ClientSettings extends soupply.java335.Packet
{

    public static final int ID = 5;

    // chat mode
    public static final int ENABLED = (int)0;
    public static final int COMMANDS_ONLY = (int)1;
    public static final int DISABLED = (int)2;

    // displayed skin parts
    public static final byte CAPE = (byte)1;
    public static final byte JACKET = (byte)2;
    public static final byte LEFT_SLEEVE = (byte)4;
    public static final byte RIGHT_SLEEVE = (byte)8;
    public static final byte LEFT_PANTS = (byte)16;
    public static final byte RIGHT_PANTS = (byte)32;
    public static final byte HAT = (byte)64;

    // main hand
    public static final byte RIGHT = (byte)0;
    public static final byte LEFT = (byte)1;

    public String language;
    public byte viewDistance;
    public int chatMode;
    public boolean chatColors;
    public byte displayedSkinParts;
    public byte mainHand;

    public ClientSettings()
    {
    }

    public ClientSettings(String language, byte viewDistance, int chatMode, boolean chatColors, byte displayedSkinParts, byte mainHand)
    {
        this.language = language;
        this.viewDistance = viewDistance;
        this.chatMode = chatMode;
        this.chatColors = chatColors;
        this.displayedSkinParts = displayedSkinParts;
        this.mainHand = mainHand;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfzvzu = _buffer.convertString(language);
        _buffer.writeVaruint((int)bfzvzu.length);
        _buffer.writeBytes(bfzvzu);
        _buffer.writeByte(viewDistance);
        _buffer.writeVaruint(chatMode);
        _buffer.writeBool(chatColors);
        _buffer.writeByte(displayedSkinParts);
        _buffer.writeByte(mainHand);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfzvzu = _buffer.readVaruint();
        language = _buffer.readString(bvbfzvzu);
        viewDistance = _buffer.readByte();
        chatMode = _buffer.readVaruint();
        chatColors = _buffer.readBool();
        displayedSkinParts = _buffer.readByte();
        mainHand = _buffer.readByte();
    }

    public static ClientSettings fromBuffer(byte[] buffer)
    {
        ClientSettings packet = new ClientSettings();
        packet.safeDecode(buffer);
        return packet;
    }

}
