import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner rd=new Scanner(System.in);
        System.out.println("Enter the number of names");
        int n=rd.nextInt();
        rd.nextLine(); 
        String names[]=new String[n];
        System.out.println("Enter the names");
        for(int i=0;i<n;i++)
        {
            names[i]=rd.nextLine();
        }
        quicks(names,0,n-1);
        System.out.println("Sorted order");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]+" ");
        }
    }
    static void quicks(String nam[],int l,int h)
    {
        int i=l,j=h;
        int mid=(int)(l+(h-l)/2);
        String pi=nam[mid];
        while(i<=j)
        {
            while(nam[i].compareToIgnoreCase(pi)<0)
            {
                i++;
            }
            while(nam[j].compareToIgnoreCase(pi)>0)
            {
                j--;
            }
            if(i<=j)
            {
                String temp=nam[i];
                nam[i]=nam[j];
                nam[j]=temp;
                i++;j--;
            }
        }
        if(l<j)
        {
            quicks(nam,l,j);
        }
        if(i<h)
        {
            quicks(nam,i,h);
        }
    } 
}
