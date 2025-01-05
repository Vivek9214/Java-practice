import java.util.*;
//2. Number Guessing Game
public class GuessNum {
    static void GuessNum() {
        int num = (int) (Math.random() * 10);
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter the Number between 1 to 10 : ");
        int inpute = o1.nextInt();
        for (int i = 1; i < 10; i++) {
            if (inpute == num) {
                System.out.println("You guess Right Number");
                return;
            } else if (inpute > num) {
                System.out.println("Number is Too Hight ");
                inpute = o1.nextInt();
            } else if (inpute < num) {
                System.out.println("Number is Too Low ");
                inpute = o1.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        GuessNum();
    }
}
