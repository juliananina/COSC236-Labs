package lab4.library;

import java.util.LinkedList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)
	private LinkedList<Book> catalog = new LinkedList<Book>();
	private LinkedList<Member> members = new LinkedList<Member>();

	// TODO: implement functionality of Member class
	public void addBook(String title, String author) {
		Book b = new Book(title, author);
		catalog.add(b);
	}

	public Member findMember(int memberID) {
		for (Member m : members) {
			if (m.getmemberId() == memberID) {
				return m;
			}
		}
		return null;
	}

	public Book findBook(String title) {
		for (Book b : catalog) {
			if (b.getTitle() == title) {
				return b;
			}
		}
		return null;
	}

	public void borrowBook(String title, int memberID) {
		Member m = findMember(memberID);
		Book b = findBook(title);
		m.borrowBook(b);
	}

	public void returnBook(String title, int memberID) {
		Member m = findMember(memberID);
		Book b = findBook(title);
		m.returnBook(b);;
	}

	public void addMember(int memberID, String name) {
		members.add(new Member(memberID, name));
	}

	public String showMembers() {
		String output = "";
		for (Member m : members) {
			output += m.getName() + " (" + m.getmemberId() + ")\n";
		}
		return output;
	}

	public String showAvailableBooks() {
		String output = "";
		for (Book b : catalog) {
			if(b.getAvailabilty())
			output += b.getTitle() + " by: " + b.getAuthor() + "\n";
		}
		return output;
	}

	public void removeBook(Book b) {
		catalog.remove(b);
	}

	public void removeMember(Member m) {
		members.remove(m);
	}
}
