
/**
 *
 * @author rajiv
 */
public class BankUI {
    private double balance;
    
    public BankUI() {
        this.balance = 0;
    }
 
    public double balance() {
        return this.balance;
    }
 
    public void deposit(double increase) {
        this.balance += increase;
    }
 
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
    
}
