import java.util.*;
public class pract
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer Age:");
        int age=sc.nextInt();
        System.out.println("1.Monday");
          System.out.println("2.Tuesday");
            System.out.println("3.Wednesday");
              System.out.println("4.Thursday");
                System.out.println("5.Friday");
                  System.out.println("6.Saturday");
                    System.out.println("7.Sunday");
                   int day=sc.nextInt();

                   if(day>=1 && day<=5)
                   {
                    System.out.println("Weekend");
                  
                   if(age<=13)
                   {
                    System.out.println("ticket price 100.RS");
                   }
                   else if(age>13 && age<=64)
                   {
                    System.out.println("ticket price 150 .RS");
                   }
                   else
                   {
                    System.out.println("ticket price 130.RS");
                   }
                   }else
                   {
                    System.out.println("weekday");
                    if(age<=13)
                   {
                    System.out.println("ticket price 120.RS");
                   }
                   else if(age>13 && age<=64)
                   {
                    System.out.println("ticket price 180 .RS");
                   }
                   else
                   {
                    System.out.println("ticket price 150.RS");
                   }
                   }

    }
}