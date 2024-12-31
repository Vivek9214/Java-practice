//Number Reverse
package ProjectClg.Day2;
public class Ten {
    public static void main(String[] args) {
        int num = 123;
        int r=0,sum = 0;
        while(num>0){
            r = num%10;
            sum = (sum*10)+ r;
            num/=10;
        }
        System.out.print(sum);
    }
}
