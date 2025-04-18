import java.util.Scanner;

public class StrCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();  // First input string
        String B = sc.next();  // Second input string

        // 1. Sum of lengths
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Lexicographical comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letter of both strings
        System.out.println(capitalizeFirstWord(A) + " " + capitalizeFirstWord(B));

        sc.close();
    }

    // Helper method to capitalize first letter
    public static String capitalizeFirstWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

