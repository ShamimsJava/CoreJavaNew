package bd.constructor;

public class ConstructorExample {
    int x;
    int y;
    int z;
    
    public ConstructorExample(){ // default constructor
        System.out.println("hello bangladesh.");
    }
    
    public ConstructorExample(int x, int y){ // parameterized constructor
        this.x = x;
        this.y = y;
        System.out.println("Hello criket team");
    }
    
    public ConstructorExample(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    void display(){
        System.out.println("Hello Younus vai.");
    }
}


// className obj = new classConstructor();