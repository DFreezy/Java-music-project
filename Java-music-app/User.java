/*Import java utilities*/
import java.util.ArrayList;
import java.util.List;

/*Creates a class to manage user info*/
public class User {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
        /*Print the playlist name*/
        System.out.println("Playlist " + name + " created.");
    }

    public Playlist getPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        return null;
    }

    public String getUsername() { return username; }
}
