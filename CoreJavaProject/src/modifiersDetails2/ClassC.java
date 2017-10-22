package modifiersDetails2;

import modifiersDetails.ClassA;

/**
 *
 * @author Shamim
 */
public class ClassC extends ClassA{
    public static void main(String[] args) {
        ClassC c = new ClassC();
        //System.out.println(c.x); // it has default access modifier
        //System.out.println(c.y); // it has private access modifier
        System.out.println(c.z); // it has protected access modifier
        System.out.println(c.p); // it has public access modifier
        
        // Here protected and public access modifiers are accessible
    }
}
