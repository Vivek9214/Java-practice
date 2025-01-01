package ProjectClg.Day2;
import java.util.*;
public class Eleven {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int num = o1.nextInt();
        int sum = 0;
        for(int i= 0; i<= num; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
