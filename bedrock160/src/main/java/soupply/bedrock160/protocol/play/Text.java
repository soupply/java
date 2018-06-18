package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class Text extends soupply.bedrock160.Packet
{

    public static final int ID = 9;

    public byte type;
    public boolean unknown1;

    public Text()
    {
    }

    public Text(byte type, boolean unknown1)
    {
        this.type = type;
        this.unknown1 = unknown1;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(type);
        _buffer.writeBool(unknown1);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readByte();
        unknown1 = _buffer.readBool();
    }

    public static Text fromBuffer(byte[] buffer)
    {
        Text packet = new Text();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class Raw extends soupply.util.Packet
    {

        public String message;
        public String xuid;

        public Raw()
        {
        }

        public Raw(String message, String xuid)
        {
            this.message = message;
            this.xuid = xuid;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 0;
            encodeMainBody(_buffer);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
            byte[] evz = _buffer.convertString(xuid);
            _buffer.writeVaruint((int)evz.length);
            _buffer.writeBytes(evz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
            final int bvevz = _buffer.readVaruint();
            xuid = _buffer.readString(bvevz);
        }

    }

    public class Chat extends soupply.util.Packet
    {

        public String sender;
        public String message;
        public String xuid;

        public Chat()
        {
        }

        public Chat(String sender, String message, String xuid)
        {
            this.sender = sender;
            this.message = message;
            this.xuid = xuid;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 1;
            encodeMainBody(_buffer);
            byte[] cvzv = _buffer.convertString(sender);
            _buffer.writeVaruint((int)cvzv.length);
            _buffer.writeBytes(cvzv);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
            byte[] evz = _buffer.convertString(xuid);
            _buffer.writeVaruint((int)evz.length);
            _buffer.writeBytes(evz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvcvzv = _buffer.readVaruint();
            sender = _buffer.readString(bvcvzv);
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
            final int bvevz = _buffer.readVaruint();
            xuid = _buffer.readString(bvevz);
        }

    }

    public class Translation extends soupply.util.Packet
    {

        public String message;
        public String[] parameters;

        public Translation()
        {
        }

        public Translation(String message, String[] parameters)
        {
            this.message = message;
            this.parameters = parameters;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 2;
            encodeMainBody(_buffer);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
            _buffer.writeVaruint((int)parameters.length);
            for(String cfy1dvc:parameters)
            {
                byte[] yzmry = _buffer.convertString(cfy1dvc);
                _buffer.writeVaruint((int)yzmry.length);
                _buffer.writeBytes(yzmry);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
            final int bbcfzrcm = _buffer.readVaruint();
            parameters = new String[bbcfzrcm];
            for(int cfy1dvc=0;cfy1dvc<parameters.length;cfy1dvc++)
            {
                final int bvcfy1dv = _buffer.readVaruint();
                parameters[cfy1dvc] = _buffer.readString(bvcfy1dv);
            }
        }

    }

    public class Popup extends soupply.util.Packet
    {

        public String title;
        public String subtitle;

        public Popup()
        {
        }

        public Popup(String title, String subtitle)
        {
            this.title = title;
            this.subtitle = subtitle;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 3;
            encodeMainBody(_buffer);
            byte[] dlbu = _buffer.convertString(title);
            _buffer.writeVaruint((int)dlbu.length);
            _buffer.writeBytes(dlbu);
            byte[] cvdlbu = _buffer.convertString(subtitle);
            _buffer.writeVaruint((int)cvdlbu.length);
            _buffer.writeBytes(cvdlbu);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvdlbu = _buffer.readVaruint();
            title = _buffer.readString(bvdlbu);
            final int bvcvdlbu = _buffer.readVaruint();
            subtitle = _buffer.readString(bvcvdlbu);
        }

    }

    public class JukeboxPopup extends soupply.util.Packet
    {

        public String message;
        public String[] parameters;

        public JukeboxPopup()
        {
        }

        public JukeboxPopup(String message, String[] parameters)
        {
            this.message = message;
            this.parameters = parameters;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 4;
            encodeMainBody(_buffer);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
            _buffer.writeVaruint((int)parameters.length);
            for(String cfy1dvc:parameters)
            {
                byte[] yzmry = _buffer.convertString(cfy1dvc);
                _buffer.writeVaruint((int)yzmry.length);
                _buffer.writeBytes(yzmry);
            }
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
            final int bbcfzrcm = _buffer.readVaruint();
            parameters = new String[bbcfzrcm];
            for(int cfy1dvc=0;cfy1dvc<parameters.length;cfy1dvc++)
            {
                final int bvcfy1dv = _buffer.readVaruint();
                parameters[cfy1dvc] = _buffer.readString(bvcfy1dv);
            }
        }

    }

    public class Tip extends soupply.util.Packet
    {

        public String message;

        public Tip()
        {
        }

        public Tip(String message)
        {
            this.message = message;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 5;
            encodeMainBody(_buffer);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
        }

    }

    public class System extends soupply.util.Packet
    {

        public String message;

        public System()
        {
        }

        public System(String message)
        {
            this.message = message;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 6;
            encodeMainBody(_buffer);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
        }

    }

    public class Whisper extends soupply.util.Packet
    {

        public String sender;
        public String message;

        public Whisper()
        {
        }

        public Whisper(String sender, String message)
        {
            this.sender = sender;
            this.message = message;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 7;
            encodeMainBody(_buffer);
            byte[] cvzv = _buffer.convertString(sender);
            _buffer.writeVaruint((int)cvzv.length);
            _buffer.writeBytes(cvzv);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvcvzv = _buffer.readVaruint();
            sender = _buffer.readString(bvcvzv);
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
        }

    }

    public class Announcement extends soupply.util.Packet
    {

        public String announcer;
        public String message;

        public Announcement()
        {
        }

        public Announcement(String announcer, String message)
        {
            this.announcer = announcer;
            this.message = message;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 8;
            encodeMainBody(_buffer);
            byte[] y5bvyv = _buffer.convertString(announcer);
            _buffer.writeVaruint((int)y5bvyv.length);
            _buffer.writeBytes(y5bvyv);
            byte[] bvcfz = _buffer.convertString(message);
            _buffer.writeVaruint((int)bvcfz.length);
            _buffer.writeBytes(bvcfz);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            final int bvy5bvyv = _buffer.readVaruint();
            announcer = _buffer.readString(bvy5bvyv);
            final int bvbvcfz = _buffer.readVaruint();
            message = _buffer.readString(bvbvcfz);
        }

    }

}
