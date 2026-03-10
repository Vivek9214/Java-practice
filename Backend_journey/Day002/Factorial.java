public class Factorial {
    public static void main(String[] args){
        int num = 5;
        int temp = 1;
        for(int i = 1; i <= num; i++){
            temp *= i;
        }
        System.out.println(temp);
    }
}
