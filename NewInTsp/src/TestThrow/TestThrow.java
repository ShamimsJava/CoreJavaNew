package TestThrow;

public class TestThrow {
    public static void main(String[] args) {
      try{
          TestThrow met = new TestThrow();
          System.out.println("Length of Dhaka is "+met.getStringSize("Dhaka"));
          System.out.println("length of Hasina is "+met.getStringSize("Hasina"));
          System.out.println("length of null string is "+met.getStringSize(null));
      }catch(Exception ex){
          System.err.println("Exception message: "+ex.getMessage());
      }  
    }
    
    public int getStringSize(String str) throws Exception{
        if(str == null){
            throw new Exception("String input is null");
        }
        return str.length();
    }
}
