/*
 * Q5. Write a Java program that takes two numbers as input and displays the product of two
numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     System.out.println("Input first Number : ");
     int a = obj.nextInt();
     System.out.println("Input Secondd Number : ");
     int b = obj.nextInt();
     int c = a*b;
     System.out.println("Result is : ");
     System.out.println(a + "x" + b + " = " + c);



    }
}
