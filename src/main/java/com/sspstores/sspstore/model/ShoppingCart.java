package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Shopping Cart")
  public class ShoppingCart {

  @Id
          @GeneratedValue( strategy = GenerationType.IDENTITY )
           private int Id;

            //product is a foreign key here Pk in inventory
          @Column(name ="product", unique = false, length = 50, nullable = false)
          private String product;

         @Column(name = "quantity", unique = false , nullable = false)
                 private int quantity;

         @Column(name = "totalItemInCart", unique = false , nullable = false )
                 private int totalItemInCart;

         @OneToOne(mappedby = "Shopping Cart")
        private List<shoppingCart> shoppingCarts = new ArrayList<>();

         public ShoppingCart() {}

       public ShoppingCart(String product, int quantity, int totalItemInCart) {
           this.product = product;
           this.quantity = quantity;
           this.totalItemInCart = totalItemInCart;
       }

       public String getProduct() {
           return product;
       }

       public int getQuantity(){

             return quantity;
       }

       public int getTotalItemInCart(){

             return totalItemInCart;
       }

       public void setProduct(String product){
           this.product = product;
       }

       public void setQuantity(int quantity){
           this.quantity = quantity;
       }

       public void setTotalItemInCart(int totalItemInCart){
           this.totalItemInCart = totalItemInCart ;
       }



  }