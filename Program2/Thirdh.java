package ProjectClg.Day2;
import java.util.*;
public class Thirdh {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int a = o1.nextInt();
        int b = o1.nextInt();
        int c = o1.nextInt();
        int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(result);
    }
}
