package shamim.lecture4;

public class MoneyJar {

    String purpose;
    double amount;
    double target;
    double surplus;

    void add(double sum) {
        amount = amount + sum;
        surplus = amount - target;
    }

    double takeOut(double sum) {
        double sumReturned; // declaration statement
        if (amount >= sum) { // brance statement start
            amount = amount - sum;
            sumReturned = sum;
        } else {        // block statement start
            sumReturned = amount;
            amount = 0;
        }       // block statement end
        surplus = amount - target;
        return sumReturned;
    }   // brance statement end

    double getAmount() {
        return amount;
    }

    void setTarget(double newTarget) {
        target = newTarget;
        surplus = amount - target;  // assignment statement
    }

    double getTarget() {
        return target;  // return statement
    }
    
    double getSurplus(){
        return surplus;
    }
}
