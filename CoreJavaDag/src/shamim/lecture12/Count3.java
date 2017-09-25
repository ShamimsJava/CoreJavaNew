package shamim.lecture12;

public class Count3 {
    private int serialNumber;
    private static int counter = 0;
    
    public static int getSerialNumber(){
        //return serialNumber; // compiler error
        Count3 count3 = new Count3();
        return count3.serialNumber;
    }
}
