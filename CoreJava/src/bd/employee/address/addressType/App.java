package bd.employee.address.addressType;

public class App {

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Shamim", new Address("Aditmari", "Lalmonirhat", new AddressType("Parmanent")));
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Thana: " + emp.getAddress().getThana());
        System.out.println("Employee District: " + emp.getAddress().getDistrict());
        System.out.println("Employee Address Type: " + emp.getAddress().getAddType().getAddType());
    }
}
