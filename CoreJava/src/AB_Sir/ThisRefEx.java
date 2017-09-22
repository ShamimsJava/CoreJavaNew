package AB_Sir;

public class ThisRefEx {

    // Instance variable, field variable, global variable
    int x;
    String y;

    public ThisRefEx() {
    }

    public ThisRefEx(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public ThisRefEx(int x) {
        this.x = x;
    }

    public ThisRefEx(String y) {
        this.y = y;
    }

    void sum(int x, int y) {
        System.out.println("The sum is: " + (x + y));
    }

    void dYY(String[] args) {
        RecRef recref = new RecRef();

        recref.doXX(this);
    }

    public static void main(String[] args) {
        ThisRefEx th = new ThisRefEx(5, "Shamim");
        RecRef recref = new RecRef();

        System.out.println(th.x + " " + th.y);
        recref.doXX(th);
    }
}

class RecRef {

    void doXX(ThisRefEx rr) {
        rr.sum(5, 10);
    }
}