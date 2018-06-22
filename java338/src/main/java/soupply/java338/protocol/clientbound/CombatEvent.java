package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CombatEvent extends soupply.java338.Packet
{

    public static final int ID = 45;

    public byte eventId;

    public CombatEvent()
    {
    }

    public CombatEvent(byte eventId)
    {
        this.eventId = eventId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(eventId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        eventId = _buffer.readByte();
    }

    public static CombatEvent fromBuffer(byte[] buffer)
    {
        CombatEvent packet = new CombatEvent();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class EnterCombat extends Type
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            eventId = 0;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
        }

    }

    public class EndCombat extends Type
    {

        public int duration;
        public int entityId;

        public EndCombat()
        {
        }

        public EndCombat(int duration, int entityId)
        {
            this.duration = duration;
            this.entityId = entityId;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            eventId = 1;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(duration);
            _buffer.writeBigEndianInt(entityId);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            duration = _buffer.readVaruint();
            entityId = _buffer.readBigEndianInt();
        }

    }

    public class EntityDead extends Type
    {

        public int playerId;
        public int entityId;
        public String message;

        public EntityDead()
        {
        }

        public EntityDead(int playerId, int entityId, String message)
        {
            this.playerId = playerId;
            this.entityId = entityId;
            this.message = message;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            eventId = 2;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(playerId);
            _buffer.writeBigEndianInt(entityId);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            playerId = _buffer.readVaruint();
            entityId = _buffer.readBigEndianInt();
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
        }

    }

}
