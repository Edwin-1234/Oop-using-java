class callme
{
    synchronized void display(String msg)
    {
        System.out.print("["+msg);
        try {
            Thread.sleep(4000);
        } catch(Exception e) {
            System.out.println("error");
        }
        System.out.println("]");
    }
}
class caller implements Runnable
{
    callme target;
    String msg;
    Thread t1;
    caller(callme t,String msg)
    {
        target=t;
        this.msg=msg;
        t1=new Thread(this);
        t1.start();
    }
    public void run()
    {
        target.display(msg);
    }
}
public class thread
{
    public static void main(String[] args)
    {
        callme tar=new callme();
        caller t1=new caller(tar,"hi");
        caller t2=new caller(tar,"how");
        caller t3=new caller(tar,"are");
        caller t4=new caller(tar,"you");
    }
}
