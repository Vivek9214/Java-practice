//Create a program to find the largest of three numbers using conditinal statement.
public class Third {
    public static int largeOfthree(int a, int b, int c){
        int d=0;
        if(a > b && a > c){
            d = a;
        }
        if(b > a && b > c){
            d = b;
        }
        if(c > a && c > b){
            d = c;
        }
        return d;
    }
    
    public static void main(String[] args) {
        int largsNum = largeOfthree(13, 44,34);
        System.out.println(largsNum);
    }
}
