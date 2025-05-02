//Accept basic salary and calculate tax based on given tax brackets
import java.util.*;
public class cal_tax
{
      public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary");
        double sal=sc.nextDouble();
        double tax=0;
        if(sal<=200000)
        tax=0;
        else if(sal<=500000)
        {
            tax=(sal-20000)*0.05;
        }
          else if(sal<=1000000)
        {
            tax=(250000*0.05)+(sal-50000);
        }
        System.out.println("Income Tax="+tax);

}
}