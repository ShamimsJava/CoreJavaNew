package shamim.lecture16;

// creating an exception
class ValidityException extends Exception {

    public ValidityException(String message) {
        super(message);
    }
}

// issue where I want to use my exception
class TestException {

    void voterValidity(int age) throws ValidityException {
        if (age < 18) {
            throw new ValidityException("You are not eligible for vote...");
        } else {
            System.out.println("Your are eligible for vote....");
        }
    }
}

// apply own created Exception
public class CustomeException {

    public static void main(String[] args) {
        TestException te = new TestException();
        try {
            te.voterValidity(15);
        } catch (ValidityException e) {
            System.out.println(e);
        }
    }
}
