import java.util.Scanner;

public class DataTypeFitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int i = 0; i < T; i++){
            try{
            String numstr = sc.next();
            Long num = Long.parseLong(numstr);
            System.out.println(num + " can be fitted in :");
            if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE){
                System.out.println("* Byte ");
            }
            if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE){
                System.out.println("* Short ");
            }
            if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){
                System.out.println("* Integer ");
            }
            if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE){
                System.out.println("* Long ");
            }
        }catch ( Exception e ){
            System.out.println(" can't be fitted anywhere.");
        }
    
        }
    }
}
