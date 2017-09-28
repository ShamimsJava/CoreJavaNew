package bd.exception;

// create my own exception
import static bd.exception.TestException.validate;

class OwnException extends Exception {

    public OwnException(String message) {
        super(message);
    }
}

// throw the exception for specific event
class TestException {

    static void validate(int age) throws OwnException {
        if (age < 18) {
            throw new OwnException("Exception occured");
        } else {
            System.out.println("You are welcome.");
        }
    }
}

// handling my own exception
class ExceptionHanded {

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (OwnException o) {
            System.err.println("Exception handled");
        }
        System.out.println("Rest of the program........");
    }
}
