package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Match extends Type
{

    public String match;
    public boolean hasTooltip;
    public String tooltip;

    public Match()
    {
    }

    public Match(String match, boolean hasTooltip, String tooltip)
    {
        this.match = match;
        this.hasTooltip = hasTooltip;
        this.tooltip = tooltip;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfyg = _buffer.convertString(match);
        _buffer.writeVaruint((int)bfyg.length);
        _buffer.writeBytes(bfyg);
        _buffer.writeBool(hasTooltip);
        if(hasTooltip==true)
        {
            byte[] d9brc = _buffer.convertString(tooltip);
            _buffer.writeVaruint((int)d9brc.length);
            _buffer.writeBytes(d9brc);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfyg = _buffer.readVaruint();
        match = _buffer.readString(bvbfyg);
        hasTooltip = _buffer.readBool();
        if(hasTooltip==true)
        {
            final int bvd9brc = _buffer.readVaruint();
            tooltip = _buffer.readString(bvd9brc);
        }
    }

}
