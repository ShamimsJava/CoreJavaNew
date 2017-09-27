package sir.test;

public class Hello {
    static String h1 = "Hellow";
    static String h2 = "Hell"+"ow";
    
    static public void similarities(){
        if(h1==h2){
            System.out.println("They are similar.");
        }else{
            System.out.println("They are not similar.");
        }
        
        if(h1.equals(h2)){
            System.out.println("They are similar.");
        }else{
            System.out.println("They are not similar");
        }
    }
}

class App2{
    public static void main(String[] args) {
        Hello.similarities();
    }
}