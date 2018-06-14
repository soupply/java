package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class Camera extends soupply.java338.Packet
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
