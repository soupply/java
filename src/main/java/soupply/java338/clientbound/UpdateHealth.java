package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class UpdateHealth extends soupply.java338.Packet
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
