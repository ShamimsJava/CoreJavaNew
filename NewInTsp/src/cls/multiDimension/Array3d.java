package cls.multiDimension;

public class Array3d {
    public static void main(String[] args) {
        int[][][] array3D = {{{3, 5}, {2, 6, 9,8},{1,1,1}, {4,2,8}},
                            {{3, 5}, {2, 6, 9,8},{1,1,1}, {4,2,8}},
                            {{3, 5}, {2, 6, 9,8},{1,1,1}, {4,2,8}}};
        for( int[][] array2D : array3D){
            for(int [] array1D : array2D){
                for( int item : array1D){
                    System.out.print(" "+item);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
