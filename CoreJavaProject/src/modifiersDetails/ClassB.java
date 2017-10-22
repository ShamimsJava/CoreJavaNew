package modifiersDetails;

/**
 *
 * @author Shamim
 */
public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.x); // it has default access modifier
        //System.out.println(a.y); // it has private access modifier
        System.out.println(a.z); // it has protected access modifier
        System.out.println(a.p); // it has public access modifier
        
        // all are accessible in same package without private
    }
}
