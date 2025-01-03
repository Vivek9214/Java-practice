import java.util.*;

public class StuGradeCalc {
    static void stuGradeCalc() {
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter Number of Subject ");
        int total = 0;
        int num = o1.nextInt();
        float totalmark = num * 100;
        int[] Subject = new int[num];

        if(num <= 0) {
            System.out.print("Please Enter Number of Subjects or a valid Number");
        }
        for(int i = 0; i < num; i++) {
            System.out.print("Enter the Number : ");
            Subject[i] = o1.nextInt();
            if (Subject[i] < 0 || Subject[i] > 100) {
                System.out.println("Please Enter between 1 to 100 ");
                --i;
            }
            total += Subject[i];
        }
        // for total Percentage
        float totalvalue = total / totalmark;
        float percentage = (totalvalue * 100);
        System.out.print("Total Percentage is " + percentage);
    }

    public static void main(String[] args) {
        stuGradeCalc();
    }
}
