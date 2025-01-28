// 1. Write a java program that accepts marks for three subjects and calculates the
// average grade. 

import java.util.*;
public Class averagegrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for subject ");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int average = (marks1 + marks2 + marks3) / 3;
        System.out.println("Average grade is " + average);

    }
}