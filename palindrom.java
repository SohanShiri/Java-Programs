import java.util.*;
public class palindrom{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Check :");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reverse "+rev);
        if(s.equals(rev))
        {
            System.out.println("This is a Palindrom ");
        }
        else{
            System.out.println("This is not a palindrom ");
        }

    }
}