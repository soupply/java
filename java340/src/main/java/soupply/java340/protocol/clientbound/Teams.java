package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Teams extends soupply.java340.Packet
{

    public static final int ID = 68;

    public String name;
    public byte mode;

    public Teams()
    {
    }

    public Teams(String name, byte mode)
    {
        this.name = name;
        this.mode = mode;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeByte(mode);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        mode = _buffer.readByte();
    }

    public static Teams fromBuffer(byte[] buffer)
    {
        Teams packet = new Teams();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class CreateTeam extends soupply.util.Packet
    {

        // friendly flags
        public static final byte FRIENDLY_FIRE = (byte)1;
        public static final byte SEE_TEAM_INVISIBLE_PLAYERS = (byte)2;

        // nametag visibility
        public static final String ALWAYS_HIDE = "always";
        public static final String HIDE_OTHER_TEAMS = "hideOtherTeams";
        public static final String HIDE_OWN_TEAM = "hideOwnTeam";
        public static final String NEVER_HIDE = "never";

        // collision rule
        public static final String ALWAYS_PUSH = "always";
        public static final String PUSH_OTHER_TEAMS = "pushOtherTeams";
        public static final String PUSH_OWN_TEAM = "pushOwnTeam";
        public static final String NEVER_PUSH = "never";

        public String displayName;
        public String prefix;
        public String suffix;
        public byte friendlyFlags;
        public String nametagVisibility;
        public String collisionRule;
        public byte color;
        public String[] players;

        public CreateTeam()
        {
        }

        public CreateTeam(String displayName, String prefix, String suffix, byte friendlyFlags, String nametagVisibility, String collisionRule, byte color, String[] players)
        {
            this.displayName = displayName;
            this.prefix = prefix;
            this.suffix = suffix;
            this.friendlyFlags = friendlyFlags;
            this.nametagVisibility = nametagVisibility;
            this.collisionRule = collisionRule;
            this.color = color;
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 0;
            encodeMainBody(_buffer);
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
            byte[] cjzl = _buffer.convertString(prefix);
            _buffer.writeVaruint((int)cjzl.length);
            _buffer.writeBytes(cjzl);
            byte[] cvzl = _buffer.convertString(suffix);
            _buffer.writeVaruint((int)cvzl.length);
            _buffer.writeBytes(cvzl);
            _buffer.writeByte(friendlyFlags);
            byte[] bfzrzzcl = _buffer.convertString(nametagVisibility);
            _buffer.writeVaruint((int)bfzrzzcl.length);
            _buffer.writeBytes(bfzrzzcl);
            byte[] y9bla9uv = _buffer.convertString(collisionRule);
            _buffer.writeVaruint((int)y9bla9uv.length);
            _buffer.writeBytes(y9bla9uv);
            _buffer.writeByte(color);
            _buffer.writeVaruint((int)players.length);
            for(String cxevc:players)
            {
                byte[] yhdm = _buffer.convertString(cxevc);
                _buffer.writeVaruint((int)yhdm.length);
                _buffer.writeBytes(yhdm);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
            final int bvcjzl = _buffer.readVaruint();
            prefix = _buffer.readString(bvcjzl);
            final int bvcvzl = _buffer.readVaruint();
            suffix = _buffer.readString(bvcvzl);
            friendlyFlags = _buffer.readByte();
            final int bvbfzrzz = _buffer.readVaruint();
            nametagVisibility = _buffer.readString(bvbfzrzz);
            final int bvy9bla9 = _buffer.readVaruint();
            collisionRule = _buffer.readString(bvy9bla9);
            color = _buffer.readByte();
            final int bbylcm = _buffer.readVaruint();
            players = new String[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                final int bvcxevct = _buffer.readVaruint();
                players[cxevc] = _buffer.readString(bvcxevct);
            }
        }

    }

    public class RemoveTeam extends soupply.util.Packet
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 1;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
        }

    }

    public class UpdateTeamInfo extends soupply.util.Packet
    {

        // friendly flags
        public static final byte FRIENDLY_FIRE = (byte)1;
        public static final byte SEE_TEAM_INVISIBLE_PLAYERS = (byte)2;

        // nametag visibility
        public static final String ALWAYS_HIDE = "always";
        public static final String HIDE_OTHER_TEAMS = "hideOtherTeams";
        public static final String HIDE_OWN_TEAM = "hideOwnTeam";
        public static final String NEVER_HIDE = "never";

        // collision rule
        public static final String ALWAYS_PUSH = "always";
        public static final String PUSH_OTHER_TEAMS = "pushOtherTeams";
        public static final String PUSH_OWN_TEAM = "pushOwnTeam";
        public static final String NEVER_PUSH = "never";

        public String displayName;
        public String prefix;
        public String suffix;
        public byte friendlyFlags;
        public String nametagVisibility;
        public String collisionRule;
        public byte color;

        public UpdateTeamInfo()
        {
        }

        public UpdateTeamInfo(String displayName, String prefix, String suffix, byte friendlyFlags, String nametagVisibility, String collisionRule, byte color)
        {
            this.displayName = displayName;
            this.prefix = prefix;
            this.suffix = suffix;
            this.friendlyFlags = friendlyFlags;
            this.nametagVisibility = nametagVisibility;
            this.collisionRule = collisionRule;
            this.color = color;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 2;
            encodeMainBody(_buffer);
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
            byte[] cjzl = _buffer.convertString(prefix);
            _buffer.writeVaruint((int)cjzl.length);
            _buffer.writeBytes(cjzl);
            byte[] cvzl = _buffer.convertString(suffix);
            _buffer.writeVaruint((int)cvzl.length);
            _buffer.writeBytes(cvzl);
            _buffer.writeByte(friendlyFlags);
            byte[] bfzrzzcl = _buffer.convertString(nametagVisibility);
            _buffer.writeVaruint((int)bfzrzzcl.length);
            _buffer.writeBytes(bfzrzzcl);
            byte[] y9bla9uv = _buffer.convertString(collisionRule);
            _buffer.writeVaruint((int)y9bla9uv.length);
            _buffer.writeBytes(y9bla9uv);
            _buffer.writeByte(color);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
            final int bvcjzl = _buffer.readVaruint();
            prefix = _buffer.readString(bvcjzl);
            final int bvcvzl = _buffer.readVaruint();
            suffix = _buffer.readString(bvcvzl);
            friendlyFlags = _buffer.readByte();
            final int bvbfzrzz = _buffer.readVaruint();
            nametagVisibility = _buffer.readString(bvbfzrzz);
            final int bvy9bla9 = _buffer.readVaruint();
            collisionRule = _buffer.readString(bvy9bla9);
            color = _buffer.readByte();
        }

    }

    public class AddPlayers extends soupply.util.Packet
    {

        public String[] players;

        public AddPlayers()
        {
        }

        public AddPlayers(String[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 3;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(String cxevc:players)
            {
                byte[] yhdm = _buffer.convertString(cxevc);
                _buffer.writeVaruint((int)yhdm.length);
                _buffer.writeBytes(yhdm);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bbylcm = _buffer.readVaruint();
            players = new String[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                final int bvcxevct = _buffer.readVaruint();
                players[cxevc] = _buffer.readString(bvcxevct);
            }
        }

    }

    public class RemovePlayers extends soupply.util.Packet
    {

        public String[] players;

        public RemovePlayers()
        {
        }

        public RemovePlayers(String[] players)
        {
            this.players = players;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 4;
            encodeMainBody(_buffer);
            _buffer.writeVaruint((int)players.length);
            for(String cxevc:players)
            {
                byte[] yhdm = _buffer.convertString(cxevc);
                _buffer.writeVaruint((int)yhdm.length);
                _buffer.writeBytes(yhdm);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bbylcm = _buffer.readVaruint();
            players = new String[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                final int bvcxevct = _buffer.readVaruint();
                players[cxevc] = _buffer.readString(bvcxevct);
            }
        }

    }

}
