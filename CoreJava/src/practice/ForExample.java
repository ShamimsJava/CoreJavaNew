package practice;

public class ForExample {

    public static void main(String[] args) {

        // Example of for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("The number is: " + i);
        }

        System.out.println("#####################################");
        // Example of for-each loop
        int arr[] = {12, 13, 15, 16, 18};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("#####################################");
        // Example of labeled for loop
        a:
        for (int i = 1; i <= 3; i++) {
            b:
            for (int j = 1; j <= 3; j++) {
                if (i == 3 && j == 1) {
                    break a;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("#####################################");
        a:
        for (int i = 1; i <= 3; i++) {
            b:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break b;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("#####################################");
        // infinitive for loop
        /*
        for (;;) {
            System.out.println("Md. Shamim Sarker"); // Ctrl + c to stop the infinitive for loop in cmd
        }
        */
    }
}
