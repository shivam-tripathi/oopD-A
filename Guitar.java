import java.io.*;
import java.util.*;

public class Guitar
{
    private String serialNumber, model, type, backwood, topwood;
    String builder;
    private double price;
    public Guitar(String serialNumber,
                String model,
                String builder,
                String type,
                String backwood,
                String topwood,
                double price)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
        this.price = price;

    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(float newPrice)
    {
        this.price = newPrice;
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
