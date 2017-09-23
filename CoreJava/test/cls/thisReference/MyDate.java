package cls.thisReference;

public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public MyDate(MyDate date){
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }
    
    public MyDate addDays(int moreDays){
        MyDate newDate = new MyDate(this);
        newDate.day = newDate.day + moreDays;
        return newDate;
    }
    
    public MyDate addMonths(int moreMonths){
        MyDate newDate = new MyDate(this);
        newDate.month = newDate.month + moreMonths;
        return newDate;
    }

    @Override
    public String toString() {
        return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

   
}
