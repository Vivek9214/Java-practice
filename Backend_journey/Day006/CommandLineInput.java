public class CommandLineInput {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("Please provid two integers as command line arguments. ");
            return;
        }
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.print("Sum: "+ ( num1 + num2));
        }
        catch(NumberFormatException e ){
        System.out.println("Invalid input. plase enter interger only");
        }
    }
}
