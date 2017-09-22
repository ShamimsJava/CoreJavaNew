
package AB_Sir;

public class MultiDimensionArray {

    public static void main(String[] args) {
//        int arr[][] = new int[3][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        
//        arr[1][0] = 4;
//        arr[1][1] = 5;      // multidimension array is also known as table
//        arr[1][2] = 6;
//        
//        arr[2][0] = 7;
//        arr[2][1] = 8;
//        arr[2][2] = 9;
        
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
       
        for(int i=0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        // Different way
        
//        int a[][] = new int[3][];
//        
//        a[0] = new int[3];
//        a[1] = new int[2];
//        a[2] = new int[3];
//        
//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[0][2] = 3;
//        
//        a[1][0] = 4;
//        a[1][1] = 5;
//        
//        a[2][0] = 6;
//        a[2][1] = 7;
//        a[2][2] = 8;
        
        
        int a[][] = {{1,2,3},{4,5},{6,7,8}};
        
        
        for(int k=0; k<a.length; k++){
            for(int l=0; l<a[k].length; l++){
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
    }
}
