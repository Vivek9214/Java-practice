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
