package shamim.example1;

public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("First portion of the program....");
        args = new String[3];
        args[0] = "1";
        args[1] = "two";
        args[2] = "3";
        try {
            int sum = 0;
            for(String arg : args){
                sum += Integer.parseInt(arg);
            }
            System.out.println("The sum is: "+sum);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException......");
        }catch(ArrayStoreException e){
            System.err.println("ArrayStoreException........");
        }catch(NumberFormatException e){
            System.err.println("NumberFormatException.........");
        }finally{
            System.out.println("Finally block alltime execute.....");
        }
    }
}
