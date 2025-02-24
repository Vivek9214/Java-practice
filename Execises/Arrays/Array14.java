import java.util.*;

public class Array14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp[] = new int[n]; // Temporary array to store unique elements
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            // Check if arr[i] is already in temp[]
            for (int j = 0; j < index; j++) {
                if (temp[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) { // If it's not found, add to temp[]
                temp[index++] = arr[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
