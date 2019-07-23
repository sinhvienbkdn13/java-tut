package vn.tommy.service;

import vn.tommy.model.Product;
import vn.tommy.model.ProductEntities;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductEntities productEntities = new ProductEntities();
    List<Product> listProduct;

    public ProductServiceImpl(){
        listProduct = productEntities.getListProduct();
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void create(Product product) {
        listProduct.add(product);
    }

    @Override
    public Product findById(int productId) {
        return listProduct.get(productId);
    }

    @Override
    public void update(int productId, Product product) {
        listProduct.set(productId, product);
    }

    @Override
    public void delete(int productId) {
        listProduct.remove(productId);
    }

    public List<Product> search(String keyword) {
        List<Product> products = new ArrayList<>();
        listProduct.forEach((lp) -> {
            if(lp.getName().equals(keyword)){
                products.add(lp);
            }
        });

        return products;
    }
}
