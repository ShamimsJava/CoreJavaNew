package cls.privateExample;

public class Firoza {
    private int taka = 100000;
    
    public int getTaka(){
        return taka;
    }
    
    private int getTaka2(){
        return taka;
    }
}

class Shamim{
    public static void main(String[] args) {
        Firoza f = new Firoza();
        System.out.println("Your owner Firoza has "+f.getTaka()+" taka");
    }
}
