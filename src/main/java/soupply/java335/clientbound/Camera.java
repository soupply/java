package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class Camera extends soupply.java335.Packet
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
