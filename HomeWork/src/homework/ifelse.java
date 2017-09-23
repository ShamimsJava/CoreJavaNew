package homework;

public class ifelse {
    static int x = 10;
    static int y = 12;
    static int p = 11;
    static int q = 13;
    
    public static void main(String[] args) {
        if(x>y && x>p && x>q){
            System.out.println(x + " is big");
        }else if(y>x && y>p && y>q){
            System.out.println(y + " is big");
        }else if(p>x && p>y && p>q){
            System.out.println(p + " is big");
        }else{
            System.out.println(q + " is big");
        }
    } 
}