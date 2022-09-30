package com.question1;

public class Book implements Comparable<Book> {

	int bookId ;
	String bookName;
	String author ;
	
	public Book() {
	}

	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}



	@Override
	public int compareTo(Book b) {
		

		if(this.bookId>b.bookId) {
			return +1;
			}
		else if(this.bookId<b.bookId) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	

	
}
