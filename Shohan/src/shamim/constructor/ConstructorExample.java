package shamim.constructor;

public class ConstructorExample {
    int x;
    int y;

    public ConstructorExample() { // default constructor
        //System.out.println("Md. Shamim");
    
    }

    public ConstructorExample(int x, int y) { // parameterized constructor
        this.x=x;
        this.y=y;
        System.out.println("Md. Shohan...........");
        System.out.println("The sum is: " + (x+y));
    }
    
    void getValue(){
        int m=0;
        System.out.println(m);
    }
     
}