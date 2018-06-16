package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class CommandBlockUpdate extends soupply.bedrock.Packet
{

    public static final int ID = 78;

    public boolean updateBlock;
    public soupply.bedrock.type.BlockPosition position;
    public int mode;
    public boolean redstoneMode;
    public boolean conditional;
    public long minecart;
    public String command;
    public String lastOutput;
    public String hover;
    public boolean trackOutput;

    public CommandBlockUpdate()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
    }

    public CommandBlockUpdate(boolean updateBlock, soupply.bedrock.type.BlockPosition position, int mode, boolean redstoneMode, boolean conditional, long minecart, String command, String lastOutput, String hover, boolean trackOutput)
    {
        this.updateBlock = updateBlock;
        this.position = position;
        this.mode = mode;
        this.redstoneMode = redstoneMode;
        this.conditional = conditional;
        this.minecart = minecart;
        this.command = command;
        this.lastOutput = lastOutput;
        this.hover = hover;
        this.trackOutput = trackOutput;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
