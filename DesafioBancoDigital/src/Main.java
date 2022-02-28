
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client jhon = new Client("Jhon Doe", 23, 154679);
		Client jane = new Client("Jane Doe", 22, 546132);
		BankAccount account1 = new SavingsAccount(jhon);
		BankAccount account2 = new CheckingAccount(jane);
		
		account2.deposit(200.0);
		account2.withdraw(110.0);
		
		account1.deposit(15.0);
		account2.transfer(account1, 50.0);
		
		account1.getStatement();
		account2.getStatement();
	}

}
