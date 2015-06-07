import java.io.*;
import java.util.*;

class GuitarSpec
{
    private String model, type, backwood, builder, topwood;
    private int numString;

    public GuitarSpec(String model,
                String builder,
                String type,
                String backwood,
                String topwood,
                int numString)
    {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
        this.numString = numString;
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

    public int getNumString()
    {
        return numString;
    }

    public boolean matches(GuitarSpec searchSpec)
    {
        if((builder!=null) && !(builder.equals(""))
            && !(builder.equalsIgnoreCase(searchSpec.getBuilder())))
            return false;

        if((type!=null) && !(type.equals(""))
            && !(type.equalsIgnoreCase(searchSpec.getType())))
            return false;

        if((backwood!=null) && !(backwood.equals(""))
            && !(backwood.equalsIgnoreCase(searchSpec.getBackwood())))
            return false;

        if((topwood!=null) && !(topwood.equals(""))
            && !(topwood.equalsIgnoreCase(searchSpec.getTopwood())))
            return false;

        if((model!=null) && !(model.equals(""))
            && !(model.equalsIgnoreCase(searchSpec.getModel())))
            return false;

        return true;
    }
}
