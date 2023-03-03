/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;
import LibrarianArea.UserDirectory;
import LibrarianArea.UserAccount;
import LibrarianArea.Library;
/**
 *
 * @author nishipancholi
 */
public class Branch {
    String branchName;
    private Library library;
    private UserDirectory userAccountDirectory;
    
    public Branch() {
        this.userAccountDirectory=new UserDirectory();
        this.library= new Library();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public UserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public Library createLibrary(String libraryName,String location, int buildingNo) {
        Library lib = new Library();
        lib.setLibraryName(libraryName);
        lib.setLocation(location);
        lib.setBuildingNo(buildingNo);
        
        this.library=lib;
        return lib;
    }
}
