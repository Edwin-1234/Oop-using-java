class InvalidNumberException extends Exception
{
    public String toString()
    {
        return "The number is zero or less than zero";
    }
}
class exception1
{
    public static void main(String[] args) throws InvalidNumberException
    {
        int sum=0,count=0,num;
        try
        {
            for(int i=0;i<args.length;i++)
            {
                num=Integer.parseInt(args[i]);
                if(num<=0)
                {
                    throw new InvalidNumberException();
                }
                sum+=num;
                count++;
            }
            float avg=(float)sum/count;
            System.out.println("Average="+avg);
        }
        catch(InvalidNumberException e)
        {
            System.out.println("Error:"+e);
        }
    }
}
