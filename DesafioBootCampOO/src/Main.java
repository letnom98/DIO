import desafio.dominio.Bootcamp;
import desafio.dominio.Content;
import desafio.dominio.Course;
import desafio.dominio.Dev;
import desafio.dominio.Mentorship;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Content c = new Course("Course One", "This is my first course", 15);
		Content m = new Mentorship("Mentorship One", "This is my first mentorship");
		Bootcamp b = new Bootcamp();
		b.setName("Bootcamp One");
		b.setDescription("This is my first bootcamp");
		b.setContent(m);
		b.setContent(c);
		Dev jhonDoe = new Dev();
		jhonDoe.setName("Jhon Doe");
		jhonDoe.subscribeBootcamp(b);
		jhonDoe.progress(c);
		jhonDoe.progress(m);
		System.out.println("Total Xp: " + jhonDoe.calculateTotalXp());
	}

}
