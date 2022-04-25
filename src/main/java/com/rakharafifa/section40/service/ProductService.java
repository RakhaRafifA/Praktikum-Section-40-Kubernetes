package com.rakharafifa.section40.service;

import java.util.List;

import com.rakharafifa.section40.entity.Product;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product createProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
