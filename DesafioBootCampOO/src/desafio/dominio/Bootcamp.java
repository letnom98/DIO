package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Set<Content> getContents() {
        return contents;
    }

    public void setContent(Set<Content> contents) {
        this.contents = contents;
    }

    public void setContent(Content content) {
        this.contents.add(content);
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void subiscribeDev(Dev dev) {
        this.subscribedDevs.add(dev);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(name, bootcamp.name)
                && Objects.equals(description, bootcamp.description)
                && Objects.equals(initialDate, bootcamp.initialDate)
                && Objects.equals(finalDate, bootcamp.finalDate)
                && Objects.equals(subscribedDevs, bootcamp.subscribedDevs)
                && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, subscribedDevs, contents);
    }

}
