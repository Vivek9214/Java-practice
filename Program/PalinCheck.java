import java.util.*;

//3. Palindrome Checker
public class PalinCheck {
    static void palincheck(int n) {
        int r;
        int sum = 0, temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("This is Palindrome");
        }
    }

    static void palincheck(String value) {
        boolean ans = true;
        int start = 0, end = (value.length() - 1);
        while (start < end) {
            // Ignore non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(value.charAt(start))) { // if value hava space than skip it
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(value.charAt(end))) {
                end--;
            }
            // Compare characters in a case-insensitive manner
            if (Character.toLowerCase(value.charAt(start)) == Character.toLowerCase(value.charAt(end))) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            start++;
            end--;
        }
        if (ans == true) {
            System.out.println(value + " is a Palindrome");
        } else {
            System.out.println(value + " is a not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        // int value = o1.nextInt();
        String value = o1.nextLine();
        palincheck(value);
    }
}
