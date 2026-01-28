### Model page notes 

#### 1.The packages 

package com.sspstores.sspstore.model;

#### 2. The imports 

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set; 
import java.time.LocalDateTime ;

#### 3.The class anotation 

@Entity 
@Table(name= " " ) 


// create the class before this part 
  public class ****(){}
#### 4.The primary key and fields

@Id 
@GenerateValue(strategy = GenerationType.IDENTITY) 
private long/int id; 

@Column(name = "", unique = true/false , nullable = , length = )

#### 5.The relationship of the tables 
// OnetoOne 
  
// OnetoMany

// Manytoone 

// ManyToMany 

#### the classes ? 

-the empty class 

 public ********** (){
 }

- the class with the fields in the columns
public ************ (String  *** , int **** ){
  this.***** = ******;
  this.***** = ******;

}

#### the getters and setters 

- the getters
  public int get*****(){
  return ****}

-the setters 
  public void set*****(){
    this.**** = ****;
    }



