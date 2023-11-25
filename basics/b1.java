class rectangle
{
    int l,br,a;
    void read(int a,int b)
    {
        l=a;br=b;
    }
    int area()
    {
        a=l*br;
        return a;
    }
    void print()
    {
        System.out.print("area of the rectangle is"+a);
    }
}
public class HelloWorld
{
    public static void main(String[] args) 
    {
        rectangle r;
        r=new rectangle();
        r.read(2,6);
        r.area();
        r.print();
    }
}
