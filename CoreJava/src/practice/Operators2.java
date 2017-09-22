package practice;

public class Operators2 {
    public static final void main(String[] args){
    
        System.out.println("Java AND Operator Example: Logical && vs Bitwise &");
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a<b && a++<c); // print false, don't check 2nd condition
        System.out.println(a);
        System.out.println(a<b & a++<c); // print false, check 2nd condition
        System.out.println(a);
        
        System.out.println("Java OR Operator Example: Logical || vs Bitwise |");
        System.out.println(a>b || a++<c); // print true, don't check 2nd condition
        System.out.println(a);
        System.out.println(a>b | a++<c); // print false, check 2nd condition
        System.out.println(a);
        
        System.out.println("Java Ternary Operator Example");
        int d = (a<b)?a:b;
        System.out.println(d);
        
        System.out.println("Java Assignment Operator Example");
        int e = 10;
        int f = 20;
        e += 4;
        f -=4;
        System.out.println(e);
        System.out.println(f);
    }
}
