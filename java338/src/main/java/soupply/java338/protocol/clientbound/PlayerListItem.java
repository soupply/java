package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerListItem extends soupply.java338.Packet
{

    public static final int ID = 46;

    public int action;

    public PlayerListItem()
    {
    }

    public PlayerListItem(int action)
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

    public static PlayerListItem fromBuffer(byte[] buffer)
    {
        PlayerListItem packet = new PlayerListItem();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class AddPlayer extends Type
    {

        public soupply.java338.type.ListAddPlayer[] players;

        public AddPlayer()
        {
        }

        public AddPlayer(soupply.java338.type.ListAddPlayer[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 0;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.java338.type.ListAddPlayer cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.java338.type.ListAddPlayer[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

    public class UpdateGamemode extends Type
    {

        public soupply.java338.type.ListUpdateGamemode[] players;

        public UpdateGamemode()
        {
        }

        public UpdateGamemode(soupply.java338.type.ListUpdateGamemode[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 1;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.java338.type.ListUpdateGamemode cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.java338.type.ListUpdateGamemode[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

    public class UpdateLatency extends Type
    {

        public soupply.java338.type.ListUpdateLatency[] players;

        public UpdateLatency()
        {
        }

        public UpdateLatency(soupply.java338.type.ListUpdateLatency[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 2;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.java338.type.ListUpdateLatency cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.java338.type.ListUpdateLatency[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

    public class UpdateDisplayName extends Type
    {

        public soupply.java338.type.ListUpdateDisplayName[] players;

        public UpdateDisplayName()
        {
        }

        public UpdateDisplayName(soupply.java338.type.ListUpdateDisplayName[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 3;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(soupply.java338.type.ListUpdateDisplayName cxevc:players)
            {
                cxevc.encodeBody(_buffer);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new soupply.java338.type.ListUpdateDisplayName[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc].decodeBody(_buffer);
            }
        }

    }

    public class RemovePlayer extends Type
    {

        public UUID[] players;

        public RemovePlayer()
        {
        }

        public RemovePlayer(UUID[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 4;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(UUID cxevc:players)
            {
                _buffer.writeUUID(cxevc);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            final int bbylcm = _buffer.readVaruint();
            players = new UUID[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                players[cxevc] = _buffer.readUUID();
            }
        }

    }

}
