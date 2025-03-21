class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            validateAge(18);
        }
        catch(CustomException e){
            System.out.println("Exception caught"+ e.getMessage());
        }
    }
    public static void validateAge(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }
}
