package Class;

public class Cow {

    int id;
    String name, color;
    double height;

    public Cow() {
    }

    public Cow(int id, String name, String color, double height) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    void display(){
        System.out.println("Cow ID --> "+id);
        System.out.println("Cow name --> "+name);
        System.out.println("Cow color --> "+color);
        System.out.println("Cow height --> "+height);
    }
}
