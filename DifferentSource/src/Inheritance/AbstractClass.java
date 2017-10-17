package Inheritance;

abstract class Show{
    abstract void result();
    void message(){
        System.out.println("This is a simple message");
    }
}

class ShowSum extends Show{
    int a = 2;
    int b = 10;
    int c;
    
    @Override
    void result(){
        c = a+b;
        message();
        System.out.println("Sum is: "+c);
    }
}

class ShowSubtract extends Show{
    int a = 12;
    int b = 2;
    int c;
    
    @Override
    void result(){
        c = a-b;
        message();
        System.out.println("Subtraction is: "+c);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        ShowSum add = new ShowSum();
        ShowSubtract minus = new ShowSubtract();
        add.result();
        minus.result();
    }
}
