package shamim.urmi.array;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        
        for(int i:a){
            System.out.println("The value is: "+i);
        }
        
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
