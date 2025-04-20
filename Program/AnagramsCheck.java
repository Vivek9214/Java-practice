import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {
    static boolean isAnagram(String a , String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
