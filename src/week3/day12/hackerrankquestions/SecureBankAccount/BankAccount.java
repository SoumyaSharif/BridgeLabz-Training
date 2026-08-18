package week3.day12.hackerrankquestions.SecureBankAccount;

public class BankAccount {

    private int balance ;
    protected String Account_type ;
    int BranchCode;

    public BankAccount(int balance , String Account_type , int BranchCode ){

        if(balance > 0) {
            this.balance = balance;
        }else{
            System.out.println("Balance must be positive");
        }

        this.Account_type = Account_type ;
        this.BranchCode = BranchCode ;
    }

    //getter for balance
    public int getBalance(){
        return balance ;
    }

    //setter for balance
    public int setBalance(int amt){
        balance = amt ;
        return balance ;
    }

    //Methods
    public void deposit(int amt){

    }
}
