package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	Library library = new Library();
	
	
	public void addBook(String title, String author) {
		library.addBook(title,author);
		
	}
	
     public void borrowBook(Member member, Book book) {
		
		
	}
     
     public void returnBook(Member member, Book book) {
 		
 	}
     
     
     public void addMember() {
    	 
     }
     
     
     public void showMembers() {
    	 
     }
	 
     
	public Book findBook(String title) {
		
	}
    
    public Member findMemmber(int memberID) {
    	library.findMember(memberID);
    	
    }
	
	
	
	
	
	
	
	
    //Show Members method
	//Show available Books
	//Find 
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class

}
