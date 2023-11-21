import java.util.*;
import java.io.*;
class sumofintegers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader rde=new BufferedReader(new InputStreamReader(System.in));
        System .out.println("Enter a line of integers seprated by space");
        String num=rde.readLine();
        StringTokenizer t=new StringTokenizer(num);
        int sum=0;
        while(t.hasMoreTokens())
        {
            String n=t.nextToken();
            int nub=Integer.parseInt(n);
            sum=sum+nub;
        }
        System.out.println("Sum="+sum);    
    }
}
