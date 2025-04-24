import java.util.*;

public class Greatescomstr{
    public static String gcdOfString(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "\"\"";
        }
        int GCDLength = gcd(str1.length(), str2.length());
        return str1.substring(0,GCDLength);
    }
    private static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "ABABCD";
        String str2 = "ABAB";
        String result = gcdOfString(str1, str2);
        System.out.println(result);
    }
}