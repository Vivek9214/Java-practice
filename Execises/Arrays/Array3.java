import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column : ");
        int column = sc.nextInt();
        int[][] num = new int[row][column];
        for(int i=0; i<row; i++){
           for(int j=0; j<column; j++){
            num[i][j] = sc.nextInt();
           }
        }
        for(int i= 0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        // Search for a number in the array
        System.out.print("Enter the number you want to search : ");
        int x= sc.nextInt();
        //boolean for if result function is found it will return false
        boolean found = false;
        //searching for the number in the array
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(num[i][j] == x){
                    System.out.print("The Location of x is : Row "+(i+1)+" Column "+ (j+1));
                    found = true;
                }

            }                
        }
        //if the number is not found
            if(!found){
                System.out.print("The Location of x is : Not Found");
            }
        sc.close();
    }
}
