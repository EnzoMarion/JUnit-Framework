package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name; 
	private int maximumBook;
	
	// constructors
	public Person() {
		name = "unknow name";
		maximumBook = 3;
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBook() {
		return maximumBook;
	}

	public void setMaximumBook(int maximumBook) {
		this.maximumBook = maximumBook;
	}

	@Override
	public String toString() {
		return this.getName() + " (" + this.getMaximumBook() + " books)";
	}
	
}
