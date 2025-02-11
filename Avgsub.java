import java.util.*;
class Avgsub{
        public static void main (String args[])
        {
            Scanner sc = new Scanner(System.in);
            float m1,m2,m3,avg;
            System.out.println("Enter the three subjext marks :");
            m1 = sc.nextFloat();
            m2 = sc.nextFloat();
            m3 = sc.nextFloat();
            avg = (m1+m2+m3)/3;
            System.out.println("The average of the 3 subject is :"+avg);
            
        }
}