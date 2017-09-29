package shamim.Abstract;

public abstract class Vehicle {
    int x;
    String y;
    public void a(){}
    public abstract void b();

    public Vehicle(int x, String y) {
        this.x = x;
        this.y = y;
    }
    
}

abstract class Vehicle2 extends Vehicle{

    public Vehicle2(int x, String y) {
        super(x, y);
    }
    @Override
    public abstract void b();
    @Override
    public void a(){}
}

class Vehicle3 extends Vehicle{

    public Vehicle3(int x, String y) {
        super(x, y);
    }

    @Override
    public void b() {
        
    }

}