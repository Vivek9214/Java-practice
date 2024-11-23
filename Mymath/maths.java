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
}
