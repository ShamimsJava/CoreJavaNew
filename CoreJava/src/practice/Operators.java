package practice;

public class Operators {

    static public void main(String args[]) {

        System.out.println("Java Unary Operator Example: ++ and --");
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a); // print 22
        System.out.println(b++ + b++); // print 21

        System.out.println("Java Unary Operator Example: ~ and !");
        int ab = 10;
        int bb = -10;
        boolean c = true;
        boolean d = false;

        System.out.println(~ab); //Problem //-11 (minus of total positive value which starts from 0)  
        System.out.println(~bb); //Problem //9 (positive of total minus, positive starts from 0)  
        System.out.println(!c); //false
        System.out.println(!d); // true

        System.out.println("Java Arithmetic Operator Example");
        int ba = 10;
        int bc = 5;
        System.out.println(ba + bc);//15  
        System.out.println(ba - bc);//5  
        System.out.println(ba * bc);//50  
        System.out.println(ba / bc);//2  
        System.out.println(ba % bc);//0 

        System.out.println("Java Arithmetic Operator Example: Expression");
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

        System.out.println("Java Shift Operator Example: Left Shift");
        System.out.println(10 << 2);//10*2^2=10*4=40  
        System.out.println(10 << 3);//10*2^3=10*8=80  
        System.out.println(20 << 2);//20*2^2=20*4=80  
        System.out.println(15 << 4);//15*2^4=15*16=240  

        System.out.println("Java Shift Operator Example: Right Shift");
        System.out.println(10 >> 2);//10/2^2=10/4=2  
        System.out.println(20 >> 2);//20/2^2=20/4=5  
        System.out.println(20 >> 3);//20/2^3=20/8=2  
        
        System.out.println("Java AND Operator Example: Logical && and Bitwise &");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
    }
}

/*
 There are many types of operators in java which are given below:

    Unary Operator,
    Arithmetic Operator,
    shift Operator,
    Relational Operator,
    Bitwise Operator,
    Logical Operator,
    Ternary Operator and
    Assignment Operator.
*/
