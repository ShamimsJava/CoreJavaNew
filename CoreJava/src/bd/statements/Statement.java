package bd.statements;

public class Statement {
        private double balance = 0.0;
        private double income = 0.0;
        private double expense = 0.0;
        
        public double addBalance(double income){
            balance += income;
            return balance;
        }
        
        public double doExpense(double expense){
            balance -= expense;
            return balance;
        }
    
}
