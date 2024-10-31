// MusicApp.java
import java.util.Scanner;
/*Responsible for terminal interaction*/

public class MusicApp {
    public static void main(String[] args) {
        /*Doesn't return any value */
        Scanner scanner = new Scanner(System.in);
        User user = new User("Duwayne");

        System.out.println("Welcome to the Music playlist, " + user.getUsername() + "!");
        
        /*Adds a loop to execute code while the terminal is running*/
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Playlist");
            System.out.println("2. Add Song to Playlist");
            System.out.println("3. Add Podcast to Playlist");
            System.out.println("4. Play Playlist");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            /*Adds a switch statement to handle each option the user chooses*/
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    user.createPlaylist(playlistName);
                }
                case 2 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);

                    if (playlist == null) {
                        System.out.println("Playlist not found!");
                        break;
                    }

                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter album: ");
                    String album = scanner.nextLine();
                    System.out.print("Enter duration (minutes): ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    Song song = new Song(title, artist, album, duration);
                    try {
                        playlist.addMedia(song);
                    } catch (DuplicateSongException e) {
                        /*Catches any duplicates*/
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);

                    if (playlist == null) {
                        System.out.println("Playlist not found!");
                        break;
                    }

                    System.out.print("Enter podcast title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter host: ");
                    String host = scanner.nextLine();

                    Podcast podcast = new Podcast(title, host);
                    try {
                        playlist.addMedia(podcast);
                    } catch (DuplicateSongException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = user.getPlaylist(playlistName);

                    if (playlist == null) {
                        System.out.println("Playlist not found!");
                    } else {
                        playlist.playAll();
                    }
                }
                case 5 -> {
                    System.out.println("Exiting Music Management System. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
