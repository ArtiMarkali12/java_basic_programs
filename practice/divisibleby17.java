import java.util.*;
public class divisibleby17
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%17==0)
        {
            System.out.println("number is divisible by 17");
        }else{
            System.out.println("number is not divisibel by 17");
        }
    }
}