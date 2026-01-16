package com.sspstores.sspstore.model;

@Entity
@Table(name="Checkout");

  public class Checkout{

      private String address;
      private String Country;
      private String state;
      private String zipCode;
      private String nameOnCard;
      private double cardNumber;
      private int csv;
      private int expirationDate;
      private String shippingSpeed;
      private int totalPriceOfItems;
      private float tax;
      private int shippingOption;
      private int total;

  }