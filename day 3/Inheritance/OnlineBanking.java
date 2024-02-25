
public class OnlineBanking {
    public static void main(String args[]){
        SavingsAccount savAcc = new SavingsAccount(12345678,10,"me");
        savAcc.calculateInterest();

        CurrentAccount currAcc = new CurrentAccount(12342653,100,"you");
        currAcc.handleOverdraft(10);
        currAcc.handleOverdraft(100);
    }
}
class Account {

    private long accountNumber;
    
    private double balance;
    
    private String accountHolder;
    
    Account(long accountNumber, double balance, String accountHolder) {
    
    this.accountNumber = accountNumber;
    
    this.balance = balance;
    
    this.accountHolder = accountHolder;
    
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
    
    class SavingsAccount extends Account {
    
    // Specific features for savings account
        SavingsAccount(long accountNumber,double balance,String accountHolder){
            super(accountNumber, balance, accountHolder);
        }
    
    void calculateInterest() {
        double interest = this.getBalance()*0.1;
        System.out.println("The interest is : " + interest);
    // Implementation...
    
    }
    
    }
    
    class CurrentAccount extends Account {
    
    // Specific features for current account

        CurrentAccount(long accountNumber, double balance,String accountHolder){
            super(accountNumber, balance, accountHolder);
        }
    
    void handleOverdraft(double withdraw) {
        if (withdraw > this.getBalance()){
            System.out.println("You cant withdraw :" + withdraw + " , Since your acc balance is :" +this.getBalance());
        }
        else {
            System.out.println("Old account balance is : "+ this.getBalance());
            this.setBalance(this.getBalance() - withdraw);
            System.out.println("New account balance is : " + this.getBalance());
        }
    // Implementation...
    
    }
    
    }