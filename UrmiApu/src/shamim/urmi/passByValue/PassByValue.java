package shamim.urmi.passByValue;

public class PassByValue {
    int x = 30;
    int y = 20;

    public PassByValue(int x) {
        this.x = x;
    }
    
}

class App{
    public static void main(String[] args) {
        PassByValue pv = new PassByValue(10);
        System.out.println("The value of x is: "+pv.x);
        System.out.println("The value of y is: "+pv.y);
    }
}