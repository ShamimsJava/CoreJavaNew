package shamim.inheritence;

public class App extends Inheritence {
    int z;
    
    @Override
    public void addition(int m, int n){
        System.out.println(m+n);
        System.out.println(m*n);
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.x = 10;
    }
    
}