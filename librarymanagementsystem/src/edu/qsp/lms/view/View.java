package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controler.Controller;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View 
{
	static Scanner myInput =new Scanner(System.in);
	static Library library = new Library();
	static Controller controller=new Controller();
	
	static 
	{
		System.out.println(">>>>>>>>>>>WELCOME TO LIBRARY MANAGEMENT SYSTEM>>>>>>>>>>>");
		
		System.out.println("Enter the Name of library : ");
		String libraryNameString=myInput.nextLine();
	
		library.setLibraryNameString(libraryNameString);
		System.out.println("Enter Address of Library : ");
		
		String libraryAddressString=myInput.nextLine();
		System.out.println("Enter pincode : ");
		
		int pincode=myInput.nextInt();

	}

	public static void main(String[] args) 
	{
		do {
			System.out.println("Select operations to perform ");
			System.out.println("1.Add Book\n2.Remove Book\n3.Update Book\n4.GetBook BY Name\n5.Get All Books\n0.Exit");
			System.out.println("Enter Digit respective to desire option : ");
			int userChoice=myInput.nextInt();
			myInput.nextLine();
			switch(userChoice) {
			case 1:
				Book book1=new Book();
				
				System.out.println("Enter the book Name : ");
				book1.setBookName(myInput.nextLine());
				
				System.out.println("Enter the book AuthorName : ");
				book1.setAuthor(myInput.nextLine());
				
				System.out.println("Enter the book Price : ");
				book1.setPrice(myInput.nextDouble());
				
				myInput.nextLine();
				
				System.out.println("Enter the book Publication : ");
				book1.setPublication(myInput.nextLine());
								
			 	controller.addBook(book1);
				break;
			case 2:
				System.out.println("Enter the book need to be removed ");
				String bookToBeRemoved=myInput.nextLine();
				boolean verifyRemoveBook=controller.removeBook(bookToBeRemoved);
				if(verifyRemoveBook)
				{
					System.out.println("Book Removed : ");
				}
				else 
				{
					System.out.println("Book Does Not Exist in the Library : ");
				}
				break;
			case 3:
				Book book3=new Book();
				System.out.println("Enter the name of book to be Updated ");
				String bookToUpdate=myInput.nextLine();
				
				book3.setBookName(bookToUpdate);
				
				System.out.println("Enter Updated Price");
				double updatedPrice=myInput.nextDouble();
				book3.setPrice(updatedPrice);
				
				if(controller.updateBookPriceByBookName(book3))
				{
					System.out.println("Book Price updated");
				}
				else {
					System.out.println("Book does not Exist in library ");
				}
				break;
			case 4:
				System.out.println("Enter book name : ");
				String bookToGet=myInput.nextLine();
				
				Book book=controller.searchBook(bookToGet);
				if(book!=null)
				{
					System.out.println("Book Available "+book);
				}
				else {
					System.out.println("Book is Not available in the library : ");
				}
				break;
	        case 5:
				
				System.out.println(controller.getAllBooks());
				

				break;
			case 0:
				myInput.close();
				System.out.println("<<<<<<<<Exited>>>>>>>>");
				System.exit(0);
				break;

			default:
				System.out.println("Enter the valid Input : ");
				break;
			}
			
		} while (true);

	}

}
