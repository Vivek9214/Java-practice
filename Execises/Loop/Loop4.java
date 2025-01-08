public class Loop4 {
    public static void main(String[] args){
        //     4.Pattern
        int n = 10;
        for(int i=1; i<=10; i++){
            for(int j= 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }    
    }
}
