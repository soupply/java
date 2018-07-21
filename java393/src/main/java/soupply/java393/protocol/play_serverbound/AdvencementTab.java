package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class AdvencementTab extends soupply.java393.Packet
{

    public static final int ID = 25;

    // action
    public static final int OPEN_TAB = (int)0;
    public static final int CLOSE_SCREEN = (int)1;

    public int action;
    public String tab;

    public AdvencementTab()
    {
    }

    public AdvencementTab(int action, String tab)
    {
        this.action = action;
        this.tab = tab;
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
        if(action==0)
        {
            byte[] dfdf = _buffer.convertString(tab);
            _buffer.writeVaruint((int)dfdf.length);
            _buffer.writeBytes(dfdf);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        action = _buffer.readVaruint();
        if(action==0)
        {
            final int bvdf = _buffer.readVaruint();
            tab = _buffer.readString(bvdf);
        }
    }

    public static AdvencementTab fromBuffer(byte[] buffer)
    {
        AdvencementTab packet = new AdvencementTab();
        packet.safeDecode(buffer);
        return packet;
    }

}
