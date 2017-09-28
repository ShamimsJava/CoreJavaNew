package cls.test;

public class Father {
    String name;
    double property;

    public void setName(String name) {
        this.name = name;
    }

    public void setProperty(double property) {
        this.property = property;
    }
    
    @Override
    public String toString() {
        System.out.println("==============================================");
        System.out.println("----------------Father Details----------------");
        System.out.println("==============================================");
        return "Name: "+name+"\n"
                +"Property: "+property+"\n";
    }
    
    
}
