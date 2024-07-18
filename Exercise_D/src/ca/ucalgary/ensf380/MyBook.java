package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        Author author1 = new Author("Debo Dam", "41 Evercreek Bluffs", 35);
        Author author2 = new Author("Arnav Mittal", "35 Richard Song Ave", 17);
        Publisher publisher = new Publisher("Hitman Inc.", "587 Plaza Blvd");

        Classic classic = new Classic();
        classic.setOrigPubYear(1900);
        classic.setTheAuthor(new Author[]{author1});
        classic.setBookPublisher(new Publisher[]{publisher});
        classic.setTitle("The Great Classic"); 

        Book book = new Book("0987654321", 10);
        book.setTitle("General Book"); 
        Hardcover hardcover = new Hardcover();
        Paperback paperback = new Paperback();

        Category category = new Category();
        category.setCategory(new Category());
        category.setSubCategory(new Category());
        category.setSuperCategory(new Category());

        Nonfiction nonfiction = new Nonfiction();
        nonfiction.setDeweyClassification(category);

        Fiction fiction = new Fiction();

        Story story = new Story();
        story.setTheAuthor(new Author[]{author1, author2});

        Anthology anthology = new Anthology();
        anthology.setStory(new Story[]{story});

        Novel novel = new Novel("0987654321", 10, new Author[]{author1}, new Series("Trilogy of Fathers"));

        Contract contract = new Contract("2024-07-18", publisher, new Author[]{author1, author2});

        System.out.println("Classic Book:");
        System.out.println("Title: " + classic.getTitle()); 
        if (classic.getTheAuthor() != null && classic.getTheAuthor().length > 0) {
            System.out.println("Authors: " + classic.getTheAuthor()[0].getName());
        } else {
            System.out.println("Authors: No authors available");
        }
        System.out.println("Original Publication Year: " + classic.getOrigPubYear());

        if (classic.getBookPublisher() != null && classic.getBookPublisher().length > 0) {
            System.out.println("Publisher: " + classic.getBookPublisher()[0].getName());
        } else {
            System.out.println("Publisher: No publisher available");
        }

        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Title: " + book.getTitle()); 

        System.out.println("\nHardcover Binding: " + hardcover.binding());
        System.out.println("Paperback Cover Art: " + paperback.coverArt());

        System.out.println("\nCategory Sort Method: " + category.sort());
        System.out.println("Nonfiction Dewey Classification Sort Method: " + nonfiction.getDeweyClassification().sort());

        System.out.println("\nFiction Cover Art: " + fiction.coverArt());
        System.out.println("Fiction Genre: " + fiction.genre());

        System.out.println("\nStory Plot: " + story.plot());
        System.out.println("Anthology Story Order: " + anthology.storyOrder());

        System.out.println("\nNovel Theme: " + novel.theme());
        System.out.println("Contract Print: " + contract.printContract());
    }
}
