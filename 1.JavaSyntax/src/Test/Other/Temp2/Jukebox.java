package Test.Other.Temp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox {
    private ArrayList<Song> songList = new ArrayList<>();

    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }

    public static void main(String[] args) {
        new Jukebox().go();
    }

    public void go() {
        //getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
    }
}
