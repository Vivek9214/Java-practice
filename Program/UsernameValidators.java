import java.util.*;

public class UsernameValidators{
    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        while (n-- != 0) {
            String userName = in.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
