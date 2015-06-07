import java.io.*;
import java.util.*;

public class Guitar
{
    private String serialNumber;
    private double price;
    GuitarSpec spec;
    public Guitar(String serialNumber,
                String model,
                String builder,
                String type,
                String backwood,
                String topwood,
                double price)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        spec = new GuitarSpec(model, builder, type, backwood, topwood);

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
