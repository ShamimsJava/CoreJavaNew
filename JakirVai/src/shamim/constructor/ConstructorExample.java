package shamim.constructor;

public class ConstructorExample {
    int x;
    int y;
    int z;
    static int m;
    static int n;

    public ConstructorExample() { // default constructor
    }

    public ConstructorExample(int x, int y, int z) { // parameterized constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }  
}