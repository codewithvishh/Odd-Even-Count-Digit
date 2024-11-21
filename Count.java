class Count
{
    int c;
    public void countDigits(int number)
    {
        while(number!=0)
        {
            number/=10;
            c++;
        }
        System.out.println("Number of digits = "+c);
    }
    public void isOdd(int count)
    {
        if(count%2==0)
        {
            System.out.println("The number contains an even number of digits.");
        }
        else
        {
            System.out.println("The number contains an odd number of digits.");
        }
    }
    public static void main(String args[])
    {
        Count c1=new Count();
        c1.c=0;
        c1.countDigits(749);
        c1.isOdd(c1.c);
    }
}
