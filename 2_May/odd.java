//print first n odd numbers
import java.util.*;
public class odd{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter end:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            if(i%2!=0)
            System.out.print(i+" ");
            i++;
        }
      
    }
}