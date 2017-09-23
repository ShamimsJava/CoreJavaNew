/*
* Advanced Method Design Issues: Pass-by-Value
*/
package cls.passByValue;

public class PassTest {
    public static void changeInt(int value){
        value = 55; // immutable, this value cannot be changed
        System.out.println("Int value is: "+value);
    }
    
    public static int changeInt2(int value){
        return value;   // here we don't initialize value 
    }
    
    public static void main(String[] args) {
        changeInt(11); // but this value cannot pass this value
        System.out.println("Int value is: "+ changeInt2(11)); // this value can pass this value
    }
}
