package soupply.java338.metadata;

import java.util.HashMap;
import soupply.util.*;

public class Metadata extends HashMap<Byte, MetadataValue>
{

    public Metadata()
    {
        this.add(new MetadataByte((byte)0, (byte)0));
    }

    public void add(MetadataValue value)
    {
        this.put(value.id, value);
    }

    public void encodeBody(Buffer _buffer)
    {
        for(MetadataValue value : this.values())
        {
            value.encodeBody(_buffer);
        }
        _buffer.writeByte((byte)255);
    }

    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        while(true)
        {
            final byte id = _buffer.readByte();
            if(id == 255) break;
            final byte type = _buffer.readByte();
            MetadataValue value = getMetadataValue(id, type);
            value.decodeBody(_buffer);
            this.add(value);
        }
    }

    public static MetadataValue getMetadataValue(byte id, byte type) throws MetadataException
    {
        switch(type)
        {
            case 0: return new MetadataByte(id);
            case 1: return new MetadataInt(id);
            case 2: return new MetadataFloat(id);
            case 3: return new MetadataString(id);
            case 4: return new MetadataChat(id);
            case 5: return new MetadataSlot(id);
            case 6: return new MetadataBool(id);
            case 7: return new MetadataRotation(id);
            case 8: return new MetadataPosition(id);
            case 9: return new MetadataOptionalPosition(id);
            case 10: return new MetadataDirection(id);
            case 11: return new MetadataUuid(id);
            case 12: return new MetadataBlock(id);
            case 13: return new MetadataNbt(id);
            default: throw new MetadataException(id, type);
        }
    }

    public byte getEntityFlags()
    {
        MetadataValue value = this.get(0);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setEntityFlags(byte _value)
    {
        MetadataValue value = this.get(0);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(0, _value));
    }

    public int getAir()
    {
        MetadataValue value = this.get(1);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)300;
    }

    public void setAir(int _value)
    {
        MetadataValue value = this.get(1);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(1, _value));
    }

    public String getNametag()
    {
        MetadataValue value = this.get(2);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setNametag(String _value)
    {
        MetadataValue value = this.get(2);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString(2, _value));
    }

    public boolean getShowNametag()
    {
        MetadataValue value = this.get(3);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setShowNametag(boolean _value)
    {
        MetadataValue value = this.get(3);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(3, _value));
    }

    public boolean getSilent()
    {
        MetadataValue value = this.get(4);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setSilent(boolean _value)
    {
        MetadataValue value = this.get(4);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(4, _value));
    }

    public boolean getNoGravity()
    {
        MetadataValue value = this.get(5);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setNoGravity(boolean _value)
    {
        MetadataValue value = this.get(5);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(5, _value));
    }

    public soupply.java338.type.Slot getPotion()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) return ((MetadataSlot)value).value;
        else return null;
    }

    public void setPotion(soupply.java338.type.Slot _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) ((MetadataSlot)value).value = _value;
        else this.add(new MetadataSlot(6, _value));
    }

    public long getSpawnPosition()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataPosition) return ((MetadataPosition)value).value;
        else return 0;
    }

    public void setSpawnPosition(long _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataPosition) ((MetadataPosition)value).value = _value;
        else this.add(new MetadataPosition(6, _value));
    }

    public float getRadius()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)0.5;
    }

    public void setRadius(float _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(6, _value));
    }

    public int getColor()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)-1;
    }

    public void setColor(int _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(7, _value));
    }

    public boolean getIsSinglePoint()
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setIsSinglePoint(boolean _value)
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(8, _value));
    }

    public int getParticleId()
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setParticleId(int _value)
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(9, _value));
    }

    public int getParticleParameter1()
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setParticleParameter1(int _value)
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(10, _value));
    }

    public int getParticleParameter2()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setParticleParameter2(int _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(11, _value));
    }

    public int getHookedEntity()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHookedEntity(int _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(6, _value));
    }

    public byte getArrowFlags()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setArrowFlags(byte _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(6, _value));
    }

    public int getTimeSinceLastHit()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setTimeSinceLastHit(int _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(6, _value));
    }

    public int getForwardDirection()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)1;
    }

    public void setForwardDirection(int _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(7, _value));
    }

    public float getDamageTaken()
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)0;
    }

    public void setDamageTaken(float _value)
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(8, _value));
    }

    public int getBoatVariant()
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setBoatVariant(int _value)
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(9, _value));
    }

    public boolean getRightPaddleTurning()
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setRightPaddleTurning(boolean _value)
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(10, _value));
    }

    public boolean getLeftPaddleTurning()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setLeftPaddleTurning(boolean _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(11, _value));
    }

    public soupply.java338.type.OptionalPosition getBeamTarget()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataOptionalPosition) return ((MetadataOptionalPosition)value).value;
        else return null;
    }

    public void setBeamTarget(soupply.java338.type.OptionalPosition _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataOptionalPosition) ((MetadataOptionalPosition)value).value = _value;
        else this.add(new MetadataOptionalPosition(6, _value));
    }

    public boolean getShowBottom()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setShowBottom(boolean _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(7, _value));
    }

    public soupply.java338.type.Slot getFirework()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) return ((MetadataSlot)value).value;
        else return null;
    }

    public void setFirework(soupply.java338.type.Slot _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) ((MetadataSlot)value).value = _value;
        else this.add(new MetadataSlot(6, _value));
    }

    public int getFireworkThrower()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setFireworkThrower(int _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(7, _value));
    }

    public soupply.java338.type.Slot getItem()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) return ((MetadataSlot)value).value;
        else return null;
    }

    public void setItem(soupply.java338.type.Slot _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataSlot) ((MetadataSlot)value).value = _value;
        else this.add(new MetadataSlot(6, _value));
    }

    public int getRotation()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setRotation(int _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(7, _value));
    }

    public byte getLivingFlags()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setLivingFlags(byte _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(6, _value));
    }

    public float getHealth()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)1;
    }

    public void setHealth(float _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(7, _value));
    }

    public int getPotionColor()
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setPotionColor(int _value)
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(8, _value));
    }

    public boolean getPotionAmbient()
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setPotionAmbient(boolean _value)
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(9, _value));
    }

    public int getArrows()
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setArrows(int _value)
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(10, _value));
    }

    public float getAdditionalHearts()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)0;
    }

    public void setAdditionalHearts(float _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(11, _value));
    }

    public int getScore()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setScore(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(12, _value));
    }

    public byte getSkinParts()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return (byte)0;
    }

    public void setSkinParts(byte _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(13, _value));
    }

    public byte getMainHand()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return (byte)1;
    }

    public void setMainHand(byte _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(14, _value));
    }

    public byte[] getLeftShoulder()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataNbt) return ((MetadataNbt)value).value;
        else return null;
    }

    public void setLeftShoulder(byte[] _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataNbt) ((MetadataNbt)value).value = _value;
        else this.add(new MetadataNbt(15, _value));
    }

    public byte[] getRightShoulder()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataNbt) return ((MetadataNbt)value).value;
        else return null;
    }

    public void setRightShoulder(byte[] _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataNbt) ((MetadataNbt)value).value = _value;
        else this.add(new MetadataNbt(16, _value));
    }

    public byte getArmorStandFlags()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setArmorStandFlags(byte _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(11, _value));
    }

    public FloatXYZ getHeadRotation()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setHeadRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(12, _value));
    }

    public FloatXYZ getBodyRotation()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setBodyRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(13, _value));
    }

    public FloatXYZ getLeftArmRotation()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setLeftArmRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(14, _value));
    }

    public FloatXYZ getRightArmRotation()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setRightArmRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(15, _value));
    }

    public FloatXYZ getLeftLegRotation()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setLeftLegRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(16, _value));
    }

    public FloatXYZ getRightLegRotation()
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataRotation) return ((MetadataRotation)value).value;
        else return null;
    }

    public void setRightLegRotation(FloatXYZ _value)
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataRotation) ((MetadataRotation)value).value = _value;
        else this.add(new MetadataRotation(17, _value));
    }

    public byte getInstentientFlags()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setInstentientFlags(byte _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(11, _value));
    }

    public byte getHanging()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setHanging(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public boolean getBaby()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setBaby(boolean _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(12, _value));
    }

    public byte getHorseFlags()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setHorseFlags(byte _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(13, _value));
    }

    public soupply.java338.type.OptionalUuid getOwnerUuid()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataUuid) return ((MetadataUuid)value).value;
        else return null;
    }

    public void setOwnerUuid(soupply.java338.type.OptionalUuid _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataUuid) ((MetadataUuid)value).value = _value;
        else this.add(new MetadataUuid(14, _value));
    }

    public int getHorseVariant()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHorseVariant(int _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(15, _value));
    }

    public int getHorseArmor()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHorseArmor(int _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(16, _value));
    }

    public boolean getChested()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setChested(boolean _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(15, _value));
    }

    public int getLlamaStrength()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setLlamaStrength(int _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(16, _value));
    }

    public int getCarpetColor()
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)-1;
    }

    public void setCarpetColor(int _value)
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(17, _value));
    }

    public int getLlamaVariant()
    {
        MetadataValue value = this.get(18);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setLlamaVariant(int _value)
    {
        MetadataValue value = this.get(18);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(18, _value));
    }

    public boolean getPigSaddled()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setPigSaddled(boolean _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(13, _value));
    }

    public int getCarrotBoost()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setCarrotBoost(int _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(14, _value));
    }

    public int getRabbitVariant()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setRabbitVariant(int _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(13, _value));
    }

    public boolean getStandingUp()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setStandingUp(boolean _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(13, _value));
    }

    public byte getSheepFlagsAndColor()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setSheepFlagsAndColor(byte _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(13, _value));
    }

    public byte getTameableFlags()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setTameableFlags(byte _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(13, _value));
    }

    public int getOcelotVariant()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setOcelotVariant(int _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(15, _value));
    }

    public int getParrotColor()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setParrotColor(int _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(15, _value));
    }

    public float getWolfHealth()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setWolfHealth(float _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(15, _value));
    }

    public boolean getBegging()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setBegging(boolean _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(16, _value));
    }

    public int getCollarColor()
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)14;
    }

    public void setCollarColor(int _value)
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(17, _value));
    }

    public int getProfession()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setProfession(int _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(13, _value));
    }

    public byte getCreatedByPlayer()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setCreatedByPlayer(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public byte getSnowmanFlags()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setSnowmanFlags(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public int getShulkerDirection()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataDirection) return ((MetadataDirection)value).value;
        else return 0;
    }

    public void setShulkerDirection(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataDirection) ((MetadataDirection)value).value = _value;
        else this.add(new MetadataDirection(12, _value));
    }

    public soupply.java338.type.OptionalPosition getShulkerAttachment()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataOptionalPosition) return ((MetadataOptionalPosition)value).value;
        else return null;
    }

    public void setShulkerAttachment(soupply.java338.type.OptionalPosition _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataOptionalPosition) ((MetadataOptionalPosition)value).value = _value;
        else this.add(new MetadataOptionalPosition(13, _value));
    }

    public byte getShulkerShieldHeight()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setShulkerShieldHeight(byte _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(14, _value));
    }

    public byte getShulkerColor()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setShulkerColor(byte _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(15, _value));
    }

    public byte getBlazeOnFire()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setBlazeOnFire(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public int getCreeperState()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)-1;
    }

    public void setCreeperState(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(12, _value));
    }

    public boolean getCharged()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setCharged(boolean _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(13, _value));
    }

    public boolean getIgnited()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setIgnited(boolean _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(14, _value));
    }

    public boolean getRectractingSpikes()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setRectractingSpikes(boolean _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(12, _value));
    }

    public int getGuardianTarget()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setGuardianTarget(int _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(13, _value));
    }

    public byte getSpell()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setSpell(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public byte getAttackMode()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setAttackMode(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public boolean getSwingingArms()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setSwingingArms(boolean _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(12, _value));
    }

    public byte getClimbing()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setClimbing(byte _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte(12, _value));
    }

    public int getCenterHeadTarget()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setCenterHeadTarget(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(12, _value));
    }

    public int getLeftHeadTarget()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setLeftHeadTarget(int _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(13, _value));
    }

    public int getRightHeadTarget()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setRightHeadTarget(int _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(14, _value));
    }

    public int getInvulnerableTime()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setInvulnerableTime(int _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(15, _value));
    }

    public boolean getHandsHeldUp()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setHandsHeldUp(boolean _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(14, _value));
    }

    public boolean getConverting()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setConverting(boolean _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(15, _value));
    }

    public int getZombieVillagerProfession()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setZombieVillagerProfession(int _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(16, _value));
    }

    public int getCarriedBlock()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBlock) return ((MetadataBlock)value).value;
        else return 0;
    }

    public void setCarriedBlock(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBlock) ((MetadataBlock)value).value = _value;
        else this.add(new MetadataBlock(12, _value));
    }

    public boolean getScreaming()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setScreaming(boolean _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(13, _value));
    }

    public int getDragonPhase()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setDragonPhase(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(12, _value));
    }

    public boolean getGhastAttacking()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setGhastAttacking(boolean _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(12, _value));
    }

    public int getSlimeSize()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)1;
    }

    public void setSlimeSize(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(12, _value));
    }

    public int getShakingPower()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setShakingPower(int _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(6, _value));
    }

    public int getShakingDirection()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setShakingDirection(int _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(7, _value));
    }

    public float getShakingMultiplier()
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)0;
    }

    public void setShakingMultiplier(float _value)
    {
        MetadataValue value = this.get(8);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat(8, _value));
    }

    public int getMinecartBlock()
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMinecartBlock(int _value)
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(9, _value));
    }

    public int getMinecartBlockPosition()
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return (int)6;
    }

    public void setMinecartBlockPosition(int _value)
    {
        MetadataValue value = this.get(10);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(10, _value));
    }

    public boolean getMinecartCustomBlock()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setMinecartCustomBlock(boolean _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(11, _value));
    }

    public boolean getFurnacePowered()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) return ((MetadataBool)value).value;
        else return false;
    }

    public void setFurnacePowered(boolean _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataBool) ((MetadataBool)value).value = _value;
        else this.add(new MetadataBool(12, _value));
    }

    public String getCommand()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setCommand(String _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString(12, _value));
    }

    public String getLastOutput()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataChat) return ((MetadataChat)value).value;
        else return "";
    }

    public void setLastOutput(String _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataChat) ((MetadataChat)value).value = _value;
        else this.add(new MetadataChat(13, _value));
    }

    public int getFuseTime()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setFuseTime(int _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt(6, _value));
    }

}
