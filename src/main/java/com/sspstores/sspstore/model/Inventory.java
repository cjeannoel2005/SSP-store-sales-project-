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

     @OneToOne(mappedBy = "Inventory")
     private List<inventory> inventoryList = new ArrayList<>;

     public Inventory(){}

     public Inventory(String product, String search){
         this.product = product;
         this.search = search;
     }

     // the setters and getters
     // do research to see if the search variable needs setters and getters

     public String getProduct(){
         return product;
     }

     public void setProduct(String product){
         this.product = product;
     }

 }

