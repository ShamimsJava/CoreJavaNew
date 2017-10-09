package shamim.date9_2;

public class MethodExample {
    public int stId;
    public String stName;
    public double stAge;

    public MethodExample() { // default constructor
    }

    public MethodExample(int stId, String stName, double stAge) {
        this.stId = stId;
        this.stName = stName;
        this.stAge = stAge;
    }

    
    public MethodExample(int stId, String stName) { // parameterized constructor
        this.stId = stId; // to remove ambiguity problem we have to use this keyword
        this.stName = stName;
    }
    
    public MethodExample(String stName) { // parameterized constructor
        this.stName = stName;
    }

    @Override
    public String toString() {
        return "MethodExample{" + "stId=" + stId + ", stName=" + stName + ", stAge=" + stAge + '}';
    }
    
    
}
