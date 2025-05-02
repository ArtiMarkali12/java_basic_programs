//print welcome message n times
import java.util.*;
public class welcome{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter limit:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print("welcome ");
            i++;
        }
      
    }
}