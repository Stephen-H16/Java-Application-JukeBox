package jukebox;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author STEPHEN HOEY SD 1 JAVA PROJECT 2013
 */
public class JukeboxApp {

    public static void showMenu() {
        System.out.println("Type 1 to add a song");
        System.out.println("Type 2 to delete a song");
        System.out.println("Type 3 to search song");
        System.out.println("Type 4 to see how much it would cost to play all songs");
        System.out.println("Type 5 find most expensive song");
        System.out.println("Type 6 to display shortest song");
        System.out.println("Type 7 to display most played song");
        System.out.println("Type 8 to display all songs in jukebox");
        System.out.println("Type 9 to display all songs by specific artist");
        System.out.println("Type 10 to get the Jukebox name");
        System.out.println("Type 11 to Exit the Jukebox");
    }

    public static void main(String[] Args) {

        Scanner SongScanner = new Scanner(System.in);
        System.out.println("Please enter the name of your Jukebox:");
        String jukeboxName = SongScanner.nextLine();
        Jukebox jukebox = new Jukebox(jukeboxName);

        int choice = -1;

        try {

            while (choice != 11) {
                showMenu();
                choice = SongScanner.nextInt();
                SongScanner.nextLine();

                if (choice == 1) {

                    System.out.println("Enter Artist");
                    String scannerArtist = SongScanner.nextLine();

                    System.out.println("Enter Title");
                    String scannerTitle = SongScanner.nextLine();

                    try {

                        System.out.println("Enter Price");
                        Double scannerPrice = SongScanner.nextDouble();

                        System.out.println("Enter Length");
                        Double scannerlenght = SongScanner.nextDouble();

                        System.out.println("");

                        Song Song1 = new Song(scannerArtist, scannerTitle, scannerPrice, scannerlenght);

                        jukebox.addSong(Song1);

                        System.out.println("Song has been added " + Song1.toString());

                    } catch (InputMismatchException xe) {
                        xe.getMessage();
                    }
                } else if (choice == 2) {

                    System.out.println("");
                    System.out.println("Delete a song enter in Title");
                    String scannerTitle = SongScanner.next();
                    jukebox.removeSong(scannerTitle);

                } else if (choice == 3) {

                    System.out.println("Please enter song to play");
                    String title = SongScanner.nextLine();
                    Song playSong = jukebox.FndSong(title);
                    if (playSong == null) {
                        System.out.println("The song cannot be played as it was not found in the jukebox.");
                    } else {
                        playSong.playSelectedSong();
                    }

                } else if (choice == 4) {

                    double total = jukebox.calcTotalPrice();
                    System.out.println("The total cost to play all songs is " + total + " euros.");

                } else if (choice == 5) {

                    Song MostExp = jukebox.findMostExpensiveSong();
                    System.out.println("The most expensive song in the Jukebox is: ");
                    System.out.println(MostExp);

                } else if (choice == 6) {

                    Song shortest = jukebox.ShortestSong();
                    System.out.println("The shortest song in the Jukebox is: ");
                    System.out.println(shortest);

                } else if (choice == 7) {

                    Song mostPlayed = jukebox.findMostPlayed();
                    System.out.println("The most played song in the Jukebox is: ");
                    System.out.println(mostPlayed);

                } else if (choice == 8) {

                    jukebox.displaySongsInJuke();

                } else if (choice == 9) {

                    System.out.println("Please Type artist to see all there songs");
                    String artist = SongScanner.nextLine();
                    ArrayList<Song> SongsToLookFor = jukebox.searchByArtist(artist);
                    if (SongsToLookFor.size() > 0) {
                        for (Song currentSong : SongsToLookFor) {
                            System.out.println(currentSong);
                        }
                    } else {
                        System.out.println("There are no songs by that artist in the Jukebox");
                    }

                } else if (choice == 10) {

                    System.out.println(jukebox.getName());

                } else if (choice == 11) {
                    System.out.println("");
                    System.out.println("Thank you for using the Jukebox have a nice day");
                    System.exit(0);
                } else {
                    System.out.println("Please enter a selection listed in the menu above.");
                }

            }

        } catch (InputMismatchException ex) {
            ex.getMessage();
            System.out.println("Not a valid entry please enter a number between 1 and 11");
        }
    }

}
