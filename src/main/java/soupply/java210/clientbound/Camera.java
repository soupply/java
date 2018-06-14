package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class Camera extends soupply.java210.Packet
{

    public int entityId;

    public Camera()
    {
    }

    public Camera(int entityId)
    {
        this.entityId = entityId;
    }

}
