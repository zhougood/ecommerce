package com.drewryzhou.ecommerce.dao;

import com.drewryzhou.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
