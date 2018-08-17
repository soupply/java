package soupply.bedrock274.metadata;

import java.util.HashMap;
import soupply.util.*;

public class Metadata extends HashMap<Integer, MetadataValue>
{

    public Metadata()
    {
        this.values.put(0, new MetadataLong(0, (long)0);
        this.values.put(7, new MetadataShort(7, (short)0);
        this.values.put(38, new MetadataLong(38, (long)-1);
    }

    public void add(MetadataValue value)
    {
        this.put(value.id, value);
    }

    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(this.size());
        for(MetadataValue value : this.values())
        {
            value.encodeBody(_buffer);
        }
    }

    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        int length = _buffer.readVaruint();
        while(length-- > 0)
        {
            final int id = _buffer.readVaruint();
            final int type = _buffer.readVaruint();
            MetadataValue value = getMetadataValue(id, type);
            value.decodeBody(_buffer);
            this.add(value);
        }
    }

    public static MetadataValue getMetadataValue(int id, int type) throws MetadataException
    {
        switch(type)
        {
            case 0: return new MetadataByte(id);
            case 1: return new MetadataShort(id);
            case 2: return new MetadataInt(id);
            case 3: return new MetadataFloat(id);
            case 4: return new MetadataString(id);
            case 5: return new MetadataSlot(id);
            case 6: return new MetadataBlockPosition(id);
            case 7: return new MetadataLong(id);
            case 8: return new MetadataEntityPosition(id);
            default: throw new MetadataException(id, type);
        }
    }

    public long getEntityFlags()
    {
        MetadataValue value = this.values.get(0);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        return (long)0;
    }

    public void setEntityFlags(long _value)
    {
        MetadataValue value = this.values.get(0);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(0, new MetadataLong(0, _value);
    }

    public int getHealth()
    {
        MetadataValue value = this.values.get(1);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHealth(int _value)
    {
        MetadataValue value = this.values.get(1);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(1, new MetadataInt(1, _value);
    }

    public int getVariant()
    {
        MetadataValue value = this.values.get(2);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setVariant(int _value)
    {
        MetadataValue value = this.values.get(2);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(2, new MetadataInt(2, _value);
    }

    public byte getColor()
    {
        MetadataValue value = this.values.get(3);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setColor(byte _value)
    {
        MetadataValue value = this.values.get(3);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(3, new MetadataByte(3, _value);
    }

    public String getNametag()
    {
        MetadataValue value = this.values.get(4);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setNametag(String _value)
    {
        MetadataValue value = this.values.get(4);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(4, new MetadataString(4, _value);
    }

    public long getOwner()
    {
        MetadataValue value = this.values.get(5);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        return (long)-1;
    }

    public void setOwner(long _value)
    {
        MetadataValue value = this.values.get(5);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(5, new MetadataLong(5, _value);
    }

    public long getTarget()
    {
        MetadataValue value = this.values.get(6);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setTarget(long _value)
    {
        MetadataValue value = this.values.get(6);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(6, new MetadataLong(6, _value);
    }

    public short getAir()
    {
        MetadataValue value = this.values.get(7);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        return (short)0;
    }

    public void setAir(short _value)
    {
        MetadataValue value = this.values.get(7);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(7, new MetadataShort(7, _value);
    }

    public int getPotionColor()
    {
        MetadataValue value = this.values.get(8);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setPotionColor(int _value)
    {
        MetadataValue value = this.values.get(8);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(8, new MetadataInt(8, _value);
    }

    public byte getPotionAmbient()
    {
        MetadataValue value = this.values.get(9);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setPotionAmbient(byte _value)
    {
        MetadataValue value = this.values.get(9);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(9, new MetadataByte(9, _value);
    }

    public int getHurtTime()
    {
        MetadataValue value = this.values.get(11);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHurtTime(int _value)
    {
        MetadataValue value = this.values.get(11);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(11, new MetadataInt(11, _value);
    }

    public int getHurtDirection()
    {
        MetadataValue value = this.values.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHurtDirection(int _value)
    {
        MetadataValue value = this.values.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(12, new MetadataInt(12, _value);
    }

    public float getPaddleTimeLeft()
    {
        MetadataValue value = this.values.get(13);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setPaddleTimeLeft(float _value)
    {
        MetadataValue value = this.values.get(13);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(13, new MetadataFloat(13, _value);
    }

    public float getPaddleTimeRight()
    {
        MetadataValue value = this.values.get(14);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setPaddleTimeRight(float _value)
    {
        MetadataValue value = this.values.get(14);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(14, new MetadataFloat(14, _value);
    }

    public int getExperienceCount()
    {
        MetadataValue value = this.values.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setExperienceCount(int _value)
    {
        MetadataValue value = this.values.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(15, new MetadataInt(15, _value);
    }

    public int getMinecartBlock()
    {
        MetadataValue value = this.values.get(16);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMinecartBlock(int _value)
    {
        MetadataValue value = this.values.get(16);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(16, new MetadataInt(16, _value);
    }

    public int getMinecartOffset()
    {
        MetadataValue value = this.values.get(17);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMinecartOffset(int _value)
    {
        MetadataValue value = this.values.get(17);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(17, new MetadataInt(17, _value);
    }

    public byte getMinecartHasBlock()
    {
        MetadataValue value = this.values.get(18);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setMinecartHasBlock(byte _value)
    {
        MetadataValue value = this.values.get(18);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(18, new MetadataByte(18, _value);
    }

    public short getEndermanItemId()
    {
        MetadataValue value = this.values.get(23);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setEndermanItemId(short _value)
    {
        MetadataValue value = this.values.get(23);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(23, new MetadataShort(23, _value);
    }

    public short getEndermanItemDamage()
    {
        MetadataValue value = this.values.get(24);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setEndermanItemDamage(short _value)
    {
        MetadataValue value = this.values.get(24);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(24, new MetadataShort(24, _value);
    }

    public short getAge()
    {
        MetadataValue value = this.values.get(25);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setAge(short _value)
    {
        MetadataValue value = this.values.get(25);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(25, new MetadataShort(25, _value);
    }

    public byte getPlayerFlags()
    {
        MetadataValue value = this.values.get(27);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setPlayerFlags(byte _value)
    {
        MetadataValue value = this.values.get(27);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(27, new MetadataByte(27, _value);
    }

    public int getPlayerIndex()
    {
        MetadataValue value = this.values.get(28);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setPlayerIndex(int _value)
    {
        MetadataValue value = this.values.get(28);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(28, new MetadataInt(28, _value);
    }

    public IntXYZ getBedPosition()
    {
        MetadataValue value = this.values.get(29);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setBedPosition(IntXYZ _value)
    {
        MetadataValue value = this.values.get(29);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.values.put(29, new MetadataBlockPosition(29, _value);
    }

    public float getFireballPowerX()
    {
        MetadataValue value = this.values.get(30);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerX(float _value)
    {
        MetadataValue value = this.values.get(30);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(30, new MetadataFloat(30, _value);
    }

    public float getFireballPowerY()
    {
        MetadataValue value = this.values.get(31);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerY(float _value)
    {
        MetadataValue value = this.values.get(31);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(31, new MetadataFloat(31, _value);
    }

    public float getFireballPowerZ()
    {
        MetadataValue value = this.values.get(32);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerZ(float _value)
    {
        MetadataValue value = this.values.get(32);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(32, new MetadataFloat(32, _value);
    }

    public short getPotionAuxValue()
    {
        MetadataValue value = this.values.get(37);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setPotionAuxValue(short _value)
    {
        MetadataValue value = this.values.get(37);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(37, new MetadataShort(37, _value);
    }

    public long getLeadHolder()
    {
        MetadataValue value = this.values.get(38);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        return (long)-1;
    }

    public void setLeadHolder(long _value)
    {
        MetadataValue value = this.values.get(38);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(38, new MetadataLong(38, _value);
    }

    public float getScale()
    {
        MetadataValue value = this.values.get(39);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        return (float)1;
    }

    public void setScale(float _value)
    {
        MetadataValue value = this.values.get(39);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(39, new MetadataFloat(39, _value);
    }

    public String getInteractiveTag()
    {
        MetadataValue value = this.values.get(40);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setInteractiveTag(String _value)
    {
        MetadataValue value = this.values.get(40);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(40, new MetadataString(40, _value);
    }

    public String getNpcId()
    {
        MetadataValue value = this.values.get(41);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setNpcId(String _value)
    {
        MetadataValue value = this.values.get(41);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(41, new MetadataString(41, _value);
    }

    public String getInteractiveTagUrl()
    {
        MetadataValue value = this.values.get(42);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setInteractiveTagUrl(String _value)
    {
        MetadataValue value = this.values.get(42);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(42, new MetadataString(42, _value);
    }

    public short getMaxAir()
    {
        MetadataValue value = this.values.get(43);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setMaxAir(short _value)
    {
        MetadataValue value = this.values.get(43);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.values.put(43, new MetadataShort(43, _value);
    }

    public int getMarkVariant()
    {
        MetadataValue value = this.values.get(44);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMarkVariant(int _value)
    {
        MetadataValue value = this.values.get(44);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(44, new MetadataInt(44, _value);
    }

    public IntXYZ getBlockTarget()
    {
        MetadataValue value = this.values.get(48);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setBlockTarget(IntXYZ _value)
    {
        MetadataValue value = this.values.get(48);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.values.put(48, new MetadataBlockPosition(48, _value);
    }

    public int getInvulnerableTime()
    {
        MetadataValue value = this.values.get(49);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setInvulnerableTime(int _value)
    {
        MetadataValue value = this.values.get(49);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(49, new MetadataInt(49, _value);
    }

    public long getCenterHeadTarget()
    {
        MetadataValue value = this.values.get(50);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setCenterHeadTarget(long _value)
    {
        MetadataValue value = this.values.get(50);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(50, new MetadataLong(50, _value);
    }

    public long getLeftHeadTarget()
    {
        MetadataValue value = this.values.get(51);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setLeftHeadTarget(long _value)
    {
        MetadataValue value = this.values.get(51);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(51, new MetadataLong(51, _value);
    }

    public long getRightHeadTarget()
    {
        MetadataValue value = this.values.get(52);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setRightHeadTarget(long _value)
    {
        MetadataValue value = this.values.get(52);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(52, new MetadataLong(52, _value);
    }

    public float getBoundingBoxWidth()
    {
        MetadataValue value = this.values.get(54);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setBoundingBoxWidth(float _value)
    {
        MetadataValue value = this.values.get(54);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(54, new MetadataFloat(54, _value);
    }

    public float getBoundingBoxHeight()
    {
        MetadataValue value = this.values.get(55);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setBoundingBoxHeight(float _value)
    {
        MetadataValue value = this.values.get(55);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(55, new MetadataFloat(55, _value);
    }

    public int getFuseLength()
    {
        MetadataValue value = this.values.get(56);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setFuseLength(int _value)
    {
        MetadataValue value = this.values.get(56);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(56, new MetadataInt(56, _value);
    }

    public FloatXYZ getRiderSeatPosition()
    {
        MetadataValue value = this.values.get(57);
        if(value != null && value instanceof MetadataEntityPosition) return ((MetadataEntityPosition)value).value;
        else return null;
    }

    public void setRiderSeatPosition(FloatXYZ _value)
    {
        MetadataValue value = this.values.get(57);
        if(value != null && value instanceof MetadataEntityPosition) ((MetadataEntityPosition)value).value = _value;
        else this.values.put(57, new MetadataEntityPosition(57, _value);
    }

    public byte getRiderRotationLocked()
    {
        MetadataValue value = this.values.get(58);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setRiderRotationLocked(byte _value)
    {
        MetadataValue value = this.values.get(58);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(58, new MetadataByte(58, _value);
    }

    public float getRiderMaxRotation()
    {
        MetadataValue value = this.values.get(59);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setRiderMaxRotation(float _value)
    {
        MetadataValue value = this.values.get(59);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(59, new MetadataFloat(59, _value);
    }

    public float getRiderMinRotation()
    {
        MetadataValue value = this.values.get(60);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setRiderMinRotation(float _value)
    {
        MetadataValue value = this.values.get(60);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(60, new MetadataFloat(60, _value);
    }

    public float getAreaEffectCloudRadius()
    {
        MetadataValue value = this.values.get(61);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        return (float)0.5;
    }

    public void setAreaEffectCloudRadius(float _value)
    {
        MetadataValue value = this.values.get(61);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.values.put(61, new MetadataFloat(61, _value);
    }

    public int getAreaEffectCloudWaiting()
    {
        MetadataValue value = this.values.get(62);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setAreaEffectCloudWaiting(int _value)
    {
        MetadataValue value = this.values.get(62);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(62, new MetadataInt(62, _value);
    }

    public int getAreaEffectCloudParticle()
    {
        MetadataValue value = this.values.get(63);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setAreaEffectCloudParticle(int _value)
    {
        MetadataValue value = this.values.get(63);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(63, new MetadataInt(63, _value);
    }

    public int getShulkerPeakHeight()
    {
        MetadataValue value = this.values.get(64);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setShulkerPeakHeight(int _value)
    {
        MetadataValue value = this.values.get(64);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(64, new MetadataInt(64, _value);
    }

    public byte getShulkerDirection()
    {
        MetadataValue value = this.values.get(65);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setShulkerDirection(byte _value)
    {
        MetadataValue value = this.values.get(65);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(65, new MetadataByte(65, _value);
    }

    public IntXYZ getShulkerAttachment()
    {
        MetadataValue value = this.values.get(67);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setShulkerAttachment(IntXYZ _value)
    {
        MetadataValue value = this.values.get(67);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.values.put(67, new MetadataBlockPosition(67, _value);
    }

    public long getTradingPlayer()
    {
        MetadataValue value = this.values.get(68);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setTradingPlayer(long _value)
    {
        MetadataValue value = this.values.get(68);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.values.put(68, new MetadataLong(68, _value);
    }

    public String getCommandBlockCommand()
    {
        MetadataValue value = this.values.get(71);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setCommandBlockCommand(String _value)
    {
        MetadataValue value = this.values.get(71);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(71, new MetadataString(71, _value);
    }

    public String getCommandBlockLastOutput()
    {
        MetadataValue value = this.values.get(72);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setCommandBlockLastOutput(String _value)
    {
        MetadataValue value = this.values.get(72);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(72, new MetadataString(72, _value);
    }

    public String getCommandBlockTrackOutput()
    {
        MetadataValue value = this.values.get(73);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return null;
    }

    public void setCommandBlockTrackOutput(String _value)
    {
        MetadataValue value = this.values.get(73);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.values.put(73, new MetadataString(73, _value);
    }

    public byte getControllingRiderSeatNumber()
    {
        MetadataValue value = this.values.get(74);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setControllingRiderSeatNumber(byte _value)
    {
        MetadataValue value = this.values.get(74);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.values.put(74, new MetadataByte(74, _value);
    }

    public int getStrength()
    {
        MetadataValue value = this.values.get(75);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setStrength(int _value)
    {
        MetadataValue value = this.values.get(75);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(75, new MetadataInt(75, _value);
    }

    public int getMaxStrength()
    {
        MetadataValue value = this.values.get(76);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMaxStrength(int _value)
    {
        MetadataValue value = this.values.get(76);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.values.put(76, new MetadataInt(76, _value);
    }

}
