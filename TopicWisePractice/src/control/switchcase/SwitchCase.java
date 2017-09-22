package control.switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        int num = 20;
        switch(num){
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            case 40:
                System.out.println("The number is 40");
                break;
            default:
                System.out.println("The number is not recognized");
        }
    }
}
