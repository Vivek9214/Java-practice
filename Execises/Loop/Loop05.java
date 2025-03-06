public class Loop5 {
    public static void main(String[] args) {
        //     5.Pattern
        int n = 4; 
        int m = 1;
        for(int i=1; i<=n; i++){
            for(int j = i; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=m; k++){
                System.out.print("*");
            }

            m++;
            System.out.println();
        }
    }
}
