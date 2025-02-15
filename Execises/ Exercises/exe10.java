import java.util.*;
public class exe10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		for (int i = 0; i < n; i++) {
				System.out.println(b);
				int temp = b;
				b = a + b;// b = 0+1;
				a = temp;
			sc.close();
		}
	}
}