package zaneoblaneo.mediaLib;

import java.util.Hashtable;
public class MediaLib {
	
	 static Hashtable<Integer, Song> Songs = new Hashtable<Integer, Song>();
	 static Hashtable<Integer, Book> Books = new Hashtable<Integer, Book>();
	 static Hashtable<Integer, Movie> Movies = new Hashtable<Integer, Movie>();
	 static Hashtable<Integer, Game> Games = new Hashtable<Integer, Game>();
	 
	public static void MediaLibInit(){
		Songs.put(Songs.size()+1,  new Song("Turn The Page", 10f, .99f));
		Movies.put(Movies.size()+1,  new Movie("E.T.", 7.7f, 59.99f));
		Movies.put(Movies.size()+1,  new Movie("Harry Potter, and the deatly hallows part 2", 6.5f, 60f));
		Games.put(Games.size()+1, new Game("No Man's Sky", 9.999f, 59.99f));
		Books.put(Books.size()+1, new Book("Eragon", 7.5f, 20f));
//		Usage: Dictionary.put(Dictionary.size()+1, new Type("Name", ratingf, pricef));

		
		}

	public static void MediaLibRead(){
		float tCost = 0.0f;
		int tCount=0;
		System.out.println("Songs:");
		if (Songs.size()!=0) {
			for (int i = 1; i <= Songs.size(); i++) {
				Song song = Songs.get(i);
				System.out.println("\t• " + song.title + "\n\t\t• Rating: " + song.rating + "\n\t\t• Cost: " + song.price);
				tCost+=song.price;
				tCount++;
			} 
		} else {
			System.out.println("\tNo Songs to display!");
		}
		System.out.println("Books:");
		if (Books.size()!=0) {
			for (int i = 1; i <= Books.size(); i++) {
				Book book = Books.get(i);
				System.out.println("\t• " + book.title + "\n\t\t• Rating: " + book.rating + "\n\t\t• Cost: " + book.price);
				tCost+=book.price;
				tCount++;
				} 
			} else{
				System.out.println("\tNo Books to display!");
			}
		System.out.println("Movies:");
		if (Movies.size()!=0) {
			for (int i = 1; i < Movies.size(); i++) {
				Movie movie = Movies.get(i);
				System.out.println("\t• " + movie.title + "\n\t\t• Rating: " + movie.rating + "\n\t\t• Cost: " + movie.price);
				tCost+=movie.price;
				tCount++;
			} 
		} else{
			System.out.println("\tNo Movies to display!");
		}
		System.out.println("Games:");
		if (Games.size()!=0) {
			for (int i = 1; i <= Games.size(); i++) {
				Game game = Games.get(i);
				System.out.println("\t• " + game.title + "\n\t\t• Rating: " + game.rating + "\n\t\t• Cost: " + game.price);
				tCost+=game.price;
				tCount++;
			} 
		}
		else{
			System.out.println("\tNo Games to display!");
		}
		float aCost = tCost/tCount;
		System.out.println("Total Cost: " + tCost + "\nTotal Count: " + tCount + "\nAverage Price: " + aCost );
		
		
		
		
	}
}
