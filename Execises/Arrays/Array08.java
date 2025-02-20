import java.util.*;
public class Array8{
    public static void main(String[] args){
        Scanner o1 = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6}};
        int row = arr.length;
        int col = arr[0].length;
        //  row
        //c 1 2 3
        //c 4 5 6

        //1 4
        //2 5
        //3 6
        for(int i = 0; i<col; i++){
            for(int j = 0; j<row; j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
