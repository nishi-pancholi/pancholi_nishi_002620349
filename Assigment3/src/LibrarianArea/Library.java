/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import Author.AuthorDirectory;
import Books.BookDirectory;
import Genres.GenreDirectory;

/**
 *
 * @author nishipancholi
 */
public class Library {
    String libraryName;
    String location;
    int buildingNo;
    private AuthorDirectory authorDirectory;
    private BookDirectory bookdirectory;
    private GenreDirectory genreDirectory;
    
    public Library() {
        this.authorDirectory=new AuthorDirectory();
        this.bookdirectory=new BookDirectory();
        this.genreDirectory= new GenreDirectory();
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public BookDirectory getBookdirectory() {
        return bookdirectory;
    }

    public void setBookdirectory(BookDirectory bookdirectory) {
        this.bookdirectory = bookdirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }
    
    
}
