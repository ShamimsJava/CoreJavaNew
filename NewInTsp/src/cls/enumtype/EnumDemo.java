package cls.enumtype;

public class EnumDemo {
    public static void main(String[] args) {
        Person person = new Person("Urmi", 21, Gender.FEMALE);
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Gender: "+person.getGender());
    }
}
