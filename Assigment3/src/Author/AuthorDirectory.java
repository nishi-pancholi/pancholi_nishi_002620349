/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class AuthorDirectory {
    ArrayList<Author> authorlist;
    
    public AuthorDirectory() {
        this.authorlist = new ArrayList<Author>();
    }

    public Author createAuthor(String name) {
        Author auth=new Author();
        auth.setAuthorName(name);
        return auth;
    }
}
