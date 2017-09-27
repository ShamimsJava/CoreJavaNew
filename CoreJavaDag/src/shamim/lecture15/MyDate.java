package shamim.lecture15;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if((obj != null) && (obj instanceof MyDate)){
            MyDate d = (MyDate) obj;
            
            if((day == d.day) && (month == d.month) && (year == d.year)){
            result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.day;
        hash = 97 * hash + this.month;
        hash = 97 * hash + this.year;
        return hash;
    }
}
