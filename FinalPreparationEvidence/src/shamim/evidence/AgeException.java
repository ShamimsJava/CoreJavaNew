package shamim.evidence;

public class AgeException extends Exception {

    AgeException(String s) {
        super(s);
    }
}
class Age {

    public static void main(String[] args) throws AgeException {
        int age = 15;
        try {
            if (age < 18) {
                throw new AgeException("Your are not voter");
            } else {
                System.out.println("You are welcome.");
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }

    }
}
