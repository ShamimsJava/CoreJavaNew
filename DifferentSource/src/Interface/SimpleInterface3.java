package Interface;

interface setDetail{
    void setName(String name);
    void setCode(int code);
    String city = "Dhaka";
}

interface getDetail{
    void getName();
    void getCode();
}

class DisplayDetail implements setDetail, getDetail{
    String nam;
    int cod;
    
    @Override
    public void setName(String name){
        nam = name;
    }
    
    @Override
    public void setCode(int code){
        cod = code;
    }
    
    @Override
    public void getName(){
        System.out.println("Name is: "+nam);
    }
    
    @Override
    public void getCode(){
        System.out.println("Code is: "+cod);
    }
    
    public void display(){
        getName();
        getCode();
        System.out.println("City is: "+city);
    }
}

public class SimpleInterface3 {
    public static void main(String[] args) {
        DisplayDetail d = new DisplayDetail();
        d.setName("Shamim");
        d.setCode(101);
        d.display();
    }
    
}
