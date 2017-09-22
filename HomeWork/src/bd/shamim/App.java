package bd.shamim;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee("Shamim", new Address(12, 13, 15, "Aditmari", "Lalmonirhat", new AddressType("Present")));
        
        System.out.println("Employee name: "+emp.getEmpName());
        System.out.println("Employee house no #"+emp.getEmpAdd().getHouseNo());
        System.out.println("Employee block no #"+emp.getEmpAdd().getBlockNo());
        System.out.println("Employee road no #"+emp.getEmpAdd().getRoadNo());
        System.out.println("Employee thana : "+emp.getEmpAdd().getThana());
        System.out.println("Employee district : "+emp.getEmpAdd().getDistrict());
        System.out.println("Address type : "+emp.getEmpAdd().getAddType().getAddType());
    }
}
