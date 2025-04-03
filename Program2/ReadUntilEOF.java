import java.util.Scanner;

public class ReadUntilEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        
        while (scanner.hasNext()) { // Read until EOF
            String line = scanner.nextLine();
          if(line.equalsIgnoreCase("")){
            break;
          }
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        
        scanner.close();
    }
}
