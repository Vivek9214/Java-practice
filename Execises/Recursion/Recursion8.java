
// Tower of Hanoi
public class Recurtion8 {
    public static void towerOfHanoi(int number,String Source, String Helper,String Destination){
        if(number == 1){
            System.out.println("Transfer of Disk "+ number+ " from "+ Source + " to "+ Destination );
            return;
        }
        towerOfHanoi(number- 1, Source, Destination , Helper);
        System.out.println("Transter of Disk "+ number + " from " + Source + " to " + Destination );
        towerOfHanoi(number- 1, Helper, Source, Destination);
    }
    public static void main(String[] args){
        int n  = 3;
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
