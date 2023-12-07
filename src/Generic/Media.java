package Generic;

import java.time.LocalDate;

public abstract class Media {

    protected String title;
    protected LocalDate publicationDate;

    public Media(String title, LocalDate publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public abstract double calculatePrice();
}
