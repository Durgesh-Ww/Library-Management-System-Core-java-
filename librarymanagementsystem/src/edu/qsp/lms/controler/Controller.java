package edu.qsp.lms.controler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class Controller 
{
	private Library library=new Library();

	public void addBook(Book book)
	{
		List<Book>books=library.getBooks();

		if (books==null) 
		{
			books=new ArrayList<>();
			library.setBooks(books);
		}
		books.add(book);
	}
	
	public Book searchBook(String bookName)
	{
		List<Book>books=library.getBooks();
		Iterator<Book>iterator=books.iterator();
		while (iterator.hasNext()) 
		{
			Book book = (Book) iterator.next();
			if (book.getBookName().equalsIgnoreCase(bookName)) {
				return book;
			}
		}
		return null;	
	}
	
	public boolean removeBook(String bookName)
	{
	 Book book=searchBook(bookName);
		if(book!=null)
		{
			List<Book> books=library.getBooks();
			books.remove(book);
			return true;
		}
		return false;	
	}
	
	public boolean updateBookPriceByBookName(Book refBook)
	{
	Book book=searchBook(refBook.getBookName());
	if(book!=null)
	{
		book.setPrice(refBook.getPrice());
		return true;
	}
	return false;
		
	}
	
//	public List<Book> getAllBooks()
//	{
//		return library.getBooks();
//	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return library.getBooks();
	}

	

	

}
