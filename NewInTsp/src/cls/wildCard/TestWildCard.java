package cls.wildCard;

import java.util.List;

public class TestWildCard {
    public static void insertElements(List<? super A> list){
        list.add(new A("Shamim", 25));
        list.add(new B("Bill", 60));
        list.add(new C("Mark", 40));
    }
}
