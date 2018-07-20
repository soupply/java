package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class DeclareCommands extends soupply.java.Packet
{

    public static final int ID = 17;

    public soupply.java.type.Node[] nodes;
    public int rootIndex;

    public DeclareCommands()
    {
    }

    public DeclareCommands(soupply.java.type.Node[] nodes, int rootIndex)
    {
        this.nodes = nodes;
        this.rootIndex = rootIndex;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)nodes.length);
        for(soupply.java.type.Node b9zm:nodes)
        {
            b9zm.encodeBody(_buffer);
        }
        _buffer.writeVaruint(rootIndex);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int b5zv = _buffer.readVaruint();
        nodes = new soupply.java.type.Node[b5zv];
        for(int b9zm=0;b9zm<nodes.length;b9zm++)
        {
            nodes[b9zm].decodeBody(_buffer);
        }
        rootIndex = _buffer.readVaruint();
    }

    public static DeclareCommands fromBuffer(byte[] buffer)
    {
        DeclareCommands packet = new DeclareCommands();
        packet.safeDecode(buffer);
        return packet;
    }

}
