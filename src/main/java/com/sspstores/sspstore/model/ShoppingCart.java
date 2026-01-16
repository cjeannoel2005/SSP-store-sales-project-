package com.sspstores.sspstore.model;


@Entity
@Table(name="Shapping Cart")
  public class ShoppingCart {

            //product is a foreign key here Pk in inventory
    String product ;
    int quantity;
    int totalItemInCart;
  }