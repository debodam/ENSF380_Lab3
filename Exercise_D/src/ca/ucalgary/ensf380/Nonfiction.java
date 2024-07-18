package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private Category deweyClassification;

    public Nonfiction() {
        super();
    }

    public Nonfiction(String isbn, int pages, Category deweyClassification) {
        super(isbn, pages);
        this.deweyClassification = deweyClassification;
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }
}
