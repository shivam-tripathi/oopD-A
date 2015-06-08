import java.io.*;

public class Remote
{
    private Dogdoor door;

    public Remote(Dogdoor door)
    {
        this.door = door;
    }

    public void pressButton()
    {
        System.out.println("Pressing remote button.");
        if(door.isOpen())
        {
            door.close();
        }
        else
        {
            door.open();
        }

    }
}
