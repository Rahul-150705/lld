package com.lib.entity;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	private List<Book> borrowedBooks = new ArrayList<>();
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public List<Book> getBorrowedBooks() { return borrowedBooks; }
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
	public void showLibraryStatus() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
