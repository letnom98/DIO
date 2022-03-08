package desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {

	private LocalDate date;

	public Mentorship(String title, String description) {
		super.setTitle(title);
		super.setDescription(description);
		this.date = LocalDate.now();
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentorship{\nTitle : " + getTitle() + "\nDescription : " + getDescription()
				+ "\nDate : " + date + "\n}";
	}

	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return STANDARD_XP + 20;
	}

}
