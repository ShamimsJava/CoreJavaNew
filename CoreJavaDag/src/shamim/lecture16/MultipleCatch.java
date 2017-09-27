package shamim.exceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        args = new String[4];

        args[0] = "1";
        //args[1] = "2";
        args[1] = "Two"; // to see the exception NumberFormatException
        args[2] = "3";
        args[3] = "4";
        int sum = 0;
        
        for(int i = 0; i < args.length; i++){
            try{
                sum += Integer.parseInt(args[i]);
            }catch(NumberFormatException nfe){          // using multiple catch clause
                System.err.println(args[i]+" is not integer.");
            }catch(Exception e){
                System.err.println(args[i]+" is not integer.");
            }
        }
        System.out.println("The sum is: "+sum);
    }
}
