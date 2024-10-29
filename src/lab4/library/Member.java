package lab4.library;

import java.util.LinkedList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private int memberId;
	private String name;
	private LinkedList<Book> borrowedBooks;
	//TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class
	public Member(int memberId, String name){
		this.memberId = memberId;
		this.name = name;
		this.borrowedBooks = new LinkedList<Book>();
	}
	public void borrowBook(Book b) {
		borrowedBooks.add(b);
	}
	public void returnBook(Book b) {
		borrowedBooks.remove(b);
	}
	public int getmemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	public LinkedList<Book> getBorrowedBooks(){
		return borrowedBooks;
	}

}
