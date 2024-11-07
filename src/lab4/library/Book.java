package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable; 
	
	// Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true; 
	}
	
	// Gets
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	// Setters not needed 
	
	
	// TODO: implement Book functionality 
	public void borrow() {
		isAvailable = false; 
	}
	
	public void returned() {
		isAvailable = true;
	}
	public boolean getAvailabilty() {
		return this.isAvailable;
	}
	

}
