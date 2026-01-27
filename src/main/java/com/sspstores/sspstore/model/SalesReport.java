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

  public salesReport(){

   }
   public salesReport(String product, int amountInInventory, int amountSold){
     this.product = product;
     this.amountInInventory = amountInInventory;
     this.amountSold = amountSold;
   }

   // the setters and getters
  public String getProduct(){
    return product;
  }

  public int amountInInventory(){
     return amountInInventory;
  }

  public int amountSold(){
     return amountSold;
  }

  public void setProduct(String product){
     this.product = product;
  }

  public void setAmountInInventory(int amountInInventory){
     this.amountInInventory = amountInInventory;
  }

  public void setAmountSold(int amountSold){
     this.amountSold = amountSold;
  }
}