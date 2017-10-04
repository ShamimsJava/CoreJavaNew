package cls.list;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Shamim", Gender.MALE, new Country(100, "Bangladesh"), 30000.0);
        Person p2 = new Person(2, "Beauty", Gender.FEMALE, new Country(101, "Bangladesh"), 20000.0);
        Person p3 = new Person(3, "Shihab", Gender.MALE, new Country(102, "Bangladesh"), 80000.0);
        Person p4 = new Person(4, "Shahin", Gender.MALE, new Country(104, "UK"), 50000.0);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        System.out.println("Size: " + personList.size());

        System.out.println("ID      Name    Gender      CountryID       CountryName     Salary");
        System.out.println("-------------------------------------------------------------------");
        for (Person p : personList) {
            if (p.getGender() == Gender.MALE 
                    && p.getCountry().getCountryName() == "Bangladesh"
                    && p.getSalary() > 50000.0) {
                System.out.println(p.getId() + "      "
                        + p.getName() + "     "
                        + p.getGender() + "              "
                        + p.getCountry().getCountryId() + "       "
                        + p.getCountry().getCountryName() + "      "
                        + p.getSalary());
            }
        }
    }
}
