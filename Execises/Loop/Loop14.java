public class Loop14 {
    public static void main(String[] args){
        String Name = "Tony";
        String Last = "Stark";
        String FullName=  Name+" "+ Last;
        System.out.println("Full Name : "+ FullName);
        for(int i=0; i<FullName.length(); i++){
            System.out.print(FullName.charAt(i)+ " ");  
        }
    }
}
