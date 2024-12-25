package ProjectClg.Day2;
import java.util.*;
public class Fourt{
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int value = o1.nextInt();
        String result = (value % 2 == 0) ? "This is even" : "This is Odd";
        System.out.println(result);
    }
}
