package cls.fatherSon;

public class Son extends Father implements CalcMethod {
    double age;
    
    @Override
    public double income(double in) {
        return in; 
    }

    @Override
    public double expenditure(double ex) {
        return ex;
    }

    @Override
    public double balance() {
        return property;
    }
    
}
