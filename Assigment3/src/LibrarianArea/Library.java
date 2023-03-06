/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import Author.AuthorDirectory;
import Books.BookDirectory;
import General.MagazineDirectory;
import Genres.GenreDirectory;

/**
 *
 * @author nishipancholi
 */
public class Library {
    private static int count = 0;
    String libraryID;
    String libraryName;
    String location;
    int buildingNo;
    private AuthorDirectory authorDirectory;
    private BookDirectory bookdirectory;
    private GenreDirectory genreDirectory;
    private EmployeeDirectory employeeDirectory;
    private MagazineDirectory magazineDirectory;
    
    public Library() {
        this.authorDirectory=new AuthorDirectory();
        this.bookdirectory=new BookDirectory();
        this.genreDirectory= new GenreDirectory();
        this.employeeDirectory=new EmployeeDirectory();
        this.magazineDirectory= new MagazineDirectory();
        this.count++;
        
        this.libraryID = "LibraryNo"+this.count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Library.count = count;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
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

    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }
    
    @Override
    public String toString() {
       return this.libraryID;
    }
    
}
