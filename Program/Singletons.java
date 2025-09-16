import java.util.*;
class Singleton{
    private static Singleton instance;
    private static String str;
    private Singleton(){
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public String getSingleInstance(){
        return "Hello I am a singleton! Let me say " + str + " to you";
    }
}
public class Singletons{ 
    public static void main(String[] args){
        Singleton sin = Singleton.getInstance();
        System.out.println(sin.getSingleInstance());
    }
}