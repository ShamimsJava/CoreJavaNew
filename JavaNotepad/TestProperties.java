import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties probs = System.getProperties();
        probs.list(System.out);
		
		//String pro = System.getProperty("java.vendor");
		//System.out.println(pro);
    }
}