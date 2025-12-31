package Com.classandobject.leveltwo;

public class BankAccount { 
	
	// Attributes (Encapsulation)
	private String accountHolder; 
	private String accountNumber; 
	private double balance; 
	
	// Constructor
	public BankAccount(String accountHolder, String accountNumber, double balance) { 
		this.accountHolder = accountHolder; 
		this.accountNumber = accountNumber; 
		this.balance = balance; 
	}
	
	// Getter methods (ACCESS private data)
	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	// Display bank name (static method)
	public static void displayBank() { 
		System.out.println("\t\t\tState Bank of Chennai"); 
	} 
	 
	// Deposit method
	public void deposit(double amount) { 
		if (amount > 0) { 
			balance += amount; 
			System.out.println("Deposited: " + amount); 
		} else { 
			System.out.println("Amount to deposit must be positive"); 
		} 
	} 
	  
	// Withdraw method
	public void withdraw(double amount) { 
		if (amount > 0 && amount <= balance) { 
			balance -= amount; 
			System.out.println("Withdrawn: " + amount); 
		} else if (amount <= 0) { 
			System.out.println("Withdrawal amount must be positive"); 
		} else { 
			System.out.println("Insufficient balance"); 
		} 
	} 
	  
	// Display balance
	public void displayBalance() { 
		System.out.println("Current Balance: " + balance); 
	} 
	   
	// Main method
	public static void main(String[] args) { 
		
		BankAccount account = new BankAccount("Lynda", "123456789", 700.00); 
		
		// Display bank name
		displayBank(); 
		
		// Display account details using getters
		System.out.println("Account Holder: " + account.getAccountHolder());
		System.out.println("Account Number: " + account.getAccountNumber());
		
		// Transactions
		account.displayBalance(); 
		account.deposit(200.00); 
		account.displayBalance(); 
		account.withdraw(100.00); 
		account.displayBalance(); 
		account.withdraw(900.00); 
	} 
}
