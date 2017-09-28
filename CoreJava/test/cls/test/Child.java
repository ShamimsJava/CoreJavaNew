package cls.test;

public class Child extends Father {
    double age;

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProperty(double property) {
        this.property = property;
    }
    
    void expend(double amount){
        property -= amount;
    }
    
    void income(double amount){
        property += amount;
    }
    
    @Override
    public String toString() {
        System.out.println("==============================================");
        System.out.println("----------------Child Details-----------------");
        System.out.println("==============================================");
        return "Name: " + name+"\n"
                + "Present Property: "+property+"\n"
                + "Age: "+ age+"\n";
    }
    
}
