import java.io.*;
import java.util.*;
public class GuitarFinder
{
    public static void main(String[] args)throws IOException
    {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec("fender", "Stratocastor", "electric", "Alder", "Alder");
        List foundGuitars = inventory.search(whatErinLikes);
        if(!(foundGuitars.isEmpty()))
            for( Iterator i = foundGuitars.iterator(); i.hasNext();)
            {
                Guitar guitar = (Guitar)i.next();
               if (guitar != null )
                {
                    System.out.println("Erin, you might like this");
                    showGuitar(guitar);
                }
            }
        else
            {
                System.out.println("Sorry, Erin we have nothing for you");
            }
    }
    public static void initialiseInventory(Inventory inventory)
    {
        inventory.addGuitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 0);
        inventory.addGuitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 1723232);
    }
    public static void showGuitar(Guitar guitar)
    {
        GuitarSpec spec = guitar.getSpec();

        String builder = spec.getBuilder();
        String type = spec.getType();
        String backwood = spec.getBackwood();
        String topwood = spec.getTopwood();
        String model = spec.getModel();
        double price = guitar.getPrice();
        System.out.println("\n\t"+builder+"\t"+type+"\t"+backwood+"\t"+topwood+"\t"+model+"\t"+price);
    }
}
