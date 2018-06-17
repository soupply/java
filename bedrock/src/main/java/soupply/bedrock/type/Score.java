package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class Score extends Type
{

    public UUID uuid;
    public String objectiveName;
    public int score;

    public Score()
    {
        this.uuid = new UUID();
    }

    public Score(UUID uuid, String objectiveName, int score)
    {
        this.uuid = uuid;
        this.objectiveName = objectiveName;
        this.score = score;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
