import java.util.*;
public class movie
{
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter customer age:");
            int age=sc.nextInt();
            System.out.println("1.Monday");
            System.out.println("2.tuensday");
            System.out.println("3.wednesday");
             System.out.println("4.thursdar");
            System.out.println("5.friday");
            System.out.println("6.saturday");
             System.out.println("7.sunday");
            int day=sc.nextInt();
             if(day>=1 && day<=5)
             {
                System.out.println("weekday");
                if(age<=13)
                {
                    System.out.println("ticket price:100 Rs");
                }
                else if(age>13 && age<=64)
                {
                    System.out.println("ticket price:150 Rs");
                }else
                {
                    System.out.println("ticket price:130 Rs");
                }

             }else
             {
                System.out.println("weekday");
                 if(age<=13)
                {
                    System.out.println("ticket price:120 Rs");
                }
                else if(age>13 && age<=64)
                {
                    System.out.println("ticket price:180 Rs");
                }else
                {
                    System.out.println("ticket price:150 Rs");
                }
             }

        }
}