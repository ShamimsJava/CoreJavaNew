package Interface;

class StudentDetails{
    int rollNo;
    String name;
    
    void getDetail(int x, String s){
        rollNo = x;
        name = s;
    }
    
    void showDetail(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name of Student: "+name);
    }
}

interface Sports{
    void getSport(String s);
    void showSport();
}

class FullInfo extends StudentDetails implements Sports{

    String sportName;
    
    @Override
    public void getSport(String s) {
        sportName = s;
    }

    @Override
    public void showSport() {
        System.out.println("Name of sport: "+sportName);
    }
    
    void viewAll(){
        showDetail();
        showSport();
    }
    
}

public class SimpleInterface {
    public static void main(String[] args) {
        FullInfo f = new FullInfo();
        f.getDetail(101, "Shamim");
        f.getSport("Badminton");
        f.viewAll();
    }
}
