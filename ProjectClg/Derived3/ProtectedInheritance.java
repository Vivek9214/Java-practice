class Num {
    protected int x,y;//Proctected Members
    Num ( int a, int b)
    {
        x = a;
        y = b;
    }
    public void showXY()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y );
    }
}
class Result extends Num
    {
        private int z;
        Result(int a, int b)
        {
            super(a,b);
        }
        public void add()
        {
            z = x + y;
        }
        public void showZ()
        {
            System.out.println("z = " + z);
        }
    } 
public class ProtectedInheritance{
    public static void main(String[] args) {
        Result d = new Result(5,6);
        d. showXY();
        d.add();
        d.showZ();
    }
    }
