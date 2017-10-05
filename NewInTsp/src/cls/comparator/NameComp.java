package cls.comparator;

import java.util.Comparator;

public class NameComp implements Comparator<Student>{
    @Override
    public int compare(Student obj1, Student obj2){
        return (obj1.firstName.compareTo(obj2.firstName));
    }
}
