import java.util.*;
public class guess
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int guess =9;
        System.out.println("Enter any number between 1 to 10  :");
        int num = sc.nextInt();
        if(num==guess){
            System.out.println("You guessed it Right !!!");
        }
        else {
            System.out.println("Inncorrect guess!!, The Number is :"+guess);
        }
    }
}