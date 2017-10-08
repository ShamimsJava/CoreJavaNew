package shamim.date8;

public class Sample3 {
    public static void main(String[] args) {
        
        boolean a = true;
        char b = 'a';
        byte c = 12;
        short d = (byte)15;
        int e = (int)50L; // casting
        long f = 60L;
        
        float g = 50.24563f;
        double h = 56.54f;
        
        String name = "Jakir"; // String is a class
        
        // wrapper class
        
        //Integer i = 16;
        
        int var = 56;
        Integer var2 = new Integer(var); // wrapper class; boxing
        int var3 = var2; // unboxing
        
        Integer var4 = var3; // autoboxing
        int var5 = var4; // autounboxing
    }
}
