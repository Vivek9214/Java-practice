public class exe11 {
    public static void main(String[] args){
        //Takeing inpute
        int num = 157; 
        //copying value to check
        int copy_num = num;
        int result = 0;
        for(int i = 0; num > 0; i++){
            //to take last value
            int temp = num%10;
            //To take power
            double p = Math.pow(8,i);
            result += (temp*p);
            //To remove last number
            num = num/10;
        }
        System.out.println("Decimal of Octal Number ( "+ copy_num+ " ) is : "+result);
    }
}