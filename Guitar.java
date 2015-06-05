public class Guitar
{
    private String serialNumber, model, builder, type, backwood, topwood;
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

    public double getprice()
    {
        return price;
    }

    public setPrice(float newPrice)
    {
        this.price = newPrice;
    }

    public getModel()
    {
        return model;
    }

     public getType()
    {
        return type;
    }

     public getBackwood()
    {
        return backwood;
    }

     public getTopwood()
    {
        return topwood
    }
}