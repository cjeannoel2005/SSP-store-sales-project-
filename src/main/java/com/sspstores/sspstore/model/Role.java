package com.sspstores.sspstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalTimeDate;

@Entity
@Table(name ="Roles")


 public class Role (){

    @Id
    @GeneratedValue(strategy = GenerationType.ENTITY)
    private long id;
}
