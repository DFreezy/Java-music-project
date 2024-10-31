// DuplicateSongException.java
public class DuplicateSongException extends Exception {
    public DuplicateSongException() {
        super("This media item is already in the playlist.");
    }
}
