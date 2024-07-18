package ca.ucalgary.ensf380;

public class Book {
    private String isbn;
    private int publicationYear;
    private int pages;
    private String title; // Add title field

    public Book() {
    }

    public Book(String isbn, int pages) {
        this.isbn = isbn;
        this.pages = pages;
        this.title = "";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String coverArt() {
        return "Method coverArt called from Book";
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
