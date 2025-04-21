import java.util.Scanner;
import java.util.regex.*;

public class Patterchack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        
        while(testCase-- > 0){
            String pattern = sc.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}

