import java.io.*;
public class Dogdoor

{
    private boolean open;

    public Dogdoor()
    {
        this.open = false;
    }

    public void open()
    {
        System.out.println("Dog door opens");
        open = true;
    }

    public void close()
    {
        System.out.println("Dog door closes");
        open = false;
    }

    public boolean isOpen()
    {
        return open;
    }

}
