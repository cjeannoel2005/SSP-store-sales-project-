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

    // this generates new number ids for the admins automatically
 @Id
        @GeneratedValue(stategy = GenerationType.IDENTIY)
// the variable for the id
        private int id ;

    @Column(name="adminUsername",nullable = false, unique = true)
        private String adminUsername;

   @Column(name="adminPassword",nullable = false, unique = false)
        private String adminPassword;

   // the relationhip annotation
        @OneToOne(mappedBy = "admins")
        private List <adminList> admin = new ArrayList<>();
   // after this connect the field up there to the other entities

// the empty constructor
        public Admin(){

        }

        public Admin(String adminUsername, String AdminPassword){
            this.adminUsername = adminUsername;
            this.adminPassword = adminPassword;

        }


        // the setters and getters
      public String getAdminUsername(){
            return adminUsername;
      }

      public String getAdminPassword(){
            return setAdminPassword;
      }

      /// you can add if else statament to the setters
      public void setAdminUsername(adminUsername){
            if(adminUsername = null || adminUsername.isEmpty){
                throw new RuntimeError("the admin unsername cannot be empty !!")
            }
            if(adminUsername <= 3 || adminUsername > 20 ){
                throw new RuntimeError(" error in the admin username. please correct before proceding")
            }
            else{
            this.adminUsername = newAdminUsername;}

      }

      public void setUsernamePassword(adminPassword){
            this.adminPassword = adminPassword;
      }
 }