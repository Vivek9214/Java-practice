//Give tweo matrices of same size, print their sum 
import java.util.*;
public class Array7 {
    public static void main(String[] args){
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = o1.nextInt();
        System.out.print("Enter Column : ");
        int column = o1.nextInt();
        int[][] arr = new int[row][column];
        int[][] arr2 = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr[i][j] = o1.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr2[i][j] = o1.nextInt();
            }
        }

        System.out.print("The output is : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j]+arr2[i][j]);
            }
        }
    }
}
