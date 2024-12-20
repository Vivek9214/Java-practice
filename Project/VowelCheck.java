public class Six {
    public static void vowel(char j){
        if(j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u'){
            System.out.println("\'" +j+ "\' is a Vowel");
        }
        else{
            System.out.println("Not a vowel");
        }
    }
    public static void main(String[] args) {
        vowel('a');
    }
}
