package Classes;

/**
 * @Author pankaj
 * @create 4/24/21 4:37 PM
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    Account(){
        System.out.println("Default constructor is Called !!");
    }
    Account(String accountNumber,double balance,String customerName,String email,String phoneNumber){

        System.out.println("Account constructor with parameters called !!!");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // ============= deposit funds ==================
    public void depositFunds(double balance){
        this.balance=this.balance+balance;
        System.out.println("Deposit of "+balance+" made, New Balance is "+this.balance);
    }
     // ===================== withdrawal ==========
    public void withdrawal(double balance){
        if (this.balance - balance< 0){
            System.out.println("Insufficient funds, Available "+this.balance+" Withdraw not processed ");
        }else {
         this.balance= this.balance-balance;
         System.out.println("Withdrawal of "+balance+" processed, remaining balance = "+this.balance);
        }
    }

    public static void main(String[] args) {
          Account pankajAccount=new Account("54155415614tgfd56465",200.0,"Pankaj Kumar ravi","pankajravi25@gmail.com","+918825266805");
          pankajAccount.withdrawal(100.0);
          pankajAccount.depositFunds(50.0);

    }
}
