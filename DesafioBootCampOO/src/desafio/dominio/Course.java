package desafio.dominio;

public class Course extends Content {
	private int courseLoad;

	public Course(String title, String description, int courseLoad) {
		super.setTitle(title);
		super.setDescription(description);
		this.courseLoad = courseLoad;
	}

	public double calculateXp() {
		return STANDARD_XP * courseLoad;
	}

	@Override
	public String toString() {
		return "Course{\nTitle : " + getTitle() + "\nDescription : " + getDescription()
				+ "\nCourse load : " + courseLoad + "\n}";
	}

}
