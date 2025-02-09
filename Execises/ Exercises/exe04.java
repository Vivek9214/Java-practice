//4.	Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class exe4 {
    public static void main(String[] args) {
        int radius;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();
        float circumference = 2 * (float)pi * radius;
        System.out.println("The circumference of the circle is: " + circumference);
        sc.close();
    }
}
