package ProjectClg.Day2;
import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int a,b,result,sign;
        System.out.println("Enter a number according to sign\n \'1\' for +\n \'2\' for -\n \'3\' for *\n \'4\' for / ");
        sign = o1.nextInt();
        System.out.println("Enter two number : ");
        a= o1.nextInt();
        b= o1.nextInt();
        switch(sign){
            case 1:
            result = (a+b);
            System.out.println(result);
            break;

            case 2:
            result = (a+b);
            System.out.println(result);
            break;

            case 3:
            result = (a*b);
            System.out.println(result);
            break;

            case 4:
            result = (a/b);
            System.out.println(result);
            break;

            default:
            System.out.println("Unvalid Number");
        }
    }
}
