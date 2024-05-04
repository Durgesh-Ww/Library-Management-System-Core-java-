package edu.qsp.lms.model;

import java.util.List;

public class Library 
{
	private String libraryNameString;
	private String libraryStringAddress;
	private int pincode;
	
	private List<Book> books;

	public String getLibraryNameString() {
		return libraryNameString;
	}

	public void setLibraryNameString(String libraryNameString) {
		this.libraryNameString = libraryNameString;
	}

	public String getLibraryStringAddress() {
		return libraryStringAddress;
	}

	public void setLibraryStringAddress(String libraryStringAddress) {
		this.libraryStringAddress = libraryStringAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [libraryNameString=" + libraryNameString + ", libraryStringAddress=" + libraryStringAddress
				+ ", pincode=" + pincode + "]";
	}
	
	

}
