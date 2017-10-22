package modifiersDetails3;

import modifiersDetails.ClassA;

public class ClassD {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        //System.out.println(a.x); // it has default access modifier
        //System.out.println(a.y); // it has private access modifier
        //System.out.println(a.z); // it has protected access modifier
        System.out.println(a.p); // it has public access modifier
        
        // only public access modifier is accessible in universe
    }
}
