package cls.comparator;

import java.util.Comparator;

public class NameComp implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        return (((Student)obj1).firstName.compareTo(((Student)obj2).firstName));
    }
}
