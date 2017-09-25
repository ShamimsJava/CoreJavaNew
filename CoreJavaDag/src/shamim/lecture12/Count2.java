package shamim.lecture12;

public class Count2 {
    private int serialNumber;
    private static int counter = 0;
    
    public static int getTotalCount(){
        return counter;
    }
    
    public Count2(){
        counter++;
        serialNumber = counter;
    }
}
