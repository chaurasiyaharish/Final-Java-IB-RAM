import java.util.Scanner;
class Q1{
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    int n1, n2;
    System.out.println("Enter Numer 1 : ");
    n1=k.nextInt();
    System.out.println("Enter Numer 2 : ");
    n2=k.nextInt();

    //if(n1>n2)
    if(n1>=n2){
        System.out.println("Number 1 is greater ");
        System.out.println("this is if 1");
    }
    if(n1<n2){
        System.out.println("Number 2 is greater ");
        System.out.println("this is if 2");
    }
    if(n1==n2){
        System.out.println("both are equal ");
        System.out.println("this is if 3");
    }

  }
}