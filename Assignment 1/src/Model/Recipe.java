/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;

/**
 *
 * @author nishipancholi
 */
public class Recipe {
    String title;
    int noServings;
    boolean glutenFree;
    float difficulty;
    int ingredientsNo;
    String foodCategory;
    String description;
    File recipeImg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoServings() {
        return noServings;
    }

    public void setNoServings(int noServings) {
        this.noServings = noServings;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public int getIngredientsNo() {
        return ingredientsNo;
    }

    public void setIngredientsNo(int ingredientsNo) {
        this.ingredientsNo = ingredientsNo;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getRecipeImg() {
        return recipeImg;
    }

    public void setRecipeImg(File recipeImg) {
        this.recipeImg = recipeImg;
    }
    
}
