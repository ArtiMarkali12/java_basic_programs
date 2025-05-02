//print first n even numbers
import java.util.*;
public class even{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter end:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
            System.out.print(i+",");
            i++;
        }
        System.out.print("\b");
    }
}