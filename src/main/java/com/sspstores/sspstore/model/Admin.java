// packages tell the proram the location and type of file
package com.sspstores.sspstore.model;

// imports for the database
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

// naming the db table admins
@Entity
@Table((name="Admins")
 public class Admin{

 @Id @GeneratedValue(stategy = GenerationType.IDENTIY)

    @Column(name="adminUsername",nullable = false, unique = true)
        private String adminUsername;

   @Column(name="adminPassword",nullable = false, unique = false)
        private String AdminPassword;

   // after this connect the field up there to the other entities

 }