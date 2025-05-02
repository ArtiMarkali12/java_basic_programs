//Accept n numbers from user and display sum of odd numbers upto n
import java.util.*;
public class sum_odd{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number n:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(i%2!=0)
           sum+=i;
           i++;
        
        }
        System.out.println("sum of odd="+sum);
      
    }
}