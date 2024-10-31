/*Handles playing the song class*/
public class Song extends Media {
    private String artist;
    private String album;
    private double duration;

    public Song(String title, String artist, String album, double duration) {
        super(title);
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public void play() {
        /*Displays song information*/
        System.out.println("Playing song: " + title + " by " + artist);
    }

    /*Gets song info*/
    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public double getDuration() { return duration; }
}
