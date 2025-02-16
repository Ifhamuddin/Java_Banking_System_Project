package first_Test_15_02_2025;

class Bank {
    private String bankName;
    private String bankCustomerName;
    private String bankAddress;
    private String bankIFSCCode;
    private int customerAccountNumber;
    private double currentBalance;

    public void setDetails(String bankName, String bankCustomerName, String bankAddress, 
                            String bankIFSCCode, int customerAccountNumber, double currentBalance) {
        this.bankName = bankName;
        this.bankCustomerName = bankCustomerName;
        this.bankAddress = bankAddress;
        this.bankIFSCCode = bankIFSCCode;
        this.customerAccountNumber = customerAccountNumber;
        this.currentBalance = currentBalance;
    }

    public void withdraw(double amount) {
        if (currentBalance <= 1000) {
            System.out.println("InsufficientBalance");
            return;
        }
        if ((currentBalance - amount) < 1000) {
            System.out.println("Maintain MinimumBalance");
            return;
        }
        currentBalance -= amount;
        System.out.println("Transaction Successful.");
        System.out.println("Available Balance : Rs." + currentBalance);
    }

    public void deposit(double amount) {
        currentBalance += amount;
        System.out.println("Deposited Successfully.");
        currentBalance();
    }

    public void currentBalance() {
        System.out.println("Available Balance : Rs." + currentBalance);
    }

    public String displayDetails() {
        return "Bank Name: " + bankName + "\n" +
               "Customer Name: " + bankCustomerName + "\n" +
               "Bank Address: " + bankAddress + "\n" +
               "IFSC Code: " + bankIFSCCode + "\n" +
               "Account Number: " + customerAccountNumber + "\n" +
               "Current Balance: Rs." + currentBalance;
    }
}