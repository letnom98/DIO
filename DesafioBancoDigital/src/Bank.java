import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String companyName;
	private String tradeName;
	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public Bank(String companyName, String tradeName) {
		this.companyName = companyName;
		this.tradeName = tradeName;
	}
	
	public void openAccount() {
		//here goes all the logic of creanting an account, a client and bounding them;
	}
}
