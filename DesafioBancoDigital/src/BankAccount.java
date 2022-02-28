import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
	
	protected static final int AGENCY = 1;
	protected static int ACCOUNT_NUMBER = 1;
	protected Client client;
	protected double balance;
	protected int accountNumber;
	protected List<Transaction> transactions = new ArrayList<Transaction>();
	

	public BankAccount(Client client) {
		this.client = client;
		accountNumber = ACCOUNT_NUMBER++;
	}
	
	public void withdraw(Double ammount) {
		if(balance >= ammount) {
			balance -= ammount;
			this.addTransactionToList( new WithdrawTransaction(ammount));
		}
	};
	
	public void deposit(Double ammount) {
		balance += ammount;
		
		this.addTransactionToList(new DepositTransaction(ammount));
	};
	
	public void transfer(BankAccount account, double ammount) {
		this.withdraw(ammount);
		account.deposit(ammount);
		this.addTransactionToList(new TransferTransaction(ammount, account.getClient()));
	};
	
	public Client getClient() {
		return client;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void addTransactionToList(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void getStatement() {
		System.out.println("====================================== Statement ======================================");
		System.out.println("\tClient: " + client.getName() );
		System.out.println("\tAccount number: " + this.accountNumber );
		System.out.printf("\tActual balance: $%.2f\n", balance );
		if(transactions.size() > 0) {
			System.out.println("\t======================== Trasactions ========================");
			for(Transaction transaction : transactions) {
				transaction.printTransaction();
				System.out.println("\t-------------------------------------------------------------");
			}
		}
		System.out.println("=======================================================================================");
	}
}
