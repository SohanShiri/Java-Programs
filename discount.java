import java.util.*;
class discount{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price of the product :");
        float price = sc.nextFloat();
        System.out.println("Enter the discount persentage:");
        float discount = sc.nextFloat();
        float disprice = (discount/100)*price;
        System.out.println("The discount price is :"+disprice);
        float selling = price -disprice;
        System.out.println("Payable price  :"+selling);
    }
}