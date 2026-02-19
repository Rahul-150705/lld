package com.lib.entity;

public class Book {
	private int id;
	private String name;
	private String author;
	boolean isAvailabe;
	
	public Book(int id, String name, String author, boolean isAvailabe) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.isAvailabe = true;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailabe() {
		return isAvailabe;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAvailabe(boolean isAvailabe) {
		this.isAvailabe = isAvailabe;
	}
	
}
