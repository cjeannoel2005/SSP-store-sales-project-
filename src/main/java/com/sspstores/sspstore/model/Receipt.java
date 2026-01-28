package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Receipt")
  public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name ="address", unique = false, nullable = false)
    private String address;

    @Column(name ="country", unique = false , nullable = false)
    private String country ;

    @Column(name = "state", unique = false , nullable = false , length = 50)
    private String state ;

    // different field than the ssp field of descriptions
    @Column(name = "nameOnCard", unique = false , nullable = false )
    private String nameOnCard;

    // different field than the ssp field of descriptions
    @Column(name = "shippingSpeed " , nullable = false , unique = false )
    private int shippingSpeed;

    // added field of the shippingchoice
   @Column(name ="shippingChoice", nullable = false , unique = false , length = 50 )
   private String shippingChoice;

    // different field than the ssp field of descriptions
    @Column(name = "total", nullable = false , unique = false)
    private float total;


    @OneToOne(mappedBy ="receipt")
    private List<receipt> receiptList = new ArrayList<>();

    // the setters and getters

  public String getAddress(){
    retrun address;
  }

  public String getCountry(){
   return country;
  }
  public String getState(){
   return state;
  }

  public String getNameOnCard(){
   return nameOnCard;
  }

  public int getShippingSpeed(){
   return shippingSpeed;
  }

  public String getShippingChoice(){
    return shippingChoice;
  }

  public float getTotal(){
    return total;
  }

  // the setters

  public void setAddress(String address){
    this.address = address;
  }

  public void setCountry(String country){
      this.country = country;
  }

  public void setState(String state){
    this.state = state;
  }

  public void setNameOnCard(String nameOnCard){
    this.nameOnCard = nameOnCard;
  }

  public void setShippingSpeed(int shippingSpeed){
    this.shippingSpeed = shippingSpeed;
  }

  public void setShippingChoice(String shippingChoice){
    this.shippingChoice = shippingChoice;
  }

  public void setTotal(float total){
    this.total = total;
  }
}