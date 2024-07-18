package ca.ucalgary.ensf380;

public class Hardcover extends Book {
    public Hardcover() {
        super();
    }

    public Hardcover(String isbn, int pages) {
        super(isbn, pages);
    }

    public String binding() {
        return "Method binding called from Hardcover";
    }
}
