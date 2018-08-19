package soupply.bedrock150.metadata;

import java.util.HashMap;
import soupply.util.*;

public class Metadata extends HashMap<Integer, MetadataValue>
{

    public Metadata()
    {
        this.add(new MetadataLong((int)0, (long)0));
        this.add(new MetadataShort((int)7, (short)0));
        this.add(new MetadataLong((int)38, (long)-1));
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
        MetadataValue value = this.get(0);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return (long)0;
    }

    public void setEntityFlags(long _value)
    {
        MetadataValue value = this.get(0);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)0, _value));
    }

    public int getHealth()
    {
        MetadataValue value = this.get(1);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHealth(int _value)
    {
        MetadataValue value = this.get(1);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)1, _value));
    }

    public int getVariant()
    {
        MetadataValue value = this.get(2);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setVariant(int _value)
    {
        MetadataValue value = this.get(2);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)2, _value));
    }

    public byte getColor()
    {
        MetadataValue value = this.get(3);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setColor(byte _value)
    {
        MetadataValue value = this.get(3);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)3, _value));
    }

    public String getNametag()
    {
        MetadataValue value = this.get(4);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setNametag(String _value)
    {
        MetadataValue value = this.get(4);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)4, _value));
    }

    public long getOwner()
    {
        MetadataValue value = this.get(5);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return (long)-1;
    }

    public void setOwner(long _value)
    {
        MetadataValue value = this.get(5);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)5, _value));
    }

    public long getTarget()
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setTarget(long _value)
    {
        MetadataValue value = this.get(6);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)6, _value));
    }

    public short getAir()
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return (short)0;
    }

    public void setAir(short _value)
    {
        MetadataValue value = this.get(7);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)7, _value));
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
        else this.add(new MetadataInt((int)8, _value));
    }

    public byte getPotionAmbient()
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setPotionAmbient(byte _value)
    {
        MetadataValue value = this.get(9);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)9, _value));
    }

    public int getHurtTime()
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHurtTime(int _value)
    {
        MetadataValue value = this.get(11);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)11, _value));
    }

    public int getHurtDirection()
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setHurtDirection(int _value)
    {
        MetadataValue value = this.get(12);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)12, _value));
    }

    public float getPaddleTimeLeft()
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setPaddleTimeLeft(float _value)
    {
        MetadataValue value = this.get(13);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)13, _value));
    }

    public float getPaddleTimeRight()
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setPaddleTimeRight(float _value)
    {
        MetadataValue value = this.get(14);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)14, _value));
    }

    public int getExperienceCount()
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setExperienceCount(int _value)
    {
        MetadataValue value = this.get(15);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)15, _value));
    }

    public int getMinecartBlock()
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMinecartBlock(int _value)
    {
        MetadataValue value = this.get(16);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)16, _value));
    }

    public int getMinecartOffset()
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMinecartOffset(int _value)
    {
        MetadataValue value = this.get(17);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)17, _value));
    }

    public byte getMinecartHasBlock()
    {
        MetadataValue value = this.get(18);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setMinecartHasBlock(byte _value)
    {
        MetadataValue value = this.get(18);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)18, _value));
    }

    public short getEndermanItemId()
    {
        MetadataValue value = this.get(23);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setEndermanItemId(short _value)
    {
        MetadataValue value = this.get(23);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)23, _value));
    }

    public short getEndermanItemDamage()
    {
        MetadataValue value = this.get(24);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setEndermanItemDamage(short _value)
    {
        MetadataValue value = this.get(24);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)24, _value));
    }

    public short getAge()
    {
        MetadataValue value = this.get(25);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setAge(short _value)
    {
        MetadataValue value = this.get(25);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)25, _value));
    }

    public byte getPlayerFlags()
    {
        MetadataValue value = this.get(27);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setPlayerFlags(byte _value)
    {
        MetadataValue value = this.get(27);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)27, _value));
    }

    public int getPlayerIndex()
    {
        MetadataValue value = this.get(28);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setPlayerIndex(int _value)
    {
        MetadataValue value = this.get(28);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)28, _value));
    }

    public IntXYZ getBedPosition()
    {
        MetadataValue value = this.get(29);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setBedPosition(IntXYZ _value)
    {
        MetadataValue value = this.get(29);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.add(new MetadataBlockPosition((int)29, _value));
    }

    public float getFireballPowerX()
    {
        MetadataValue value = this.get(30);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerX(float _value)
    {
        MetadataValue value = this.get(30);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)30, _value));
    }

    public float getFireballPowerY()
    {
        MetadataValue value = this.get(31);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerY(float _value)
    {
        MetadataValue value = this.get(31);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)31, _value));
    }

    public float getFireballPowerZ()
    {
        MetadataValue value = this.get(32);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setFireballPowerZ(float _value)
    {
        MetadataValue value = this.get(32);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)32, _value));
    }

    public short getPotionAuxValue()
    {
        MetadataValue value = this.get(37);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setPotionAuxValue(short _value)
    {
        MetadataValue value = this.get(37);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)37, _value));
    }

    public long getLeadHolder()
    {
        MetadataValue value = this.get(38);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return (long)-1;
    }

    public void setLeadHolder(long _value)
    {
        MetadataValue value = this.get(38);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)38, _value));
    }

    public float getScale()
    {
        MetadataValue value = this.get(39);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)1;
    }

    public void setScale(float _value)
    {
        MetadataValue value = this.get(39);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)39, _value));
    }

    public String getInteractiveTag()
    {
        MetadataValue value = this.get(40);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setInteractiveTag(String _value)
    {
        MetadataValue value = this.get(40);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)40, _value));
    }

    public String getNpcId()
    {
        MetadataValue value = this.get(41);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setNpcId(String _value)
    {
        MetadataValue value = this.get(41);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)41, _value));
    }

    public String getInteractiveTagUrl()
    {
        MetadataValue value = this.get(42);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setInteractiveTagUrl(String _value)
    {
        MetadataValue value = this.get(42);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)42, _value));
    }

    public short getMaxAir()
    {
        MetadataValue value = this.get(43);
        if(value != null && value instanceof MetadataShort) return ((MetadataShort)value).value;
        else return 0;
    }

    public void setMaxAir(short _value)
    {
        MetadataValue value = this.get(43);
        if(value != null && value instanceof MetadataShort) ((MetadataShort)value).value = _value;
        else this.add(new MetadataShort((int)43, _value));
    }

    public int getMarkVariant()
    {
        MetadataValue value = this.get(44);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMarkVariant(int _value)
    {
        MetadataValue value = this.get(44);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)44, _value));
    }

    public IntXYZ getBlockTarget()
    {
        MetadataValue value = this.get(48);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setBlockTarget(IntXYZ _value)
    {
        MetadataValue value = this.get(48);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.add(new MetadataBlockPosition((int)48, _value));
    }

    public int getInvulnerableTime()
    {
        MetadataValue value = this.get(49);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setInvulnerableTime(int _value)
    {
        MetadataValue value = this.get(49);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)49, _value));
    }

    public long getCenterHeadTarget()
    {
        MetadataValue value = this.get(50);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setCenterHeadTarget(long _value)
    {
        MetadataValue value = this.get(50);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)50, _value));
    }

    public long getLeftHeadTarget()
    {
        MetadataValue value = this.get(51);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setLeftHeadTarget(long _value)
    {
        MetadataValue value = this.get(51);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)51, _value));
    }

    public long getRightHeadTarget()
    {
        MetadataValue value = this.get(52);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setRightHeadTarget(long _value)
    {
        MetadataValue value = this.get(52);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)52, _value));
    }

    public float getBoundingBoxWidth()
    {
        MetadataValue value = this.get(54);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setBoundingBoxWidth(float _value)
    {
        MetadataValue value = this.get(54);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)54, _value));
    }

    public float getBoundingBoxHeight()
    {
        MetadataValue value = this.get(55);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setBoundingBoxHeight(float _value)
    {
        MetadataValue value = this.get(55);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)55, _value));
    }

    public int getFuseLength()
    {
        MetadataValue value = this.get(56);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setFuseLength(int _value)
    {
        MetadataValue value = this.get(56);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)56, _value));
    }

    public FloatXYZ getRiderSeatPosition()
    {
        MetadataValue value = this.get(57);
        if(value != null && value instanceof MetadataEntityPosition) return ((MetadataEntityPosition)value).value;
        else return null;
    }

    public void setRiderSeatPosition(FloatXYZ _value)
    {
        MetadataValue value = this.get(57);
        if(value != null && value instanceof MetadataEntityPosition) ((MetadataEntityPosition)value).value = _value;
        else this.add(new MetadataEntityPosition((int)57, _value));
    }

    public byte getRiderRotationLocked()
    {
        MetadataValue value = this.get(58);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setRiderRotationLocked(byte _value)
    {
        MetadataValue value = this.get(58);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)58, _value));
    }

    public float getRiderMaxRotation()
    {
        MetadataValue value = this.get(59);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setRiderMaxRotation(float _value)
    {
        MetadataValue value = this.get(59);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)59, _value));
    }

    public float getRiderMinRotation()
    {
        MetadataValue value = this.get(60);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return 0;
    }

    public void setRiderMinRotation(float _value)
    {
        MetadataValue value = this.get(60);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)60, _value));
    }

    public float getAreaEffectCloudRadius()
    {
        MetadataValue value = this.get(61);
        if(value != null && value instanceof MetadataFloat) return ((MetadataFloat)value).value;
        else return (float)0.5;
    }

    public void setAreaEffectCloudRadius(float _value)
    {
        MetadataValue value = this.get(61);
        if(value != null && value instanceof MetadataFloat) ((MetadataFloat)value).value = _value;
        else this.add(new MetadataFloat((int)61, _value));
    }

    public int getAreaEffectCloudWaiting()
    {
        MetadataValue value = this.get(62);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setAreaEffectCloudWaiting(int _value)
    {
        MetadataValue value = this.get(62);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)62, _value));
    }

    public int getAreaEffectCloudParticle()
    {
        MetadataValue value = this.get(63);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setAreaEffectCloudParticle(int _value)
    {
        MetadataValue value = this.get(63);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)63, _value));
    }

    public int getShulkerPeakHeight()
    {
        MetadataValue value = this.get(64);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setShulkerPeakHeight(int _value)
    {
        MetadataValue value = this.get(64);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)64, _value));
    }

    public byte getShulkerDirection()
    {
        MetadataValue value = this.get(65);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setShulkerDirection(byte _value)
    {
        MetadataValue value = this.get(65);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)65, _value));
    }

    public IntXYZ getShulkerAttachment()
    {
        MetadataValue value = this.get(67);
        if(value != null && value instanceof MetadataBlockPosition) return ((MetadataBlockPosition)value).value;
        else return null;
    }

    public void setShulkerAttachment(IntXYZ _value)
    {
        MetadataValue value = this.get(67);
        if(value != null && value instanceof MetadataBlockPosition) ((MetadataBlockPosition)value).value = _value;
        else this.add(new MetadataBlockPosition((int)67, _value));
    }

    public long getTradingPlayer()
    {
        MetadataValue value = this.get(68);
        if(value != null && value instanceof MetadataLong) return ((MetadataLong)value).value;
        else return 0;
    }

    public void setTradingPlayer(long _value)
    {
        MetadataValue value = this.get(68);
        if(value != null && value instanceof MetadataLong) ((MetadataLong)value).value = _value;
        else this.add(new MetadataLong((int)68, _value));
    }

    public String getCommandBlockCommand()
    {
        MetadataValue value = this.get(71);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setCommandBlockCommand(String _value)
    {
        MetadataValue value = this.get(71);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)71, _value));
    }

    public String getCommandBlockLastOutput()
    {
        MetadataValue value = this.get(72);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setCommandBlockLastOutput(String _value)
    {
        MetadataValue value = this.get(72);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)72, _value));
    }

    public String getCommandBlockTrackOutput()
    {
        MetadataValue value = this.get(73);
        if(value != null && value instanceof MetadataString) return ((MetadataString)value).value;
        else return "";
    }

    public void setCommandBlockTrackOutput(String _value)
    {
        MetadataValue value = this.get(73);
        if(value != null && value instanceof MetadataString) ((MetadataString)value).value = _value;
        else this.add(new MetadataString((int)73, _value));
    }

    public byte getControllingRiderSeatNumber()
    {
        MetadataValue value = this.get(74);
        if(value != null && value instanceof MetadataByte) return ((MetadataByte)value).value;
        else return 0;
    }

    public void setControllingRiderSeatNumber(byte _value)
    {
        MetadataValue value = this.get(74);
        if(value != null && value instanceof MetadataByte) ((MetadataByte)value).value = _value;
        else this.add(new MetadataByte((int)74, _value));
    }

    public int getStrength()
    {
        MetadataValue value = this.get(75);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setStrength(int _value)
    {
        MetadataValue value = this.get(75);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)75, _value));
    }

    public int getMaxStrength()
    {
        MetadataValue value = this.get(76);
        if(value != null && value instanceof MetadataInt) return ((MetadataInt)value).value;
        else return 0;
    }

    public void setMaxStrength(int _value)
    {
        MetadataValue value = this.get(76);
        if(value != null && value instanceof MetadataInt) ((MetadataInt)value).value = _value;
        else this.add(new MetadataInt((int)76, _value));
    }

}
