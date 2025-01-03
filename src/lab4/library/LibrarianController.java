package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	Library library = new Library();
	
	
	public void addBook(String title, String author) {
		library.addBook(title,author);
		
	}
	
     public void borrowBook(String title, int memberID) {
		library.borrowBook(title,memberID);
		
	}
     
     public void returnBook(String title, int memberID) {
 		library.returnBook(title,memberID);
 		
 	}
     
     
     public void addMember(int memberID,String name) {
    	 library.addMember(memberID,name);
    	 
     }
     
     
     public String showMembers() {
    	String s =  library.showMembers();
    	return s;
    	 
     }
	 
     public String showAvailableBooks() {
    	 String s = library.showAvailableBooks();
    	 return s;
     }
     
	public Book findBook(String title) {
		Book b = library.findBook(title);
		return b;
		
	}
    
    public Member findMember(int memberID) {
         Member m  = library.findMember(memberID);
        	 return m; 
         }
    	
    public void removeBook(String title) {
    	Book b = library.findBook(title);
    	library.removeBook(b);
    	
    }
    public void removeMember(int memberID) {
    	Member m = findMember(memberID);
    	removeMember(memberID);
    	
    }
 
   
	
	
	
	
	
	
	
    //Show Members method
	//Show available Books
	//Find 
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class

}
