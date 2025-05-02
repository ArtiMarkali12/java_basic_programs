import java.util.*;
public class leap_year
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("given year is leap year");
        }else{
            System.out.println("it is not leap year");
        }
    }
}