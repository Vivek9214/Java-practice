import java.util.Scanner;

public class GreatCom {
    public static String gcdOfStrings(String str1, String str2) {
        // If str1 + str2 equals str2 + str1, then they have a common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to find GCD of two numbers
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }
}
