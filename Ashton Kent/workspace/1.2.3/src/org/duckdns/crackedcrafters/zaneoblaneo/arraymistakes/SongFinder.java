package org.duckdns.crackedcrafters.zaneoblaneo.arraymistakes;

import java.util.ArrayList;

public class SongFinder {
    public static int findSong(Song[] songs, String targetName) {

        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getName().equals(targetName)) {
                return i;
            }
        }
    return -1;
    }

    public static ArrayList<Integer> getIndexLastDiscount(Song[] songs, double compare){
        if(songs==null) return null;

        ArrayList<Integer> found = new ArrayList<Integer>();
        for(int i=songs.length-1; i>=0; i--){
            if(songs[i].getPrice()<compare){
                found.add(i);
            }
        }

        return found;
    }

    public static int getIndexLastTitle(Song[] songs){
        int i;
        if(songs==null) return -1;
        for(i=0; i<songs.length-1; i++){
            if(songs[i].getName()=="") return -1;
        }
        return i;
    }
}
