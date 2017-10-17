package Constructor;

public class ParameterizedConstructor {
    int n;
    ParameterizedConstructor(int m){
        n = m;
    }
    
    void showSq(){
        System.out.println("Square of "+n+" is: "+(n*n));
    }
    
    void showCube(){
        System.out.println("Cube of "+n+" is: "+(n*n*n));
    }
    
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
        obj.showSq();
        obj.showCube();
    }
}
