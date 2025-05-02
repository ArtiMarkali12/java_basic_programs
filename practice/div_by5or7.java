import java.util.*;
public class div_by5or7
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%5==0 || n%7==0)
        {
            System.out.println("number is divisible by 5 or 7");
        }else{
            System.out.println("number is not divisibel by 5 or 7");
        }
    }
}