import java.util.*;
import java.lang.*;
class flagvari
{
   static int num;
   static boolean enumgen;
   static boolean onumgen;
}
class rand extends Thread
{
   public void run()
   {
      Random r=new Random();
      while(true)
      {
         while(flagvari.enumgen||flagvari.onumgen);
             int n=r.nextInt(10)+1;
             flagvari.num=n;
             if(n%2==0)
             {
                flagvari.enumgen=true;
             }
             else
             {
                flagvari.onumgen=true;
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
        while(!flagvari.enumgen);
          System.out.println(flagvari.num+ ":Square="+flagvari.num*flagvari.num);
          flagvari.enumgen=false;
      }
    }
}
class Cube extends Thread
{
   public void run()
   {
     while(true)
     {
        while(!flagvari.onumgen);
           System.out.println(flagvari.num+ ":Cube="+flagvari.num*flagvari.num*flagvari.num);
           flagvari.onumgen=false;
     }
   }
}
class pgm11
{
   public static void main(String[] args)
   {
     rand r=new rand();
     Square s=new Square();
     Cube c=new Cube();
     flagvari.enumgen=false;
     flagvari.onumgen=false;
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
         System.out.println(e);
     }
   }
}

