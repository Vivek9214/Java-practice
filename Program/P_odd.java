// Write a program to print all odd numbers beetween 1 and 100 using a loop.
public class Forth {
    public static void p_odd(int i, int j){
        for(int p =i; p<=j; p++){
            if(p % 2 != 0){
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        p_odd(1,100);
    }
}
