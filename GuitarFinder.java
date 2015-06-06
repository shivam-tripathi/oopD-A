import java.io.*;
public class GuitarFinder
{
    public static void main(String[] args)throws IOException
    {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        Guitar whatErinLikes = new Guitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 0);
        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null )
        {
            System.out.println("Erin, you might like this");
            showGuitar(guitar);
        }
        else
        {
            System.out.println("Sorry, Erin we have nothing for you");
        }
    }
    public static void initialiseInventory(Inventory inventory)
    {
        inventory.addGuitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 0);
    }
    public static void showGuitar(Guitar guitar)
    {
        String builder = guitar.getBuilder();
        String type = guitar.getType();
        String backwood = guitar.getBackwood();
        String topwood = guitar.getTopwood();
        String model = guitar.getModel();
        System.out.println(builder+"\n"+type+"\n"+backwood+"\n"+topwood+"\n"+model);
    }
}
