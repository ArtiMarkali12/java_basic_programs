//Accept two numbers n and m from user and print sum between two numbers.
import java.util.*;
public class print_sum{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number n:");
        int n=sc.nextInt();
         System.out.print("enter number m:");
        int m=sc.nextInt();
       
        int sum=0;
        while(n<=m)
        {
           sum+=n;
           n++;
        
        }
        System.out.println("sum="+sum);
      
    }
}