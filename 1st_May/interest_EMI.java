import java.util.*;
public class interest_EMI
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your loan amount");
        double loan_amt=sc.nextDouble();
        System.out.println("enter duartion(6/12 month)");
        int month=sc.nextInt();
        double interest_rate=0;
        if(month==6)
        {
            interest_rate=0.02;
        }
        else{
            interest_rate=0.03;
        }
        double total_interest=loan_amt*interest_rate;
        double EMI=(loan_amt+total_interest)/month;

        System.out.println("total interest="+total_interest+"rs");
        System.out.println("EMI"+EMI+"RS");
    }
}