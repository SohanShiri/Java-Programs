import java.util.*;
class simpleintrest{
public static void main (String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Principal amount:");
    float principal = sc.nextFloat();
    System.out.println("Enter the Rate of intrest :");
    float intrest = sc.nextFloat();
    System.out.println("Enter the time period :");
    float time = sc.nextFloat();
    float simple_intrest=(principal * intrest * time)/100;
    System.out.println("The simple intrest is  :"+simple_intrest);
}
}