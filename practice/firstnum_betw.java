import java.util.*;
public class firstnum_betw
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
        if((n1>n2 && n1<n3) || (n1<n2 && n1>n3))
        System.out.println(n1+"is betweent"+n2 +"and "+n3);
        else
        System.out.println("first number"+n1+" is not between "+n2+"and "+n3);
    }
}