package com.sspstores.sspstore.model;

@Entity
@Table(name="SalesReport")

 public class SalesReport{
    private String product;
    private int amountInInventory;
    private int amountSold;
}