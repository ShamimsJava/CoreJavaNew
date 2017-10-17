package Interface;

interface GetDetail{
    void getCollegeName(String s);
    void getCollegeCode(int a);
    String city = "Dhaka";
}

interface ShowDetail extends GetDetail{
    void showCollegeName();
    void showCollegeCode();
}

class ViewDetail implements ShowDetail{

    String name;
    int code;
    
    @Override
    public void showCollegeName() {
        System.out.println("College Name is: "+ name);
    }

    @Override
    public void showCollegeCode() {
        System.out.println("College Code is: "+code);
    }

    @Override
    public void getCollegeName(String s) {
        name = s;
    }

    @Override
    public void getCollegeCode(int a) {
        code = a;
    }
    
    void showCollegeCity(){
        System.out.println("City: "+city);
    }
    
    void callAllShow(){
        showCollegeName();
        showCollegeCode();
        showCollegeCity();
    }
    
}

public class SimpleInterface2 {
    public static void main(String[] args) {
        ViewDetail v = new ViewDetail();
        v.getCollegeName("Shamim");
        v.getCollegeCode(101);
        v.callAllShow();
    }
}
