import java.util.*;
public class min
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        if(a<b) 
        System.out.println("first number is minimum, number= "+a);
        else
        System.out.println("second number is minimum, number="+b);
    }
}