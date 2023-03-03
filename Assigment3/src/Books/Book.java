/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

import Author.Author;
import Genres.Genre;
import Materials.Material;

/**
 *
 * @author nishipancholi
 */
public class Book extends Material{
    private Author author;
    private Genre genre;
    int pagesNo;
    String bindingType;
    String language;
    
    public Book(){
        super();
        this.author=new Author();
        this.genre=new Genre();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPagesNo() {
        return pagesNo;
    }

    public void setPagesNo(int pagesNo) {
        this.pagesNo = pagesNo;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}
