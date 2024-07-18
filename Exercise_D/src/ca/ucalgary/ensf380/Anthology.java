package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] story;

    public Anthology() {
        super();
    }

    public Anthology(String isbn, int pages, Story[] story) {
        super(isbn, pages);
        this.story = story;
    }

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return story;
    }

    public void setStory(Story[] stories) {
    this.story = stories;
    }
}