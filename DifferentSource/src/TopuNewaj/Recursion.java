package TopuNewaj;

public class Recursion {
    public int myFunction(int i){
        if(i<4)
            return i + myFunction(++i) + myFunction(++i);
        return i;
    }
    
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.myFunction(0));
    }
}
