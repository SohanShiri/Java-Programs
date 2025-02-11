import java.util.*;
public class book{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of days :");
        int days=s.nextInt();
        int rate =10;
        int fine=days*rate;
        System.out.println("The fine is :"+fine);

    }
}