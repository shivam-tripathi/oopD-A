import java.io.*;
import java.util.*;

class GuitarSpec
{
    private String model, type, backwood, builder, topwood;

    public GuitarSpec(String model,
                String builder,
                String type,
                String backwood,
                String topwood)
    {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }

    public String getModel()
    {
        return model;
    }

    public String getBuilder()
    {
        return builder;
    }

    public String getType()
    {
        return type;
    }

    public String getBackwood()
    {
        return backwood;
    }

    public String getTopwood()
    {
        return topwood;
    }
}
