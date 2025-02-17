public class Array1 {
    public static void main(String[] args){
        char[] s1 = {'H', 'e', 'l', 'l', 'o'};
        char[] s2 = new char[s1.length];
        for(int i=s1.length -1; i>=0; i--){
            s2[s1.length -1 - i] = s1[i];
        }
        System.out.println(s2);
    }
}
