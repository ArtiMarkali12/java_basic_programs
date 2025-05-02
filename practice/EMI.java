import java.util.*;
public class EMI{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter loan amount");
        double loan=sc.nextDouble();
        System.out.println("enter duration(6/12)months");
        int month=sc.nextInt();
        double interest_rate=0;
        if(month==6)
        {
            interest_rate=0.02;
        }else{
            interest_rate=0.03;
        }
        double total_interest=loan*interest_rate;
        double EMI=(loan*total_interest)/month;
        System.out.println("total_interest="+total_interest);
        System.out.println("EMI="+EMI);


    }
}