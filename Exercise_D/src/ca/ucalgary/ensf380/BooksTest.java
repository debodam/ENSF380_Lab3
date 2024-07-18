package ca.ucalgary.ensf380;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BooksTest {
    
    // Sample data
    String isbn = "0987654321";
    int pages = 10;
    String publisherName = "Hitman Inc.";
    String publisherAddress = "587 Plaza Blvd";
    int origPubYear = 1900;

    // Objects for testing
    private Author author1;
    private Author author2;
    private Publisher publisher;
    private Classic classic;
    private Book book;
    private Hardcover hardcover;
    private Paperback paperback;
    private Category category;
    private Nonfiction nonfiction;
    private Fiction fiction;
    private Story story;
    private Anthology anthology;
    private Novel novel;
    private Contract contract;

    @BeforeEach
    public void setUp() {
        author1 = new Author("Debo Dam", "41 Evercreek Bluffs", 35);
        author2 = new Author("Arnav Mittal", "35 Richard Song Ave", 17);
        publisher = new Publisher(publisherName, publisherAddress);

        classic = new Classic();
        classic.setOrigPubYear(origPubYear);
        classic.setTheAuthor(new Author[]{author1});
        classic.setBookPublisher(new Publisher[]{publisher});

        book = new Book(isbn, pages);
        hardcover = new Hardcover();
        paperback = new Paperback();

        category = new Category();
        category.setCategory(new Category());
        category.setSubCategory(new Category());
        category.setSuperCategory(new Category());

        nonfiction = new Nonfiction();
        nonfiction.setDeweyClassification(category);

        fiction = new Fiction();

        story = new Story();
        story.setTheAuthor(new Author[]{author1, author2});

        anthology = new Anthology();
        anthology.setStory(new Story[]{story});

        novel = new Novel(isbn, pages, new Author[]{author1}, new Series("Trilogy of Fathers"));

        contract = new Contract("2024-07-18", publisher, new Author[]{author1, author2});
    }

    @Test
    public void testClassicAuthorsNames() {
        String expectedAuthors = "Debo Dam";
        assertEquals(expectedAuthors, classic.getTheAuthor()[0].getName());
    }

    @Test
    public void testClassicPublisher() {
        assertEquals(publisherName, classic.getBookPublisher()[0].getName());
    }

    @Test
    public void testBookDetails() {
        assertEquals(isbn, book.getIsbn());
        assertEquals(pages, book.getPages());
    }

    @Test
    public void testHardcoverBinding() {
        assertEquals("Method binding called from Hardcover", hardcover.binding());
    }

    @Test
    public void testPaperbackCoverArt() {
        assertEquals("Method coverArt called from Paperback", paperback.coverArt());
    }

    @Test
    public void testCategorySort() {
        assertEquals("Method sort called from Category", category.sort());
    }

    @Test
    public void testNonfictionDeweyClassification() {
        assertEquals("Method sort called from Category", nonfiction.getDeweyClassification().sort());
    }

    @Test
    public void testFictionCoverArt() {
        assertEquals("Method coverArt called from Fiction", fiction.coverArt());
    }

    @Test
    public void testFictionGenre() {
        assertEquals("Method genre called from Fiction", fiction.genre());
    }

    @Test
    public void testStoryPlot() {
        assertEquals("Method plot called from Story", story.plot());
    }

    @Test
    public void testAnthologyStoryOrder() {
        assertEquals("Method storyOrder called from Anthology", anthology.storyOrder());
    }

    @Test
    public void testNovelTheme() {
        assertEquals("Method theme called from Novel", novel.theme());
    }

    @Test
    public void testContractPrint() {
        assertEquals("Method printContract called from Contract", contract.printContract());
    }
}
