package shamim.lecture17;

public class Assertion {

    public static void main(String[] args) {
        System.out.println("Programming starting part ok...........");
        int x = 10;
        assert(x<0); // simple form
        //assert (x<0) : "Assertion error is occured......."; // augmented form
        System.out.println("Programming is ok...........");
    } 
}

// compiling purpose
// javac Assertion.java

// running purpose
// java -ea Assertion
// ea stands for enable assertion

// enabling assertion in netbeans ide
// Run > Set Project Configuration > Customize... > Run > VM Options > -enableassertions:packageName...