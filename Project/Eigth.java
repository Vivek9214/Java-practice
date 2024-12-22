// Create a program to find the greatest common divisor (GCD) of two number using loops.
public class Eigth {
    public static void GCD(int a, int b) {
        int i = 2;
        while (a != 0 && b != 0) {
            if (a % i == 0 && b % i == 0) {
                System.out.print("The Greated Common divisior is " + i);
            }
            i++;
            if (i > 1000) {
                System.out.print("Not a GCD ");
                return;
            }
        }
    }

    public static void main(String[] args) {
        GCD(13, 27);
    }
}
