package Class;

class SimpleBank {

    int id;
    String name;

    void display() {
        System.out.println("Student ID is: " + id + " and Student name is: " + name);
    }

    SimpleBank() {
    }

    SimpleBank(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student ID is: " + id + " and Student name is: " + name);
    }
}

public class SimpleBankApp {

    public static void main(String[] args) {
        SimpleBank sb = new SimpleBank();
        sb.id = 1233274;
        sb.name = "Shamim";
        sb.display();
        SimpleBank sbp = new SimpleBank(12, "Sarker");

        Dog dog = new Dog();
        dog.setName("Tommy");
        dog.setColor("Red");
        System.out.println("Dog name --> " + dog.getName() + ", Color --> " + dog.getColor());
        
        Dog dog2 = new Dog("Jerry", "Green");
        System.out.println("Dog name --> "+dog2.getName()+", Color --. "+dog2.getColor());
    }
}
