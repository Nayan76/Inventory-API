package com.example.inventory.inventory_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    // Spring Data JPA provides all the necessary CRUD methods for you,
    // so no additional code is needed here for basic functionality.
    // For example, you get:
    // - save(product)
    // - findById(id)
    // - findAll()
    // - deleteById(id)
}