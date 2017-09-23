package cls.thisReference;

public class App {
    int x;
    MyDate y;
    public static void main(String[] args) {
        MyDate mydate = new MyDate(23,9,2017);
        System.out.println(mydate.toString());
        System.out.println(mydate.addDays(5));
        System.out.println(mydate.addMonths(3));
    }
}
