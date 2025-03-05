public class Loop3 {
    public static void main(String[] args) {
        //     3.Pattern
        int m = 1; 
        for(int i= 1; i<=5; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
    }
}
