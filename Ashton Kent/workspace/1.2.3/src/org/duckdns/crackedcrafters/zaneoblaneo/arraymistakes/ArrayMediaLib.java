package org.duckdns.crackedcrafters.zaneoblaneo.arraymistakes;


import java.util.Random;

public class ArrayMediaLib {
    static int total = 0;
    static Random random = new Random();
    public static void main(String[] args) throws Exception{
        // object array
        Song[] topTenSongs = new Song[10];
        for(int i=0; i<10; i++) topTenSongs[i] = new Song("Song " + i, random.nextDouble()*random.nextInt(2), random.nextDouble()*random.nextInt(5));

        //for testing purposes I will manually apply a discount to songs 2, 3, 5, and 7.
        topTenSongs[1].setPrice(.99);
        topTenSongs[2].setPrice(.99);
        topTenSongs[4].setPrice(.99);
        topTenSongs[6].setPrice(.99);


        //for(int i=topTenSongs.length; i>topTenSongs.length/2; i--) System.out.println(i + "th song: " + topTenSongs[i-1].getName());

        /*if(SongFinder.findSong(topTenSongs, "Song 3") != -1){
            System.out.println("Found song: " + topTenSongs[SongFinder.findSong(topTenSongs, "Song 3")].getName() + " at index location " + SongFinder.findSong(topTenSongs, "Song 3"));
        } else {
            System.out.println("Song not found!");
        }
        */

        for(Integer i : SongFinder.getIndexLastDiscount(topTenSongs, 1)){
            System.out.println("found discount at index location " + i + " song name: " + topTenSongs[i].getName() + " price: " + topTenSongs[i].getPrice());
        }

        System.out.println("-- find last title -- ");
        int index = SongFinder.getIndexLastTitle(topTenSongs);
        if(index!=-1) System.out.println("Last title: " + topTenSongs[index].getName());
        else{System.out.println("your title is blank!");}


    }
}
