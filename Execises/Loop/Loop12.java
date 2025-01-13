public class Loop12 {
    public static void main(String args[]){
        int n = 5;
        for(int i=1;i<=n; i++){
            for(int j =1; j<=n-i; j++){     //           1
                System.out.print(" ");      //          2 2
            }                               //         3 3 3
            for(int j =1; j<=i; j++){       //        4 4 4 4
                System.out.print(" "+ i);   //       5 5 5 5 5
            }                               
            System.out.println();
        }
    }
}
