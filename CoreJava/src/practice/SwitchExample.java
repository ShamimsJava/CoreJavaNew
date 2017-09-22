package practice;

public class SwitchExample {

    public static void main(String[] args) {
        int a = 20;
        switch (a) {
            case 10:
                System.out.println("This is 10.");
                break;
            case 20:
                System.out.println("This is 20.");
                break;
            case 30:
                System.out.println("This is 30.");
                break;
            default:
                System.out.println("This is not 10, 20, 30");
        }
        
        System.out.println("/////////////////////////////////////////////////////");
        switch (a) {
            case 10:
                System.out.println("This is 10.");
            case 20:
                System.out.println("This is 20.");
            case 30:
                System.out.println("This is 30.");
            default:
                System.out.println("This is not 10, 20, 30");
        }
    }
}
