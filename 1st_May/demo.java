//Accept basic salary and calculate tax based on given tax brackets

import java.util.*;
public class demo
{
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your basic salary(LPA)");
            double basic_salary=sc.nextDouble();
            if(basic_salary<700000)
            {
                System.out.println("No Tax");

            }
            else if(basic_salary>700000 && basic_salary<1000000)
            {
                double tax=basic_salary*0.1;
                System.out.println("tax="+tax);
            }
             else if(basic_salary>1000000 && basic_salary<1200000)
            {
                double tax=basic_salary*0.2;
                System.out.println("tax="+tax);
            }
             else
            {
                double tax=basic_salary*0.3;
                System.out.println("tax="+tax);
            }
        }
}