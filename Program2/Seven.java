// Print a Table
package ProjectClg.Day2;
import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int num = o1.nextInt();
        for(int i= 1; i<=10; i++){
            System.out.println( num + " * "+ i +" = "+ (num*i));
        }
    }
}
