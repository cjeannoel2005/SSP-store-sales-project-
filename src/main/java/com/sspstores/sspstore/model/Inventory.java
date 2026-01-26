package com.sspstores.sspstore.model;

 import javax.persistence.*;
 import java.util.HashSet;
 import java.util.Set;

 @Entity
@Table(name= "Inventory")
 public class Inventory(){

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

     @Column(name = "product", length = 50 , nullable = false , unique = false )
     private String product;

     @Column(name = "search", length = 50 , nullable = false, unique = false )
     private String search ;

     @Column(name ="description", unique = true, length = 150 , nullable = false)
     private String description ;

     @Column(name = "price", unique = true , nullable = false , length = 100)
     private int price;

     @OneToOne(mappedBy = "Inventory")
     private List<inventory> inventoryList = new ArrayList<>;

     public Inventory(){}

     public Inventory(String product, String search, String description, int price){
         this.product = product;
         this.search = search;
         this.description = description;
         this.price = price;
     }

     // the setters and getters
     // do research to see if the search variable needs setters and getters

     public String getProduct(){
         return product;
     }

     public String getDescription(){
         return description;
     }

     public int getPrice(){
         return price;
     }

     public void setProduct(String product){
         this.product = product;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public void setPrice(int price){
         this.price = price;
     }

 }

