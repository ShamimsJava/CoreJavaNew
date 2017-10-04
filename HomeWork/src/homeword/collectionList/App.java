package homeword.collectionList;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Student st1 = new Student(101, "Shamim", Gender.MALE, new Location(5006, "Lalmonirhat"));
        Student st2 = new Student(102, "Upoma", Gender.FEMALE, new Location(5007, "Lalmonirhat"));
        Student st3 = new Student(103, "Kotha", Gender.FEMALE, new Location(5008, "Gaibandha"));
        Student st4 = new Student(104, "Bijor", Gender.FEMALE, new Location(5009, "Lalmonirhat"));
        Student st5 = new Student(105, "Toony", Gender.FEMALE, new Location(5010, "Rangpur"));

        List<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);

        System.out.println("\n\n\n\n\n");
        System.out.println("********************Student Information*********************");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("StId       StName     Gender      PostCode       District");
        System.out.println("------------------------------------------------------------");

        for (Student s : stList) {
            if (s.getGender() == Gender.FEMALE) {
                System.out.println(s.getStudentId() + "         "
                        + s.getStudentName() + "     "
                        + s.getGender() + "        "
                        + s.getLocation().getPostCode() + "        "
                        + s.getLocation().getDistrictName());
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Total record is: " + stList.size());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n\n\n\n\n");
    }
}
