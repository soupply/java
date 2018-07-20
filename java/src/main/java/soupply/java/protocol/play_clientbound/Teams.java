package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class Teams extends soupply.java.Packet
{

    public static final int ID = 71;

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
    public void decodeBody(Buffer _buffer) throws DecodeException
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

    public class CreateTeam extends Type
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
        public byte friendlyFlags;
        public String nametagVisibility;
        public String collisionRule;
        public int formatting;
        public String prefix;
        public String suffix;
        public String[] players;

        public CreateTeam()
        {
        }

        public CreateTeam(String displayName, byte friendlyFlags, String nametagVisibility, String collisionRule, int formatting, String prefix, String suffix, String[] players)
        {
            this.displayName = displayName;
            this.friendlyFlags = friendlyFlags;
            this.nametagVisibility = nametagVisibility;
            this.collisionRule = collisionRule;
            this.formatting = formatting;
            this.prefix = prefix;
            this.suffix = suffix;
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
            _buffer.writeByte(friendlyFlags);
            byte[] bfzrzzcl = _buffer.convertString(nametagVisibility);
            _buffer.writeVaruint((int)bfzrzzcl.length);
            _buffer.writeBytes(bfzrzzcl);
            byte[] y9bla9uv = _buffer.convertString(collisionRule);
            _buffer.writeVaruint((int)y9bla9uv.length);
            _buffer.writeBytes(y9bla9uv);
            _buffer.writeVaruint(formatting);
            byte[] cjzl = _buffer.convertString(prefix);
            _buffer.writeVaruint((int)cjzl.length);
            _buffer.writeBytes(cjzl);
            byte[] cvzl = _buffer.convertString(suffix);
            _buffer.writeVaruint((int)cvzl.length);
            _buffer.writeBytes(cvzl);
            _buffer.writeVaruint((int)players.length);
            for(String cxevc:players)
            {
                byte[] yhdm = _buffer.convertString(cxevc);
                _buffer.writeVaruint((int)yhdm.length);
                _buffer.writeBytes(yhdm);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
            friendlyFlags = _buffer.readByte();
            final int bvbfzrzz = _buffer.readVaruint();
            nametagVisibility = _buffer.readString(bvbfzrzz);
            final int bvy9bla9 = _buffer.readVaruint();
            collisionRule = _buffer.readString(bvy9bla9);
            formatting = _buffer.readVaruint();
            final int bvcjzl = _buffer.readVaruint();
            prefix = _buffer.readString(bvcjzl);
            final int bvcvzl = _buffer.readVaruint();
            suffix = _buffer.readString(bvcvzl);
            final int bbylcm = _buffer.readVaruint();
            players = new String[bbylcm];
            for(int cxevc=0;cxevc<players.length;cxevc++)
            {
                final int bvcxevct = _buffer.readVaruint();
                players[cxevc] = _buffer.readString(bvcxevct);
            }
        }

    }

    public class RemoveTeam extends Type
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 1;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
        }

    }

    public class UpdateTeamInfo extends Type
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
        public byte friendlyFlags;
        public String nametagVisibility;
        public String collisionRule;
        public int formatting;
        public String prefix;
        public String suffix;

        public UpdateTeamInfo()
        {
        }

        public UpdateTeamInfo(String displayName, byte friendlyFlags, String nametagVisibility, String collisionRule, int formatting, String prefix, String suffix)
        {
            this.displayName = displayName;
            this.friendlyFlags = friendlyFlags;
            this.nametagVisibility = nametagVisibility;
            this.collisionRule = collisionRule;
            this.formatting = formatting;
            this.prefix = prefix;
            this.suffix = suffix;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            mode = 2;
            encodeMainBody(_buffer);
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
            _buffer.writeByte(friendlyFlags);
            byte[] bfzrzzcl = _buffer.convertString(nametagVisibility);
            _buffer.writeVaruint((int)bfzrzzcl.length);
            _buffer.writeBytes(bfzrzzcl);
            byte[] y9bla9uv = _buffer.convertString(collisionRule);
            _buffer.writeVaruint((int)y9bla9uv.length);
            _buffer.writeBytes(y9bla9uv);
            _buffer.writeVaruint(formatting);
            byte[] cjzl = _buffer.convertString(prefix);
            _buffer.writeVaruint((int)cjzl.length);
            _buffer.writeBytes(cjzl);
            byte[] cvzl = _buffer.convertString(suffix);
            _buffer.writeVaruint((int)cvzl.length);
            _buffer.writeBytes(cvzl);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
            friendlyFlags = _buffer.readByte();
            final int bvbfzrzz = _buffer.readVaruint();
            nametagVisibility = _buffer.readString(bvbfzrzz);
            final int bvy9bla9 = _buffer.readVaruint();
            collisionRule = _buffer.readString(bvy9bla9);
            formatting = _buffer.readVaruint();
            final int bvcjzl = _buffer.readVaruint();
            prefix = _buffer.readString(bvcjzl);
            final int bvcvzl = _buffer.readVaruint();
            suffix = _buffer.readString(bvcvzl);
        }

    }

    public class AddPlayers extends Type
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
        public void decodeBody(Buffer _buffer) throws DecodeException
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

    public class RemovePlayers extends Type
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
        public void decodeBody(Buffer _buffer) throws DecodeException
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
