public class Loop7 {
    public static void main(String[] args) {
        // 7. Pattern
        int n=5;
        for(int i=n; i>=1; i--){
            int m =1;
            for(int j=1; j<=i; j++){
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
}
