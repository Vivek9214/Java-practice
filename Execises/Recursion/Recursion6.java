package Project.Recurtion;
//Print the fibonacci sequence til n th term
public class Recurtion6 {
    public static void printfib(int a,int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c , n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(0);
        System.out.println(1);
        int n = 7;
        printfib(a,b,n);
    }
}
