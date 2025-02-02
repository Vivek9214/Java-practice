//2.	Write a function to print the sum of all odd numbers from 1 to n.
public class exe2 {
    public static void main(String[] args){
        int num1 = 5;
        int add= 0;
        for(int i =num1; i>=1; i--){
            if(num1%2!=0){
                add=add+num1; 
            }
            num1--;
        }
        System.out.print(add);
    }
}
