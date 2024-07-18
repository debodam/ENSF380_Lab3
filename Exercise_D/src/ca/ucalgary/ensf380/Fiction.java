package ca.ucalgary.ensf380;

public class Fiction extends Book {
    public Fiction() {
        super();
    }

    public Fiction(String isbn, int pages) {
        super(isbn, pages);
    }

    public String coverArt() {
        return "Method coverArt called from Fiction";
    }

    public String genre() {
        return "Method genre called from Fiction";
    }
}
