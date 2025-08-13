import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());

        // Regex to match valid tags with same name and non-nested content
        Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");

        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
}
