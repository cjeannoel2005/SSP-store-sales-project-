package com.sspstores.sspstore.model;

@Entity
@Table(name="SalesReport")

 public class SalesReport{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int Id

   @Column(name = "product", nullable = false , unique = false , length = 50)
   private String product;

   @Column(name ="amountInInventory ", nullable = false )
   private int amountInInventory ;

   @Column(name = "amountSold", nullable = false )
   private int amountSold ;

   // find the relation structure for this part of the
   @ManyToMany
}