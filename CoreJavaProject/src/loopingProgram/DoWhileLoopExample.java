package loopingProgram;

/**
 *
 * @author Shamim
 */
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("Square of "+i+" is "+i*i);
            i++;
        }while(i<10);
    }
}
