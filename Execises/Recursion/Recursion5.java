package Project.Recurtion;
//print factorial Number till n th term
public class Recurtion5 {
    public static int printfact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nml = printfact(n - 1);
        int fact_n = n * fact_nml;
        return fact_n;
    }
    public static void main(String[] args){
        System.out.println(printfact(3));
    }
}
