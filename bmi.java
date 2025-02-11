import java.util.*;
public class bmi
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height :");
        float h = sc.nextFloat();
        System.out.println("Enter the weight :");
        float w =sc.nextFloat();
        w = w/100;
        float bmi = w/(h*h);
        System.out.println("The BMI (Body Mass Index) is :"+bmi);

    }
}