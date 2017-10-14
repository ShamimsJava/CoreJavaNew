package createString;

public class StringCreation {
    public static void main(String[] args) {
        
        // way no. 1
        String s1 = "Bangladesh";
        System.out.println(s1);
        
        // way no. 2
        char[] c1 = {'B','a','n','g','l','a','d','e','s','h'};
        String s2 = new String(c1);
        System.out.println(s2);
        
        // way no. 3
        String s3 = new String("Bangladesh");
        System.out.println(s3);
        
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("g"));
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(0, 6));
    }
}
