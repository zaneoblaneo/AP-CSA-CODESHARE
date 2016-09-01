package zaneoblaneo.mediaLib;

public class Book{
	float rating = 0f;
	String title = "";
	float price = 0f;
	public Book(String title, float rating, float price) {
		setRating(rating);
		setTitle(title);
		setPrice(price);
		MediaLib.Books.put(MediaLib.Books.size()+1, this);
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
