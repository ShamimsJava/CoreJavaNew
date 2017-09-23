package shamim.lecture11;

public class MyDate {
    
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        this.day = day;
    }
    
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public MyDate(MyDate date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }
    
    public MyDate addDays(int moreDays) {
        MyDate newDate = new MyDate(this);
        newDate.day = newDate.day + moreDays;
        return newDate;
    }
    
    @Override
    public String toString() {
        return "MyDate {" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    public static void main(String[] args) {
        MyDate md = new MyDate(1, 1, 2017);
        System.out.println(md.toString());
        System.out.println(md.addDays(15));
    }
}
