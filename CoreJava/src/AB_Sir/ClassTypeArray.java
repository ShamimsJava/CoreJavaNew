package AB_Sir;

class Account {

    int a;
    String b;

    public Account(int a, String b) {
        this.a = a;
        this.b = b;
    }
    
    public void showData(){
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}

public class ClassTypeArray {

    public static void main(String[] args) {
        Account obj[] = new Account[2];
        obj[0] = new Account(1, "Dhaka");
        obj[1] = new Account(2, "Rangpur");
        
        System.out.println("For array element 0: ");
        obj[0].showData();
        
        System.out.println("For array element 1: ");
        obj[1].showData();
    }
}
