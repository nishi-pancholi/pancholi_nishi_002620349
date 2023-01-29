/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    ArrayList<Product> productList;
    Customer customer;
    
    public DeliveryPackage(){
        this.productList= new ArrayList<Product>();
        this.customer=new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Product createProduct(int productId, String productName, double price){
        
        Product product=new Product();
        
        product.setProductId(productId);
        product.setProdName(productName);
        product.setProdPrice(price);
        
        this.productList.add(product);
        
        return product;
        
        
    }
    
    public Product findProduct(int productId){
        
        for(Product prod:this.productList){
            if(prod.getProductId() == productId){
                return prod;
            }
        }
        return null;
        
        
    }
   
}
