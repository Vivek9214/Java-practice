package Project.Recurtion;
//Print sum of First n Natural Numbers
public class Recurtion4 {

    public static void printSnum(int n,int x,int sum){
        if(n==x){
            sum += x;
            System.out.println(sum);
            return;
        }
        sum = sum + x;
        printSnum(n,x+1,sum);
    }
    public static void main(String[] args){
        printSnum(10, 5, 0);
    }
}
