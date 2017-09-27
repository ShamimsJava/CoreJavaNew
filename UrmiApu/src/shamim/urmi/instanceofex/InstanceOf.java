package shamim.urmi.instanceofex;

public class InstanceOf {
    InstanceOf x;
    Integer y=20;
    
    public static void main(String[] args) {
        InstanceOf io = new InstanceOf();
        if(io.x instanceof InstanceOf){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}