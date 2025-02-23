//Fibonacci Series
package ProjectClg.Day2;
import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int num = o1.nextInt();
        if(num > 0){
        System.out.println("0");
        System.out.println("1");
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=0; i < num; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        } }
        else{
            System.out.println("Unvalid Number");
        }
    }
}
