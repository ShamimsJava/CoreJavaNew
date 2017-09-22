package practice;

class Simple {
    public static void main(String[] args){
        System.out.println("Hello Java");
        
        //Java Variable Example: Add Two Numbers
        int a = 10; // java variable example 
        int b = 20;
        int c = a + b; // adding two numbers
        System.out.println("The total is: "+c);
        
        //Java Variable Example: Widening
        int d = 10;
        float f = a;
        System.out.println(d);
        System.out.println(f);
        
        //Java Variable Example: Narrowing (Typecasting)
        float e = 10.5f;
        int g = (int)f;
        System.out.println(e);
        System.out.println(g);
    }
}

/*
Valid java main method signature
--------------------------------
    public static void main(String[] args)  
    public static void main(String []args)  
    public static void main(String args[])  
    public static void main(String... args)  
    static public void main(String[] args)  
    public static final void main(String[] args)  
    final public static void main(String[] args)  
    final strictfp public static void main(String[] args)  
*/