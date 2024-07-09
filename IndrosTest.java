import java.util.Scanner;
/**
 *
 * @author rajiv
 */
public class IndrosTest {
    
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        BankUI bank = new BankUI();
        UserInterface ui = new UserInterface(bank, scanner);
        ui.start();
    }
}
