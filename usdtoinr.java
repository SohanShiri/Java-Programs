import java.util.*;
class usdtoinr{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USD :");
        double usd = sc.nextDouble();
        double inr = usd*86.56;
        System.out.println("USD in INR is :"+inr);
    }
}