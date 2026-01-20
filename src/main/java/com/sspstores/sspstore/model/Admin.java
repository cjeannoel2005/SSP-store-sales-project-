package com.sspstores.sspstore.model;

@Entity
@Table((name="Admins")
 public class Admin{

 @Id
        @GeneratedValue(stategy = GenerationType.IDENTIY)

    @Column(name="adminUsername",nullable = false, unique = true)
        private String adminUsername;

   @Column(name="adminPassword",nullable = false, unique = false)
        private String AdminPassword;

   // after this connect the field up there to the other entities
 }