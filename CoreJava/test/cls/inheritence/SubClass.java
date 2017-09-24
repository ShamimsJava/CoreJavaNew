package cls.inheritence;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        System.out.println(sc.x);
    }
    @Override
     int sum(int x, int y){
       return x+y; 
    }
}
