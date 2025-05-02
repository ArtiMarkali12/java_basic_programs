import java.util.*;
public class second_num_betn
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int n1=sc.nextInt();
        System.out.println("enter number 2");
        int n2=sc.nextInt();
         System.out.println("enter number 2");
        int n3=sc.nextInt();
        if((n2>n1 && n2<n3) || (n2<n1 && n2>n3))
        System.out.println(n2 +"is betweent"+ n1 +"and "+ n3 );
        else
        System.out.println("second number"+ n2 +" is not between "+ n1 +"and "+ n3);
    }
}