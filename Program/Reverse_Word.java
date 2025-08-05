public class Reverse_Word {
    public static String Reverse_words(String s){
        String[] temps = s.trim().split("\\s+");
        int left = 0;
        int right = temps.length-1;
        while(left < right){
            String temp = temps[left];
            temps[left] = temps[right];
            temps[right] = temp;
            left++;
            right--;
        }
        String str = String.join(" ", temps);
        return str;
    }
    public static void main(String[] args){
        String str = "The Quick Brown Fox  ";
        System.out.println(Reverse_words(str));
    }
}
