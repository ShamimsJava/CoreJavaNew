package loopingProgram;

/**
 *
 * @author Shamim
 */
public class LabelledLoopExample {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 3; i++) {
            innerLoop:
            for (int j = 0; j < 3; j++) {
                if(i==1 && j==1){
                    System.out.println("Continue executes for outer loop at i = 5 & j = 5");
                    break outerLoop;
                    //continue outerLoop;
                }
                System.out.println("Value of i: "+i+" and value of j: "+j);
            }
        }
    }
}
