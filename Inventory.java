import java.io.*;
import java.util.*;

public class Inventory
{
    private List guitars;
/*
 * 'List' of object of class Guitar. Each element will correspond to one guitar
 * in the inventory.
 */

    public Inventory()
    {
        guitars = new LinkedList();
    }

/*
 * Initialise the list as object of class LinkedList. List is an interface in
 * java.util package, afaik.
 */

    public void addGuitar(String serialNumber,
                String model,
                String builder,
                String type,
                String backwood,
                String topwood,
                double price)
    {
        Guitar guitar = new Guitar(serialNumber,
                                model,
                                builder,
                                type,
                                backwood,
                                topwood,
                                price);
        guitars.add(guitar);

    }

/*
 * _.add(_) adds the element to the list. addGuitar(_) takes all arguments
 * needed to call the Guitar class constructor, and then initialises guitar, an
 * object of the class Guitar.
 */

    public Guitar getGuitar(String serialNumber)
    {
        for( Iterator i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = (Guitar)i.next();
            // type casting into object
            if (guitar.getSerialNumber().equals(serialNumber)) // object.variable
            {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar)
    {
        for(Iterator i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = (Guitar)i.next();
            String builder = searchGuitar.getBuilder();
            String type = searchGuitar.getType();
            String backwood = searchGuitar.getBackwood();
            String topwood = searchGuitar.getTopwood();
            String model = searchGuitar.getModel();
            if((builder!=null) && !(builder.equals("")) && !(builder.equals(guitar.getBuilder())))
                continue;
            else if((type!=null) && !(type.equals("")) && !(type.equals(guitar.getType())))
                continue;
            else if((backwood!=null) && !(backwood.equals("")) && !(backwood.equals(guitar.getBackwood())))
                continue;
            else if((topwood!=null) && !(topwood.equals("")) && !(topwood.equals(guitar.getTopwood())))
                continue;
            else if((model!=null) && !(model.equals("")) && !(model.equals(guitar.getModel())))
                continue;
            else
                return guitar;
        }
        return null;
    }
}

/*
 * Parts of a good object-oriented software:
 *  1. Customer friendly i.e. it must do whatever the customer thinks it should
 *      do.
 *  2. Object oriented i.e. no repeated code, objects control their own
 *      behaviour, flexible and solid design which can be extended.
 *  3. Design perfect i.e. objects are loosely coupled, code is open for
 *      extention but closed for modification. making reusability important
 *      feature of the code.
 * Well coded, well designed, easy to maintain, reuse and extend.
 */
