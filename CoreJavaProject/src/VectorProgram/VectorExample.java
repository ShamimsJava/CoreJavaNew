package VectorProgram;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Shamim
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector(3);
        System.out.println("Initial capacity of vector: "+v.capacity());
        v.addElement(1);
        v.addElement('A');
        v.addElement(2.5f);
        v.addElement(45.58);
        v.addElement("Shamim");
        v.addElement(576L);
        System.out.println("Now the capacity of vector: "+v.capacity());
        System.out.println("The size of vector: "+v.size());
        System.out.println("First Element: "+v.firstElement());
        System.out.println("Last Element: "+v.lastElement());
    }
}
