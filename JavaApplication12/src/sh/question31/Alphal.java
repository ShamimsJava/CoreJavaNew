package sh.question31;

public class Alphal {
    public static void main(String[] args) {
        boolean flag;
        int i = 0;
        do{
            flag = false;
            System.out.print(i++);
            flag = i < 10;
            continue;
        }while((flag)? true : false);
    }
}
