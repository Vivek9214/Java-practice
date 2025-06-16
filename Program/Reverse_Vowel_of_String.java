public class Reverse_Vowel_of_String {
public static String reverseVowels(String s) {
    char[] Chars = s.toCharArray();
    int left = 0, right = s.length() - 1; 
    String vowels = "aeiouAEIOU";

    while(left < right){
        while(left < right && vowels.indexOf(Chars[left]) == -1) {
            left++;
        }
        while(left < right && vowels.indexOf(Chars[right]) == -1) {
            right--;
        }
            if (left < right) {
                char temp = Chars[left];
                Chars[left] = Chars[right];
                Chars[right] = temp;

                left++;
                right--;
            }
    }
    String str = new String(Chars);
    return str;
}
    public static void main(String[] args){
        String s = "HelloWorld";
        System.out.println(reverseVowels(s));
    }
}  

