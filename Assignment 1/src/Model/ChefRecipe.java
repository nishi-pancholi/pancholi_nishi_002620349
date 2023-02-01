/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class ChefRecipe {
    String chefFirstName;
    String chefLastName;
    char userName;
    String email;
    int phoneNo;
    ArrayList<Recipe> recipeList;
    
    public ChefRecipe(){
        this.recipeList= new ArrayList<Recipe>();
    }

    public String getChefFirstName() {
        return chefFirstName;
    }

    public void setChefFirstName(String chefFirstName) {
        this.chefFirstName = chefFirstName;
    }

    public String getChefLastName() {
        return chefLastName;
    }

    public void setChefLastName(String chefLastName) {
        this.chefLastName = chefLastName;
    }

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(ArrayList<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public char getUserName() {
        return userName;
    }

    public void setUserName(char userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public Recipe createProduct(String title, int noServings,boolean glutenFree,float difficulty,int ingredientsNo, String foodCategory,String description, File recipeImg){
        
        Recipe recipeDetails=new Recipe();
        
        recipeDetails.setTitle(title);
        recipeDetails.setNoServings(noServings);
        recipeDetails.setGlutenFree(glutenFree);
        recipeDetails.setDifficulty(difficulty);
        recipeDetails.setIngredientsNo(ingredientsNo);
        recipeDetails.setFoodCategory(foodCategory);
        recipeDetails.setDescription(description);
        recipeDetails.setRecipeImg(recipeImg);
        
        this.recipeList.add(recipeDetails);
        
        return recipeDetails;
        
        
    }
    
    public Recipe findProduct(String recipeTitle){
        
        for(Recipe rec:this.recipeList){
            if(rec.getTitle() == recipeTitle){
                return rec;
            }
        }
        return null;
        
        
    }
    
}
