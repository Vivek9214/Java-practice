import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
        String numstr = sc.next();
        try{
        long num = Long.parseLong(numstr);
        System.out.println(num + " can be fitted in:");
        if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE){
            System.out.println("* byte");
        }
        if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE){
            System.out.println("* short");
        }
        if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){
            System.out.println("* int");
        }
        if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE){
            System.out.println("* long");
        }
        }
        catch(Exception e){
            System.out.println(numstr + " can't be fitted anywhere.");
        }}
    }
} 
