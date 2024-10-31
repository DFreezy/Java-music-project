// Playlist.java
import java.util.ArrayList;
import java.util.List;

/*Create a class to manage the playlist*/
public class Playlist {
    private String name;
    private List<Media> mediaList;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
    }


    public void addMedia(Media media) throws DuplicateSongException {
        if (mediaList.contains(media)) {
            throw new DuplicateSongException();
        }
        mediaList.add(media);
        System.out.println(media.title + " has been added to the playlist " + name + ".");
    }

    /*Manages removing songs*/
    public void removeMedia(Media media) {
        mediaList.remove(media);
        System.out.println(media.title + " has been removed from the playlist " + name + ".");
    }

    /*Plays all songs on playlist*/
    public void playAll() {
        System.out.println("Playing playlist: " + name);
        for (Media media : mediaList) {
            media.play();
        }
    }

    public String getName() { return name; }
}
