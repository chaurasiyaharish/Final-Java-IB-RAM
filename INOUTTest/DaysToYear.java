/*Q2 .    Write a java program to convert a given integer (in days) to years, months and
days,assumes that all months have 30 days and all years have 365 days. Test Data :
Input no. of days: 2535
Expected Output:
6 Year(s)
11 Month(s)
15 Day(s)*/
import java.util.Scanner;

class DaysToYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Input days: ");
        int totalDay = obj.nextInt();

        int year = totalDay / 365;
        int rem = totalDay % 365;
        int month = rem / 30;
        int day = rem % 30;

        System.out.println( "Total Year : " + year );
        System.out.println( "Total Month : " + month );
        System.out.println( "Total Day : " + day );
    }
}
