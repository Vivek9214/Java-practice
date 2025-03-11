public class Loop8 {
    public static void main(String[] args) {
            // 8.Pattern
        int m=1;
        int n=1;        
        for(int i=1; i<=5; i++){
            for(int k=1; k<=n; k++){
                System.out.print(" " + m + " ");
                m++;
            }
            n++;
            System.out.println();
        }
    }
}
