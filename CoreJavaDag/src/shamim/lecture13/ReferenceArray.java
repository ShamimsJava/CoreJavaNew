/*
 * Reference Array
 */
package shamim.lecture13;

public class ReferenceArray {

    int x;
    int y;

    public ReferenceArray() {
    }

    public ReferenceArray(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
}

class RefArr{
    public ReferenceArray[] createArray(){
        ReferenceArray[] p;
        p = new ReferenceArray[10];
        for(int i = 0; i < 10; i++){
            p[i] = new ReferenceArray(i, i+1);
        }
        return p;
    }
}

class App{
    public static void main(String[] args) {
        RefArr rf = new RefArr();
        System.out.println(rf.createArray());
    }
}
