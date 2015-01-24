package com.wgh;

public class Book {
	private int id;
	private String name;
	private Double price;
	private int bookCount;
	private String author;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
}
