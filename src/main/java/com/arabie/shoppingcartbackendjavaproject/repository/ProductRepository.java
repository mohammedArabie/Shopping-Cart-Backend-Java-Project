package com.arabie.shoppingcartbackendjavaproject.repository;

import com.arabie.shoppingcartbackendjavaproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryName(String category);
    List<Product> findByBrand(String brand);

    List<Product> findByCategoryNameAndBrand(String category, String brand);
}
