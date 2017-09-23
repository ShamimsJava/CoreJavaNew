package cls.ifElse;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your id: ");
        int result = sc.nextInt();
        switch(result){
            case 1238082:
                System.out.println("Your name is Firoza");
                System.out.println("Your written result is 79 out of 100");
                System.out.println("Your evidence result is 45");
                break;
            case 1233274:
                System.out.println("Your name Shamim");
                System.out.println("Your written result is 83 out of 100");
                System.out.println("Your evidence result is 48");
                break;
            default:
                System.out.println("This ID is not available here.");
        }
    }
}
