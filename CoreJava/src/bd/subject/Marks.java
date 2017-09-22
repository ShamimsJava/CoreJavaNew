package bd.subject;

import java.util.Scanner;

public class Marks {

    Scanner sc = new Scanner(System.in);

    public void getMarks() {
        System.out.print("Please input you number: ");
        int mark = sc.nextInt();
        if (mark >= 80) {
            System.out.println("You got A+");
        } else if (mark >= 70) {
            System.out.println("You got A");
        } else if (mark >= 60) {
            System.out.println("You got B");
        } else {
            System.out.println("You are faild");
        }
    }

}
