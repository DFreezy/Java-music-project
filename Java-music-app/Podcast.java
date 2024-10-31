/*Handke podcast info which extends form the madia class*/
public class Podcast extends Media {
    private String host;

    public Podcast(String title, String host) {
        super(title);
        this.host = host;
    }

    @Override
    public void play() {
        /*Handles playing the podcast*/
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
}
