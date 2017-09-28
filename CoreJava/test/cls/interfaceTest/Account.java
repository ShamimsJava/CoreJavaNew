package cls.interfaceTest;
public class Account implements Balance {
    double blnce;
    double dep;
    double with;
    double check;
    public Account(double blnce, double dep, double with) {
        this.blnce = blnce;
        this.dep = dep;
        this.with = with;
    }
    @Override
    public double deposit() {
        return dep;
    }
    @Override
    public double withdraw() {

        return with;
    }
    @Override
    public double checkBalance() {
        blnce = blnce + dep - with;
        return blnce;
    }
}
