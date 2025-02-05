import java.util.*;
public class exe5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the Age: ");
        age= sc.nextInt();
        if(age>=18){
            System.out.print("You are Eligible");
        }
        else {
            System.out.print("You an't Eligible");
        }
        sc.close();
    }
}
