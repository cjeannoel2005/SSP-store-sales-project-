package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Login")

 public class Login{

 @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
 private int Id;

 @Id
 @Column(name = "Username"; nullable = false)
 private String Username ;

 @Column(name = "Password"; nullable = false)
 private String Password;

 // the signup button should be here can shoule a bit in datatype

 @ManyToMany(mappedBy = "login")
  private list<login> loginList = new ArrayList<>;

 public Login(){}

 public Login(String username , String password){
  this.username = username;
  this.Password = password;
 }

 // the setters and getters

 public String getUsername(){
  return Username;
 }
  public String getPassword(){
  return Password;
  }

  public void setUsername(String username){
  Username = username;
  }

  public void setPassword(String password){
  Password = password;

  }

}