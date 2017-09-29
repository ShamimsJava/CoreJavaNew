package shamim.interfaceimplement;

public class App implements InterfaceExample, InterfaceExample2 {

    @Override
    public void method1() {
        int x = 10;
        int y = 20;
        int z = x+y;
        System.out.println(z);
    }

    @Override
    public void method2() {
        
    }
    
    public static void main(String[] args) {
        App obj = new App();
        obj.method1();
    }

    @Override
    public void method3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
