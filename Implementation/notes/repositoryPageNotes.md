## Repository page structure 

### package 
package com.sspstores.sspstores.repository ;

### imports 
import com.sspstores.sspstore.model.Admin;
// this will save the class data as the admin's objects 

import org.springframework.data.jpa.repository.JpaRepository;
// Spring data interface to wiill give options like save() , findbyID(), findAll() , deleteByID() without Sql 

import org.springframework.data.jpa.repository.Query;
// this is a label make for database questions such as "find all the admins called bob" 

import org.springframework.data.repository.query.Param;
// the name tag for the labels you were doing in the query 

import org.springframework.stereotype.Repository;
// this lets spring know that this page is a repository for the project 

import java.util.Optional;
// this is for the answers that do not have a yes or a no 

### class declaration and @ repository 
@Repository 
// this indicates that the page is repository 

public interface pageRepository extends JpaRepository< Admin, integer> 
interface is like a list of rules or jobs , you tell it what to do but do not do the work 
pageRepository is the name of the file 
extends JpaRepository< admin, integer > 
admin is saying what is being stored 
integer is the id number for what is being stored 

### Derived query and method 
Optional<Admin> findByAdminUsername(String Username); 

### Custom JPQL/Query 
@Query("SELECT a FROM Admin a WHERE a.adminUsername = :username")
SELECT a FROM Admin is basically telling it to go look in the admin database or where to look
a is a general object name for the thing it is looking for 
WHERE a.adminUsername = :username saying to only get the name of the username that matches the tag( :username is blank filler ) 

Optional<Admin> findByAdminUsername(@Param("username") String username );
Optional <Admin> is telling the maybe question in case there is nothing there 
findByAdminUsername you are name this variable by the thing you are looking for 
@Param("username") this is the nametag that will fill the username tag for the blank :username filler 
String username is the actual thing you are looking for 
