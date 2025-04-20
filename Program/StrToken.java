import java.util.*;
public class StrToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        // Check if input is empty
        if (str.isEmpty()) {
            System.out.println("0");
            return;
        }

        // Split using regex to get words only
        String[] words = str.split("[^A-Za-z]+");

        // Remove any empty elements and count valid words
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }

        // Print total number of words
        System.out.println(wordList.size());

        // Print each word
        for (String word : wordList) {
            System.out.println(word);
        }

        sc.close();
    }
}
