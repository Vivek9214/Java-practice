import java.util.regex.*;
import java.util.*;
public class MyRegex {
class MyRegex {
    String pattern = 
        "^(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
      + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
      + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
      + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})$";
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(myRegex.pattern));
        }
    }
}
}
