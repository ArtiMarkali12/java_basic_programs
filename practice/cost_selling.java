public class firstnum_betw
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price");
        double cost=sc.nextDouble();
        System.out.println("enter selling price");
        double selling=sc.nextDouble();
        double profit=selling-cost;
        if(profit>0)
        {
        profitper=(profit/cost)*100;
        System.out.println("profit="+profit);
        System.out.println("profit percentage="+profitper);
        }
        else if(profit<0)
        {
            profitper=
        }

