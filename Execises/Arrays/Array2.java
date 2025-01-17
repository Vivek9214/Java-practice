import java.util.*;
public class Array2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number you want to Enter: ");
		int num = sc.nextInt();
		String Name[] = new String[num];
		for (int i = 0; i < num; i++) {
			Name[i] = sc.next();
		}
		System.out.println();
		for (int i = 0; i < num; i++) {

			System.out.println(Name[i]);
		}
		sc.close();
	}
}