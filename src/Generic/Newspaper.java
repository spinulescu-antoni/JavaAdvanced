package Generic;

import java.time.LocalDate;

public class Newspaper extends Media{

    private String name;

    private int noOfSection;

    public Newspaper(String title, LocalDate publicationDate, String name, int noOfSection) {
        super(title, publicationDate);
        this.name = name;
        this.noOfSection = noOfSection;
    }

    @Override
    public double calculatePrice() {
        return noOfSection * 200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSection() {
        return noOfSection;
    }

    public void setNoOfSection(int noOfSection) {
        this.noOfSection = noOfSection;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", noOfSection=" + noOfSection +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
