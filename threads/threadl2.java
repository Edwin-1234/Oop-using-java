import java.util.Random;
class flagvariables
{
    static boolean enumgen,onumgen;
    static int num;
}
class rand extends Thread
{
    public void run()
    {
        Random r=new Random();
        while(true)
        {
            while(flagvariables.enumgen||flagvariables.onumgen)
            {
                
            }
            int n=r.nextInt();
            flagvariables.num=n;
            if(n%2==0)
            {
                flagvariables.enumgen=true;
            }
            else
            {
                flagvariables.onumgen=true;
            }
        }
    }
}
class Square extends Thread
{
    public void run()
    {
        while(true)
        {
            while(!flagvariables.enumgen)
            {
                
            }
            System.out.println("Square="+flagvariables.num*flagvariables.num);
            flagvariables.enumgen=false;
        }
    }
}
class Cube extends Thread
{
    public void run()
    {
        while(true)
        {
            while(!flagvariables.onumgen)
            {
                
            }
            System.out.println("Cube="+flagvariables.num*flagvariables.num*flagvariables.num);
            flagvariables.onumgen=false;
        }
    }
}
public class threadlab
{
    public static void main(String[] args)
    {
        rand r=new rand();
        Square s=new Square();
        Cube c=new Cube();
        flagvariables.onumgen = false;
        flagvariables.enumgen = false;
        r.start();
        s.start();
        c.start();
        try 
        {
            r.join();
            s.join();
            c.join();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
