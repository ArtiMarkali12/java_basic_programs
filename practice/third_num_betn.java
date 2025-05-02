import java.util.*;
public class third_num_betn
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int n1=sc.nextInt();
        System.out.println("enter number 2");
        int n2=sc.nextInt();
         System.out.println("enter number 3");
        int n3=sc.nextInt();
        if((n3>n1 && n3<n2) || (n3<n1 && n3>n2))
        System.out.println(n3 +"is betweent"+ n1 +"and "+ n2 );
        else
        System.out.println("third number"+ n3 +" is not between "+ n1 +"and "+ n2);
    }
}