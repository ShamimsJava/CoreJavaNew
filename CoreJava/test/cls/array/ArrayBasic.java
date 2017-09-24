package cls.array;

public class ArrayBasic {
    private int[] x = {4,5,6};
    private static int[] y;
    
    public static void main(String[] args) {
        y = new int[3];
        y[0] = 52;
        y[1] = 50;
        y[2] = 55;
        
        for(int i=0; i< y.length; i++){
            System.out.println(y[i]);
        }
        System.out.println("--------------------");
        for(int i : y){
            System.out.println(i);
        }
    }
   
}
