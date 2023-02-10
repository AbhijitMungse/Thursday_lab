package com.thursdaylab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Books {

	@Id
	@Column(name = "bookId")
	private int bookId;
	private String bookName;

	@ManyToOne
	Library library;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

}
