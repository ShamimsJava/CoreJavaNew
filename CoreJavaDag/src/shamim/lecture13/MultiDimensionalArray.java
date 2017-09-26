package shamim.lecture13;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        int[][] arr2 = {{5,6},{7,8}};
        
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Using Array .length attribute is Array Bound