// Creating Array

package shamim.lecture13;

public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public char[] createArray(){
        char[] s;
        s = new char[26];
        for(int i = 0; i < 26; i++){
            s[i] = (char)('A'+i);
        }
        return s;
    }
    
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.createArray());
    }
}
