package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalTimeDate;


 @Entity
@Table(name = "product")

  public class Product(){

     @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
  // name , price , description
     @Column(name = "productName" ,unique = true , length = 50 , nullable = false )
     private String productName;

     @Column(name = "price", unique = true , nullable = false)
     private int price;

     @Column(name = "description", unique , nullable = false)
     private String description;

     @OneToOne(mappedBy = "product")
     private List<product> productList = new ArrayList<>();

     public Product(){}

     public Product(String productName, int price, String description) {
         this.productName = productName;
         this.price = price;
         this.description = description;

     }


     // do i need a column for the picture ??
     // do research for this question
 }