package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Checkout");

  public class Checkout{
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;

      @Column(name ="address", unique = true, nullable = false , length = 50)
      private String address;

      // different unique valie than the ssp field of description
      @Column(name = "country", unique = false, length = 100 , nullable = false)
      private String country;

      @Column(name = "state", unique = false , length = 100 , nullable = false)
      private String state;

      // different unique value from the ssp field of description
      @Column(name = "zipCode", unique = false, nullable = false )
      private int  zipCode;

      // different unique field than the ssp field of description
      @Column(name = "nameonCard", length = 100, unique = false, nullable = false)
      private String nameOnCard;

      @Column(name = "cardNumber", nullable = false)
      private int cardNumber;

      @Column(name = "csv", nullable = false)
      private int csv;

      @Column(name ="expirationDate", nullable = false)
      private int expirationDate;

      @Column(name ="shippingSpeed", nullable = false, length = 100 )
      private String shippingSpeed;

      @Column(name = "totalPriceOfItems" , nullable = false )
      private int totalPriceOfItems;

      @Column(name ="tax", nullable = false )
      private float tax;

      @Column(name = "shippingOption", nullable = false)
      private int shippingOption;

      @Column(name = "total", nullable = false , unique = true )
      private int total;

      @OneToOne(mappedBy = "checkout");
      private List<checkout> checkouts = new ArrayList<>();

      public Checkout(){}

      public Checkout(String address, String country, int zipCode, String nameOnCard,
                      int csv, int experirationDate, String ShippingSpeed, int totalPriceOfItems, float tax, int shippingOption, int total) {
          this.address = address;
          this.country = country;
          this.zipCode = zipCode;
          this.nameOnCard = nameOnCard;
          this.csv = csv;
          this.shippingSpeed = ShippingSpeed;
          this.totalPriceOfItems = totalPriceOfItems;
          this.tax = tax;
          this.shippingOption = shippingOption;
          this.total = total;

      }
  }