package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class UpdateHealth extends soupply.java335.Packet
{

    public float health;
    public int hunger;
    public float saturation;

    public UpdateHealth()
    {
    }

    public UpdateHealth(float health, int hunger, float saturation)
    {
        this.health = health;
        this.hunger = hunger;
        this.saturation = saturation;
    }

}
