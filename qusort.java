import java.io.*;
import java.util.*;
class qsort
{
    String nam[];
    int l,h;
    void qusort(String nam[],int l,int h)
    {
        this.nam=nam;
        this.l=l;this.h=h;
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
            qusort(nam,l,j);
        }
        if(i<h)
        {
            qusort(nam,i,h);
        }
    } 
}
    
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
        qsort q=new qsort();
        q.qusort(names,0,n-1);
        System.out.println("Sorted order");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]+" ");
        }
    } 
}
