class even extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even:"+i);
            }
        }
    }
}
class odd extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd:"+i);
            }
        }
    }
}
public class threadl3
{
    public static void main(String[] args)
    {
        even e=new even();
        odd o=new odd();
        e.start();
        o.start();
        try{
            e.join();
            o.join();
        }
        catch(Exception ex)
        {
            System.out.println("Error");
        }
    }
}
