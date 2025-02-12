import java.util.*;
public class exe7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n,m;
        System.out.print("Enter the number you want to print: ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("Enter Number: ");
            m = sc.nextInt();
            if(m==0){
                num.add(m);
            }
            else if(m>0){
                pos.add(m);
            }
            else{
                neg.add(m);
            }
        }
        sc.close();
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Numbers: " + num);
    }
}
