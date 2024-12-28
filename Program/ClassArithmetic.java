// Create a menu-driven program to perform basic arithmetic operations(+ , - , * , /)
public class Fifth {
    public static int add(int a, int b){
        return (a+b);
    }
    public static int sub(int a, int b){
        return (a-b);
    }
    public static int mul(int a, int b){
        return (a*b);
    }
    public static int div(int a,int b){
        return (a/b);
    }

    public static void main(String[] args){
        int add,sub,mul,div;
        add = add(2,4);
        sub = sub(2,4);
        mul = mul(2,4);
        div = div(2,4);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
