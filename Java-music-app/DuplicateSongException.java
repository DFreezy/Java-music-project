// DuplicateSongException.java
public class DuplicateSongException extends Exception {
    /*Created a public class to extend upon the Exception class*/
    public DuplicateSongException() {
        super("This media item is already in the playlist.");
    }
}
