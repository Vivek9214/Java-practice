import java.util.Scanner;
public class CheckNexttoken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text (type 'end' to finish):");

        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("end")) {
                break;
            }
            System.out.println("You entered: " + input);
        }

        System.out.println("Finished reading input.");
        sc.close();
    }
}

