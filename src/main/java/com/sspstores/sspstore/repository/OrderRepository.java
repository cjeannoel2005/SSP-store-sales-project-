package com.sspstores.sspstore.repository;

import com.sspstores.sspstores.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.util.Optional;


@Repository
public interface OrderRepository extends Checkout JpaRepository< Checkout || Inventory ,String || int>{

    // find the fields
    // Checkout
    Optional findByAddress(String address);
   Optional findByCountry(String country);
    Optional findByTotal(int total);

   // inventory
    Optional findByProduct(String product);




}
