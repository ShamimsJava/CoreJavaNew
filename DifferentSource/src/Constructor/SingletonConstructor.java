package Constructor;

public class SingletonConstructor {
    private static SingletonConstructor instance=null;
    
    private SingletonConstructor(){
    
    }
    
    public static SingletonConstructor createObject(){
        if(instance==null){
            instance = new SingletonConstructor();
        }
        return instance;
    }
    
    public void mgs(){
        System.out.println("Singleton Example");
    }
    
    public static void main(String[] args) {
        SingletonConstructor obj = SingletonConstructor.createObject();
        obj.mgs();
    }
}
