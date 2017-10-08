package cls.customexception;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            TestCustomException.myTestMethod(null);
        } catch (Exception e) {
                System.err.println("Inside catch block: "+e.getMessage());
        }
    }
    
    static void myTestMethod(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String value is null.");
        }
    }
}
