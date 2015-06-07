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
                double price,
                int numStrings)
    {
        GuitarSpec spec = new GuitarSpec(model,
                                        builder,
                                        type,
                                        backwood,
                                        topwood,
                                        numStrings);
        Guitar guitar = new Guitar(serialNumber,
                                spec,
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
            if (guitar.getSerialNumber().equals(serialNumber)) //object.variable
            {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar)
    {

        List foundGuitars = new LinkedList();

        for(Iterator i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec spec = guitar.getSpec();

            if (spec.matches(searchGuitar))
                foundGuitars.add(guitar);

        }
        return foundGuitars;
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
