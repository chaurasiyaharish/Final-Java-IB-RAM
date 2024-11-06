/*Q1. Write a java program to print total Marks and
Percentage of the Student?
Enter Name : Harish Chaurasiya
Enter Enrollment No: 0103CS123
Enter Section : A
Enter Math Marks : 88
Enter Physics Marks : 67
Enter Chemistry Marks : 75
Enter English Marks : 87
Enter Hindi Marks : 77*/
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=obj.nextLine();
        System.out.println("Enter Enrollment : ");
        String enroll=obj.nextLine();
        System.out.println("Enter Section: ");
        char s=obj.next().charAt(0);
        System.out.println("Enter Physics Marks: ");
        int p=obj.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        int c=obj.nextInt();
        System.out.println("Enter Math Marks: ");
        int m=obj.nextInt();
        System.out.println("Enter hindi Marks: ");
        int h=obj.nextInt();
        System.out.println("Enter english Marks: ");
        int e=obj.nextInt();
        
        int total = p+c+m+h+e;
        float per=total/5.0f;
        System.out.println("========================================");
        System.out.println("Name: "+name);
        System.out.println("Enrollment: "+enroll);
        System.out.println("Section: "+s);
        System.out.println("Math Marks: "+m);
        System.out.println("Physice Mnarks: "+p);
        System.out.println("Chemistry Marks: "+c);
        System.out.println("English Marks: "+e);
        System.out.println("Hindi Marks: "+h);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);
    }
}
