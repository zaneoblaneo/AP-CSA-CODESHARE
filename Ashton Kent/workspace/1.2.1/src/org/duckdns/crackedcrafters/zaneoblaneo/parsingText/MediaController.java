package org.duckdns.crackedcrafters.zaneoblaneo.parsingText;

import java.util.ArrayList;

public class MediaController {
	
	public static void main(String[] args) {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		
		songs.add(new Song("Song #1", 1, 0.99));
		songs.add(new Song("Song #2", 4, 0.98));
		songs.add(new Song("Song #3", 12, 0.97));
		//songs.add(new Song("SONGNAME", RATING, PRICE


		for(Song song : songs){
			MediaWriter.write(song.getName() + "," + song.getRating() + "," + song.getPrice() + ",\n");
		}
		
		String text[] = MediaWriter.read().split(",");

        System.out.println("SONGS:\n\t");
		for(int i = 0; i < text.length; i += 3){
			System.out.println("• " + text[i] + "\n\t\trating " + text[i + 1] + "\n\t\tprice: " + text[i + 2]);
		}
		
		
		

	}

}
