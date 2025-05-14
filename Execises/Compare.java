import java.util.regex.*;
public class Compare {
    public static void main(String[] args){
        Pattern patterns = Pattern.compile("a");
        Matcher matcher = patterns.matcher("a");
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}