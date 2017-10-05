package cls.comparator;

import java.util.Comparator;

public class GradeComp implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        if (((Student) obj1).GPA == ((Student) obj2).GPA) {
            return 0;
        } else if (((Student) obj1).GPA < ((Student) obj2).GPA) {
            return -1;
        } else {
            return 1;
        }
    }
}
