package Class;

public class Animal {

    public static void main(String[] args) {
        
        Cow c = new Cow();
        c.setId(1001);
        c.setName("Kalu");
        c.setColor("Red");
        c.setHeight(3.5);
        c.display();
        
        System.out.println();
        
        c.setId(1002);
        c.setName("Malu");
        c.setColor("Green");
        c.setHeight(3.6);
        c.display();
        
        System.out.println();
        
        Cow cp = new Cow(1003, "Talu", "Violet", 3.5);
        cp.display();
        
        System.out.println();
    }
}
