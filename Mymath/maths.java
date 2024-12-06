public class Myymath {     
    public static void mypow(double a, double b) {
        double i, j = a;
        for (i = 1; i <= b; i++) {
            if(a<0){
                System.out.print("Error: Negative number"); break;
            }
            if (i == b) {
                System.out.print(a);
                break;
            } else {
                a = j * a;
            }
        }
    }

    public static void mysqrt(double x) {
        //Please enter a valid number that have squre root
        double a = 1;
        if(x < 0){
            System.out.print("Error: Not allowed find a negative value");
        }
        while (a * a <= x) {
            if (a * a == x) {
                System.out.print(a);
                break;
            } else {
                a++;
            }
        }
    }
    
    public static void myabs(double d) {
        if (d >= 0) {
            System.out.print( d);
        } else {
            d = d * -1;
            System.out.print( d);
        }
    }
    
    public static void myfact(int a){
        int n=1;
        if(a<0){
            System.out.print("Invalid Number");
            return;
        }
        for(int i = a; i>1; i--){
            n*= i;
        }
        System.out.print(n);
    }
    
    public static void mymin(double x , double y){
        if(x>y){
            System.out.print(x);
        }
        else{
            System.out.print(y);
        }
    }
    
    public static void mymax(double x, double y){
        if(x>y){
            System.out.print(y);
        }
        else{
            System.out.print(x);
        }
    }
    public static void mycbrt(double x){
        double temp = x;
        for(int i = 0; i< 2; i++){
            if(x<0){
                System.out.print("Error: Negative number cannot be cube root"); break;
            }
            temp = temp  * x;
        }
        System.out.print(temp);
    }
    public static void mysignum(double x){
        if(x>0){
            System.out.print(1.0);
        }
        else if(x<0){
            System.out.print(-1.0);
        }
        else if(x==0){
            System.out.print(0.0);
        }
        else{
            System.out.print("NaN");
        }
    }
    public static void myceil(double x){
        int num = (int)x;
        float num2 = (float)x - (float)num;

        if(num2 > 0.00f && num2 < 0.50f){
            System.out.print(num);
        }
        else{
            System.out.print(num+1);
        }
    }
    public static void mycopySing(double x, double y){

        if(x < 0 && y < 0){
            System.out.print(x);
        }
        else if(x > 0 && y < 0 ){
            x = -x;
            System.out.print(x);
        }
        else if(x < 0 && y > 0){
            x = -1*x;
            System.out.print(x);
        }
        else if(x > 0 && y > 0){
            System.out.print(x);
        }
    }
}
