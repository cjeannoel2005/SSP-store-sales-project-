package com.sspstores.sspstore.model;

@Entity
@Table(name="SalesReport")

 public class SalesReport{
    @Id
    private String product;
    @Id
    private int amountInInventory;
    @Id
    private int amountSold;
}