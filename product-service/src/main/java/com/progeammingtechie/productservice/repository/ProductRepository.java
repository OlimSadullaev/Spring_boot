package com.progeammingtechie.productservice.repository;

import com.progeammingtechie.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String>{
}
