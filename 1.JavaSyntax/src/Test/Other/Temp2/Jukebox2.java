package Test.Other.Temp2;

import java.util.HashSet;
import java.util.Set;

public class Jukebox2 {
    public static void main(String[] args) {
        Set<Song> songSet = new HashSet<>();
        songSet.add(new Song("ab", "b", "c", "d"));
        songSet.add(new Song("bc", "b", "c", "d"));
        songSet.add(new Song("bc", "b", "c", "d"));
        songSet.add(new Song("cd", "b", "c", "d"));

        System.out.println(songSet);
    }
}
