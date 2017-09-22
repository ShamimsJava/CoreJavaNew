package Class;

public class TestApp {

    public static void main(String[] args) {
        //using setter method and display method
        Test tt = new Test();
        tt.setName("Shamim");
        tt.setAge(25);
        tt.setSalary(50000);
        tt.display();

        System.out.println();

        Test tt1 = new Test();
        tt1.setName("Sohan");
        tt1.setAge(24);
        tt1.setSalary(50000);
        tt1.display();
        
        System.out.println();
        
        // using getter and setter method and without display method. 
        Test tt2 = new Test();
        tt2.setName("Firoza");
        tt2.setAge(24);
        tt2.setSalary(50000);
        System.out.println("Name is: "+tt2.getName());
        System.out.println("Name is: "+tt2.getAge());
        System.out.println("Name is: "+tt2.getSalary());
        System.out.println("Name is: "+tt2.departmentName);
        
        System.out.println();
        
        
        
                        
        
    }
}
