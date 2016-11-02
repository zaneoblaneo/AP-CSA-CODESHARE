package org.duckdns.crackedcrafters.zaneoblaneo.top40;


import java.util.Random;

public class ArrayMediaLib {
    final static String[] SHARINGFRIENDS = {"friend 0", "friend 1", "friend 2", "friend 3", "friend 4"};
    final static int[] DAYSBETWEENPURCHASES = {2,5,1,2,4,2,1,3};
    static int total = 0;
    static Random random = new Random();
    public static void main(String[] args) throws Exception{
        // normal for loop
        for(int i=0; i<5; i++){
            System.out.println(SHARINGFRIENDS[i]);
        }


        // normal foreach loop
        for(int x:DAYSBETWEENPURCHASES){
            total+=x;
        }
        System.out.println("average = " + total/DAYSBETWEENPURCHASES.length);

        // object array
        Song[] topTenSongs = new Song[10];
        for(int i=0; i<10; i++) topTenSongs[i] = new Song("Song " + i, random.nextDouble(), random.nextDouble()*random.nextInt(5));
        for(Song s : topTenSongs){
            s.setName(String.valueOf("Song " + random.nextInt(100)));
            System.out.println(s.getName());
        }
        for(int i=topTenSongs.length; i>topTenSongs.length/2; i--) System.out.println(i + "th song: " + topTenSongs[i-1].getName());




    }
}
