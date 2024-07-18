package ca.ucalgary.ensf380;

public class Paperback extends Book {
    public Paperback() {
        super();
    }

    public Paperback(String isbn, int pages) {
        super(isbn, pages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}

