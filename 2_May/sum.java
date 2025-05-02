//Accept n numbers from user and display sum of numbers upto n
import java.util.*;
public class sum{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number n:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
           sum+=i;
           i++;
        
        }
        System.out.println("sum="+sum);
      
    }
}