
public abstract class Media {
    protected String title;
/*Determines the title*/
    public Media(String title) {
        this.title = title;
    }

    public abstract void play();
    /*Handle the playing of the current song*/
}
