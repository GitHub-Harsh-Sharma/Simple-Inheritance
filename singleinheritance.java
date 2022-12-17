import java.util.*;
class Data extends Sum
{
    int a,b;
    Scanner sr=new Scanner(System.in);
    public void input()
    {
        System.out.print("Enetr the two no.: ");
        a=sr.nextInt(); 
        b=sr.nextInt();
        add(a,b);
    }
}
class Sum
{
    public void add(int a ,int b)
    {
    int sum=a+b;
    System.out.print("Sum="+sum);
    }
}
class MainClass
{
    public static void main(String arr[])
    {
        Data sm=new Data();
        sm.input();
    }
}
