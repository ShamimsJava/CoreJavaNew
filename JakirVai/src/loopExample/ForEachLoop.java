// Enhanced for loop
package loopExample;

/**
 *
 * @author Shamim
 */
public class ForEachLoop {
    public static void main(String[] args) {
        int[] a = {51,25,48,79,63,65,54};
//        for(int i=0; i<=6; i++){
//            System.out.println(a[i]);
//        }
        
        for(int x : a){
            System.out.println(x);
        }
    }
}
