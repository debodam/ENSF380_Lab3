package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private Author[] theAuthor;
    private Series mySeries;

    public Novel() {
        super();
    }

    public Novel(String isbn, int pages, Author[] theAuthor, Series mySeries) {
        super(isbn, pages);
        this.theAuthor = theAuthor;
        this.mySeries = mySeries;
    }

    public String theme() {
        return "Method theme called from Novel";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] authors) {
        this.theAuthor = authors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series series) {
        this.mySeries = series;
    }
}
