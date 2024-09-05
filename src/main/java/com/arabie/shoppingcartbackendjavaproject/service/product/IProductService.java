package com.arabie.shoppingcartbackendjavaproject.service.product;

import com.arabie.shoppingcartbackendjavaproject.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product,Long id);
    List<Product> getProductsByCategory(String Category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand,String name);
    Long countProductsByBrandAndName(String brand,String name);
}
