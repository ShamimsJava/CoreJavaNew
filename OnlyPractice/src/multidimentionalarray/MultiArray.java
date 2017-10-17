package multidimentionalarray;

public class MultiArray {
    public static void main(String[] args) {
        int arr[][] = {{2,3,5},{5,4,8},{6,8,7}};
        for(int i = 0; i< 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
