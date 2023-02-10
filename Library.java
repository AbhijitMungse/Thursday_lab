package com.thursdaylab;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {

	@Id
	@Column(name = "library")

	private int libraryId;

	private String libraryName;

	@OneToMany(mappedBy = "library")
	private List<Books> books;

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

}
