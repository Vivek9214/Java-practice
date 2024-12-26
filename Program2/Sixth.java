package ProjectClg.Day2;
public class Sixth {
    public static void main(String[] args) {
        int r;
        int sum =0, n = 545, temp=n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+ r;
            n= n/10;
        }
        if(sum == temp){
        System.out.println("This is Palindrome");
        }
    }
}
