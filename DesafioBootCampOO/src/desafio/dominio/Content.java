package desafio.dominio;

public abstract class Content {
    private String title;
    private String description;
    protected static final double STANDARD_XP = 100d;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateXp();
}
