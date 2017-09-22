package bd.switchExample;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 20;
        switch(number){
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("Cannot recognize");
        }
    }
}
