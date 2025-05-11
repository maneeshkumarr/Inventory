package com.inventory.management.repository;

import com.inventory.management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // This interface automatically provides CRUD methods for saving, retrieving, updating, and deleting products
}
