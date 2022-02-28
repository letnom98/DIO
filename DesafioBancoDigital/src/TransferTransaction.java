
public class TransferTransaction extends Transaction {
	private Client recipient;

	public TransferTransaction(double ammount, Client recipient) {
		super("Transfer", ammount);
		this.recipient = recipient;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printTransaction() {
		System.out.println("\t\tTransaction: " + super.type);
		System.out.println("\t\tDate: " + super.date);
		System.out.println("\t\tRecipient: " + recipient.getName());
		System.out.printf("\t\tAmount: %.2f\n", super.ammount);
	}

}
