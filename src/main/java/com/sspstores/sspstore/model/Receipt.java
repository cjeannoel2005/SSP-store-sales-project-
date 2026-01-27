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
    private String shippingSpeed;

    // different field than the ssp field of descriptions
    @Column(name = "total", nullable = false , unique = false)
    private float total;


    @OneToOne(mappedBy ="receipt")
    private List<receipt> receiptList = new ArrayList<>();

    // the setters and getters

}