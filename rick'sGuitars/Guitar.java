import java.io.*;
import java.util.*;

public class Guitar
{
    private String serialNumber;
    private double price;
    GuitarSpec spec;

    public Guitar(String serialNumber, GuitarSpec spec, double price)
    {
        this.serialNumber = serialNumber;
        this.spec = spec;
        this.price = price;
        //new GuitarSpec(model, builder, type, backwood, topwood, numString);

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

    public GuitarSpec getSpec()
    {
        return this.spec;
    }
}
