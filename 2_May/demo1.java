//write a java program to print to numbers from 1 to user specified number.

import java.util.*;
public class demo1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println("i:"+i);
            i++;
        }
    }
}