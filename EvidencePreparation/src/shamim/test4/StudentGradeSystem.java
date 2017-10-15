package shamim.test4;

import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Written Mark");
        int written = s.nextInt();
        System.out.println("Enter Evidence Mark");
        int evidence = s.nextInt();
        int totalMarks = written + evidence;

        if (written >= 70 && evidence >= 30) {
            if (written > 100 || evidence > 50) {
                System.out.println("You cannot input over 100 and 50 respective");
            } else {
                System.out.println("You Marks is " + totalMarks + " And you are Passed");
            }
        } else {
            System.out.println("Your Marks is " + totalMarks + " and you are failed");
        }

        String grade = "";
        if (totalMarks >= 140 && totalMarks <= 150) {
            grade = "A+";
        } else if (totalMarks >= 130 && totalMarks <= 139) {
            grade = "A";
        }else if(totalMarks >= 120 && totalMarks <=129){
            grade = "B+";
        }else if(totalMarks >= 100 && totalMarks <=119){
            grade = "B";
        }else{
            grade = "F";
        }
        System.out.println("Your grade is "+grade);
    }
}
