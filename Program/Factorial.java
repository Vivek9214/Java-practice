public class Factorial {
    static void FactorialCalc(int Num) {
        if(Num < 0) {
            System.out.println("Factoria is not defined for negative Number");
            return;
        }
        int temp = 1;
        for(int i = Num; i > 0; i--) {
            temp *= i;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        FactorialCalc(-5);
    }
}
