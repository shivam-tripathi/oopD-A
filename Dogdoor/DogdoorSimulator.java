import java.io.*;

public class DogdoorSimulator
{
    public static void main(String []args)throws IOException
    {
        Dogdoor door = new Dogdoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to be let outside.");
        remote.pressButton();
        System.out.println("Fido has gone outside.");
        remote.pressButton();
        System.out.println("Fido's all done.");
        remote.pressButton();
        System.out.println("Fido's in.");
        remote.pressButton();
    }
}
