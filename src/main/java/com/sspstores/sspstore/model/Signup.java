package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Identity
@Table(name = "SignUp")

 public class Signup(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="username", unique =true , length = 50, nullable = false)
    private String username ;

    @Column(name = "password", unique = true , length = 50 , nullable = false)
    private String password;

    @Column(name = "passwordRetype", unique = false , length = 50 , nullable = false)
    private String passwordRetype;

    @Column(name = "name", unique = true , length = 50 , nullable = false)
    private String name ;


    // do the research for the relationship because it has both the onetoone and the many to many and the one to many relationship



    public SignUp(){

    }

    public SignUp(String username , String password, String passwordRetype,String name ){
        this.username = username ;
        this.password = password ;
        this.passwordRetype = passwordRetype ;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRetype() {
        return passwordRetype;
    }

}
