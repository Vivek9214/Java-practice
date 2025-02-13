import java.util.*;
public class exe8 {
    public static void main(String[] args){
        int x,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        x= sc.nextInt();
        System.out.print("Enter the Power: ");
        n = sc.nextInt();
        int m=x;
        for(int i=1; i<n; i++){
            x= x*m;
        }
        sc.close();
        System.out.print(x);
    }
}
