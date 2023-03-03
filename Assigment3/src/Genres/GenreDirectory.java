/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genres;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class GenreDirectory {
    ArrayList<Genre> genrelist;
    
    public GenreDirectory() {
        this.genrelist = new ArrayList<Genre>();
    }

    public Genre createGenre(String name) {
        Genre genre=new Genre();
        genre.setGenreName(name);
        return genre;
    }
}
