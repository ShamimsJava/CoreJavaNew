package sh.question33;

class Super{
    public Integer getLenght(){
        return new Integer(4);
    }
}

public class Sub extends Super {
    public Long GetLength(){
        return new Long(5);
    }
    public static void main(String[] args) {
        Super sooper = new Super();
        Sub sub = new Sub();
        System.out.println(
                sooper.getLenght().toString()+","
        );
    }
}
