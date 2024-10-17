/*
 Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Input First Number : ");
    int a = obj.nextInt();
    System.out.println("Input Second Number : ");
    int b = obj.nextInt();
    System.out.println("Result is : ");
    System.out.println(a + " + " + b + " = " + (a+b));
    System.out.println(a + " - " + b + " = " + (a-b));
    System.out.println(a + " x " + b + " = " + (a*b));
    System.out.println(a + " / " + b + " = " + (a/b));
    System.out.println(a + " % " + b + " = " + (a%b));
    }
}
