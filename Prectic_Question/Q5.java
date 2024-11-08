/*
 * WAJP to 
 */
import java.util.Scanner;
public class Q5 {
   public static void main(String[] args) {
    int n1;
    Scanner kb= new Scanner(System.in);
    System.out.println("Eneter Any Number : ");
    n1=kb.nextInt();
    if(n1<0){
        System.out.println("Invalid Input");
        return;
    }
    int year=n1/365;
   // int yearrem=n1%365;

    int month=(n1%365)/30;
    int day = (n1%365)%30;
    //System.out.println("Mont :"+month);
    System.out.println("Year: "+year);
    System.out.println("Month :"+ month);
    System.out.println("Day :"+day);
   } 
}
