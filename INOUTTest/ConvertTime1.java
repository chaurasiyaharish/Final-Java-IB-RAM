package INOUTTest;
/* Q1. Write a Java program to convert a given integer (in seconds) to hours, minutes
andseconds.
Test Data :
Input seconds: 25300
Expected Output:
There are:
H:M:S - 7:1:40

*/
import java.util.Scanner;

class ConvertTime1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = obj.nextInt();

        int hour = totalSeconds / 3600;
        int rem = totalSeconds % 3600;
        int minute = rem / 60;
        int second = rem % 60;

        System.out.println("Result :");
        System.out.println("H:M:S  = "+hour+":"+minute+":"+second);
        // System.out.println("Total hours : " + hour);
        // System.out.println("Total minutes : " + minute);
        // System.out.println("Total Second : " + second);
    }
}
