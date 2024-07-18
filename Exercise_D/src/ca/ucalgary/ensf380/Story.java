package ca.ucalgary.ensf380;

public class Story {
    private Author[] theAuthor;

    public Story() {
    }

    public Story(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }

    public String plot() {
        return "Method plot called from Story";
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] authors) {
        this.theAuthor = authors;
    }

	public void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
}
