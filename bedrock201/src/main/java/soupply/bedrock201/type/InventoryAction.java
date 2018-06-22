package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

public class InventoryAction extends Type
{

    // source
    public static final int CONTAINER = (int)0;
    public static final int WORLD = (int)2;
    public static final int CREATIVE = (int)3;

    public int source;
    public int container = -1;
    public int unknown2;
    public int slot;
    public soupply.bedrock201.type.Slot oldItem;
    public soupply.bedrock201.type.Slot newItem;

    public InventoryAction()
    {
        this.oldItem = new soupply.bedrock201.type.Slot();
        this.newItem = new soupply.bedrock201.type.Slot();
    }

    public InventoryAction(int source, int container, int unknown2, int slot, soupply.bedrock201.type.Slot oldItem, soupply.bedrock201.type.Slot newItem)
    {
        this.source = source;
        this.container = container;
        this.unknown2 = unknown2;
        this.slot = slot;
        this.oldItem = oldItem;
        this.newItem = newItem;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(source);
        if(source==0)
        {
            _buffer.writeVarint(container);
        }
        if(source==2)
        {
            _buffer.writeVaruint(unknown2);
        }
        _buffer.writeVaruint(slot);
        oldItem.encodeBody(_buffer);
        newItem.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        source = _buffer.readVaruint();
        if(source==0)
        {
            container = _buffer.readVarint();
        }
        if(source==2)
        {
            unknown2 = _buffer.readVaruint();
        }
        slot = _buffer.readVaruint();
        oldItem.decodeBody(_buffer);
        newItem.decodeBody(_buffer);
    }

}
