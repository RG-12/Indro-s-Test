
import java.util.Scanner;
/**
 *
 * @author rajiv
 */
public class UserInterface {
    
    private BankUI bank;
    private Scanner scan;
    
    public UserInterface(BankUI b, Scanner s) {
        this.bank = b;
        this.scan = s;
        
    }
    
    public void start() {
        while (true) {
            System.out.println("Press: ");
            System.out.println("1 - To add money.");
            System.out.println("2 - To withdraw money.");
            System.out.println("3 - To check balance.");
            System.out.println("x - To stop.");
            
            String command = scan.nextLine();
            
            if (command.equals("x")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Type the amount to be added: ");
                int add = Integer.valueOf(scan.nextLine());
                bank.deposit(add);
            }
            else if (command.equals("2")) {
                System.out.println("Type the amount to be withdrawn: ");
                int sub = Integer.valueOf(scan.nextLine());
                bank.withdraw(sub);
            }
            else if (command.equals("3")) {
                System.out.println("Your balance is: ");
                System.out.println(bank.balance());
            }
        }
    }
    
}
