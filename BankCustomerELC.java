package first_Test_15_02_2025;
import java.util.*;
public class BankCustomerELC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Enter Bank Name:");
        String bankName = scanner.nextLine();
        
        System.out.println("Enter Customer Name:");
        String bankCustomerName = scanner.nextLine();
        
        System.out.println("Enter Bank Address:");
        String bankAddress = scanner.nextLine();
        
        System.out.println("Enter IFSC Code:");
        String bankIFSCCode = scanner.nextLine();
        
        System.out.println("Enter Account Number:");
        int customerAccountNumber = scanner.nextInt();
        
        System.out.println("Enter Initial Balance:");
        double currentBalance = scanner.nextDouble();
        
        bank.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    bank.currentBalance();
                    break;
                case 4:
                    System.out.println(bank.displayDetails());
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}