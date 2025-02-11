import java.util.*;
class unitbill{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units Consumed :");
        int u = sc.nextInt();
        int rate = u*5;
        System.out.println("The bill is :"+rate);
    }
}