import java.util.*;
import java.math.BigInteger;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = new BigInteger(sc.next());
        boolean isPrime = num.isProbablePrime(10);
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
