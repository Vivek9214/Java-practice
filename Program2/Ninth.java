//Prime Number Check
package ProjectClg.Day2;
import java.util.*;
public class Ninth {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int num = o1.nextInt();
        int count = 0;
        for(int i =2; i<=num; i++){
            if(num % i == 0){
               count++;
            }
        }
        if(count == 1){
            System.out.println(num+ " is a Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
