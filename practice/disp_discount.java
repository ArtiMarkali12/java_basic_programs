//write a java program to accept amount and apply discount based on amount range
import java.util.*;
public class disp_discount
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        double amt=sc.nextDouble();
        double discount_per=0;
        if(amt>5000 && amt<10000)
        {
           discount_per=0.05;
        }
        else if(amt>=10000 && amt<20000)
        {
            discount_per=0.10;
        }
        else if(amt>=20000)
        {
            discount_per=0.20;
        }
        double discount=amt*discount_per;
        double discount__amt=amt-discount;
        System.out.println("amount="+amt);
        System.out.println("discount="+discount);
        System.out.println("discount amount="+discount__amt);
    }
}