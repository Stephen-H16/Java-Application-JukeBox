package jukebox;

import java.util.ArrayList;

/**
 *
 * @author STEPHEN HOEY SD 1 JAVA PROJECT 2013
 */
public class Jukebox {

    private String Jboxname;
    private ArrayList<Song> SongList;

    public Jukebox(String name) {
        this.Jboxname = name;
        SongList = new ArrayList<Song>();
    }

    public Jukebox() {
        this.Jboxname = "Jukebox 1.0";
        SongList = new ArrayList<Song>();
    }

//Get name of Jukebox	
    public String getName() {
        return Jboxname;
    }

////NO 1 ADD SONG
    public String addSong(Song s) {
        Song CheckForASong = FndSong(s.getTitle());
        if (CheckForASong == null) {
            SongList.add(s);
            return "Song Added";
        } else {
            return "The song is already in the jukebox";
        }
    }

//NO 2 REMOVE SONG
    public void removeSong(String a) {
        for (int i = 0; i < SongList.size(); i++) {
            if (SongList.get(i).getArtist().equals(a)) {
                SongList.remove(SongList.get(i));
                System.out.println("Song Deleted");
            } else {
                System.out.println("Song does not exist");
            }
        }
    }

//NO 3 SEARCH FOR SONG
    public Song FndSong(String searchTitle) {
        Song s = null;
        for (Song currentSong : SongList) {
            String currentTitle = currentSong.getTitle();
            if (currentTitle.equalsIgnoreCase(searchTitle)) {
                s = currentSong;
            }
        }
        return s;
    }

//NO 4 SEARCH FOR ALL SONGS BY AN ARTIST 
    public ArrayList<Song> searchByArtist(String searchArtist) {
        ArrayList<Song> matches = new ArrayList<Song>();

        for (Song currentSong : SongList) {
            String currentArtist = currentSong.getArtist();
            if (currentArtist.equalsIgnoreCase(searchArtist)) {
                matches.add(currentSong);
            }
        }
        return matches;
    }
    
 
//NO 5 calculate the total price of the songs
    public double calcTotalPrice() {
        double total = 0.0;
        for (Song currentSong : SongList) {
            total = total + currentSong.getPrice();
        }
        return total;
    }

//NO 6 EXPENISVE SONG		
    public Song findMostExpensiveSong() {
        double highestPricedSong = 0.00;
        Song A = null;
        for (int i = 0; i < SongList.size(); i++) {
            if (SongList.get(i).getPrice() > highestPricedSong) {
                highestPricedSong = SongList.get(i).getPrice();
                A = SongList.get(i);
            }
        }
        return A;
    }

//NO 7 SHORTIST SONG
    public Song ShortestSong() {
        double shortSong = 10000;
        Song B = null;
        for (int i = 0; i < SongList.size(); i++) {
            if (SongList.get(i).getLength() < shortSong) {
                shortSong = SongList.get(i).getLength();
                B = SongList.get(i);
            }
        }
        return B;
    }

//NO 8 HIGHIST PLAY COUNT	
    public Song findMostPlayed() {
        if (SongList.size() > 0) {
            double played = SongList.get(0).getCount();
            Song mostPlayed = SongList.get(0);
            for (Song currentSong : SongList) {
                if (currentSong.getCount() > played) {
                    played = currentSong.getCount();
                    mostPlayed = currentSong;
                }
            }
            return mostPlayed;
        } else {
            return null;
        }
    }

//NO 9 DISPLAY ALL SONGS
    public void displaySongsInJuke() {
        for (int i = 0; i < SongList.size(); i++) {
            System.out.println(SongList.get(i).toString());
        }
    }

//FIND NO. OF SONGS
    public int findNumberOfSongs() {
        return SongList.size();
    }

}