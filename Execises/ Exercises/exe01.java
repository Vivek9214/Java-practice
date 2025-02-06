//1.	Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class exe1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1, num2 , num3; 
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
        double avg =((num1 + num2 + num3) / 3.0);
        System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avg);
        sc.close();
    }
}
