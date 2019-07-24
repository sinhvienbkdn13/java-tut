package vn.tommy.service;

import vn.tommy.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void create(Product product);

    Product findById(int productId);

    void update(int productId, Product product);

    void delete(int productId);

    void sortProduct();
}
