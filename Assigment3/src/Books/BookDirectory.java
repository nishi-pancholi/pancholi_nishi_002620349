/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

import Author.Author;
import Customer.Customer;
import Genres.Genre;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nishipancholi
 */
public class BookDirectory {
    ArrayList<Book> booklist;
    
    public BookDirectory() {
        this.booklist = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }
    
    public Book createBook(String name, Date registrationDate, boolean isAvailable,int pagesNo, String bindingType, String language, Author author, Genre genre ) {
        Book book=new Book();
        book.setIsAvailable(isAvailable);
        book.setName(name);
        book.setRegistrationDate(registrationDate);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setBindingType(bindingType);
        book.setLanguage(language);
        book.setPagesNo(pagesNo);
        
        this.booklist.add(book);
        return book;
    }
}
