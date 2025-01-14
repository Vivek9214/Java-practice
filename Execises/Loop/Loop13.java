public class Loop13{
    public static void main(String[] args){
        int n =4; 
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");     //    1
            }                              //   212
            for(int j =i;j>=1; j--){       //  32123
                    System.out.print(j);   // 4321234
            }
            for(int j =2; j<=i; j++){
                System.out.print(j);
            } 
            System.out.println();
        }
    }
}