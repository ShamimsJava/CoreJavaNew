package shamim.urmi.ConstructorOverloading;

public class ConsOver {
    int x;
    int y;
    int z;

    public ConsOver() {
    }

    public ConsOver(int x) {
        this.x = x;
    }

    public ConsOver(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    int sum1(int x, int y){
        return x*y;
    }
    
}
