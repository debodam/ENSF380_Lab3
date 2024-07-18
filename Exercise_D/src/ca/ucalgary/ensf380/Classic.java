package ca.ucalgary.ensf380;

public class Classic extends Book {
    private static final int DEFAULT_ORIG_PUB_YEAR = 1860;
    private int origPubYear;
    private Author[] theAuthor;
    private Publisher[] bookPublisher;

    public Classic() {
        super();
        this.origPubYear = DEFAULT_ORIG_PUB_YEAR;
        this.theAuthor = new Author[0]; // Initialize with empty array
        this.bookPublisher = new Publisher[0]; // Initialize with empty array
    }

    public Classic(String isbn, int pages, int origPubYear, Author[] theAuthor, Publisher[] bookPublisher) {
        super(isbn, pages);
        this.origPubYear = origPubYear;
        this.theAuthor = theAuthor;
        this.bookPublisher = bookPublisher;
    }

    public String createNotes() {
        return "Method createNotes called from Classic";
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int year) {
        this.origPubYear = year;
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] authors) {
        this.theAuthor = authors;
    }

    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher[] pub) {
        this.bookPublisher = pub;
    }
}
