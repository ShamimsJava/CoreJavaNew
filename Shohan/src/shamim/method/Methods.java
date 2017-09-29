package shamim.method;

public class Methods {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    void display(){
        System.out.println("The value of x: "+x);
        System.out.println("The value of x: " + getX());
    }
    
}
