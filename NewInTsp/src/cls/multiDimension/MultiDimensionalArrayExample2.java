package cls.multiDimension;

/**
 *
 * @author Md. Shamim Sarker
 */
public class MultiDimensionalArrayExample2 {

    public static void main(String[] args) {

        int[][] array2D = {{3, 5}, {2, 6, 9,8},{1,1,1}, {4,2,8}};

        for (int[] array1D : array2D) {
            for (int item : array1D) {
                System.out.print("  " + item);
            }
            System.out.println();
        }
    }
}
