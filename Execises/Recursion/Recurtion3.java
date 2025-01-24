package Project.Recurtion;
//print n natural numbers
public class Recurtion3 {
    public static void printNnum(int n, int x){
        if(x == n){
            return;
        }
        System.out.println(x);

        printNnum(n,x+1);
    }
    public static void main(String args[]){
        printNnum(11,1);
    }
}
