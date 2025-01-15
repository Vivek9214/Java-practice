// Wap to print substring 
import java.util.*;
public class Loop15 {
    public static void main(String[] args){
        String str;
        Scanner o1 = new Scanner(System.in);
        str = o1.nextLine();
        //to print a, ab, abc, abcd,      
        //         b, bc, bcd
        //         c, cd, 
        //         d
        for(int i=0; i<=str.length(); i++){
            for(int j= i+1; j<=str.length(); j++){
                System.out.print(str.substring(i,j)+", ");
            }
            System.out.println();
        }
        o1.close();
    }
}
