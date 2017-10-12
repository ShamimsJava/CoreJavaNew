package shamim.constructorexample;

public class ConstructorExample {
    int x;
    int y;
    int z;

    public ConstructorExample() {
    }

    public ConstructorExample(int x) {
        this.x = x;
    }

    public ConstructorExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ConstructorExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
}
