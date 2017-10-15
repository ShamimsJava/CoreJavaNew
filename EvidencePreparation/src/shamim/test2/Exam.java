package shamim.test2;

public class Exam {
    public void result(int x, int y){
        if(x>=70 && y>=30){
            System.out.println("You passed in both.");
        }else if(x>=70 && y<30){
            System.out.println("You passed in External but failed in Evidence.");
        }else if(x<70 && y>=30){
            System.out.println("You passed in Evidence but failed in External.");
        }else{
            System.out.println("You failed in both.");
        }
    }
}
