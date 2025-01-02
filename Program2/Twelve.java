package ProjectClg.Day2;
import java.util.*;
public class Twelve{
    static void Armstrong(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}