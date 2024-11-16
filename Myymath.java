import java.util.*;
public class Myymath {
         
    public void mypow(double a, double b) {
        double i, j = a;
        for (i = 1; i <= b; i++) {
            if (i == b) {
                System.out.println("The power of "+j+" is "+a);
                break;
            } else {
                a = j * a;
            }
        }
    }
