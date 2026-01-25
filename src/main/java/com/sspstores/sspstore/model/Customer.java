package com.sspstores.sspstore.model;

// the imports
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

 @Entity
 @Table(name="Customer")

   public class Customer{

     @Id
      @GeneratedValue( strategy = GenerationType.IDENTITY);
       private int id;

       @Id
       @Column(name = "CustomerUsername"; nullable = false, unique = true, legnth = 50  )
      private String customerName;

       @Column(name = "CustomerPassword"; nullable = false, unique = false, length = 50 )
     private String customerPassword;

       @OnetoMany(mappedBy = "customer")
     private List<customer> Customer = new ArrayList<>;

       // the empty base class
       public Customer(){
       }

       public Customer(String customerName, String customerPassword){
           this.customerName = customerName;
           this.customerPassword = customerPassword;
       }

       // the setters and getter

       public String getCustomerName(){

           return customerName;
       }

       public String customerPassword(){

           return customerPassword;
       }

       public void setCustomerName(String customerName){

           this.customerName = customerName;
       }

       public void setCustomerPassword(String customerPassword){
           t
       his.customerPassword = customerPassword;
       }


 }