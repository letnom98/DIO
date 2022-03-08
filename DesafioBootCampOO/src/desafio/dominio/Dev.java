package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentsSubscription = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        bootcamp.subiscribeDev(this);
        this.contentsSubscription.addAll(bootcamp.getContents());
    }

    public void progress(Content contentToProgress) {
        Optional<Content> content = this.contentsSubscription.stream().filter(c -> c == contentToProgress).findFirst();
        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.contentsSubscription.remove(content.get());
            System.out.println("Contents: " + this.contentsSubscription);
            System.out.println("Finished contents: " + this.finishedContents);
        } else {
            System.err.println("Error! You are not subscribed to this content!");
        }
    }

    public double calculateTotalXp() {
        return this.finishedContents.stream().mapToDouble(Content::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void finishContent(Content finishedContent) {
        this.finishedContents.add(finishedContent);
    }

    public Set<Content> getContentsSubscription() {
        return contentsSubscription;
    }

    public void subscribeToContent(Content contentSubscription) {
        this.contentsSubscription.add(contentSubscription);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Dev dev = (Dev) obj;
        return Objects.equals(name, dev.name) && Objects.equals(
                contentsSubscription, dev.contentsSubscription)
                && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscription, finishedContents);
    }
}
