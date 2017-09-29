package shamim.Interafce;

public interface Shihab {
    int X = 10;
}

interface Sarker extends Shihab{

}
class Sharar implements Shihab{
    Shihab z;
    public static void main(String[] args) {
        int y = Sharar.X;
        System.out.println("The value of x: "+y);
    }
}

class Shamim extends Sharar implements Shihab, Sarker{

}