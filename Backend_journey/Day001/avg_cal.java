//Use to Get Average
import java.util.Scanner;
public class avg_cal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float avg = ((float)num1 + ((float)num2 + (float)num3)) / 3;
        System.out.println("The Average of these Numbers are " + avg);
    }
}
