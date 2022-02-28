import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public abstract class Transaction {
	protected Date date;
	protected double ammount;
	protected String type;
	
	public Transaction(String type, double ammount){
		this.setDate(this.setDate());
		this.type = type;
		this.ammount = ammount;
	}

	public String getType() {
		return type;
	}

	public double getAmmount() {
		return ammount;
	}

	private Date setDate() {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		return c.getTime();
	}
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void printTransaction() {
		System.out.println("\t\tTransaction: " + this.type);
		System.out.println("\t\tDate: " + this.date);
		System.out.printf("\t\tAmount: %.2f\n", this.ammount);
	};
}
