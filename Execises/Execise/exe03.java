//3.	Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class exe3 {
    public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a= sc.nextInt();
    System.out.print("Enter second number:");
    b = sc.nextInt();
    if(a>b){
    System.out.println("Greater number is: " + a);
    }
    else{
    System.out.println("Greater number is: " + b);
    }
    sc.close();
}
}