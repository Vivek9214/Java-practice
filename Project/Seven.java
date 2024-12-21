package ProjectClg.Day1;
// Implement a program to find the sum of digits of a number
public class Seven {
    public static void sumOfNum(String num){
        int sum= 0;
        for(int i = 0; i< num.length();  i++){
            sum = sum + num.charAt(i) - 48;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfNum("34");
    }
}
