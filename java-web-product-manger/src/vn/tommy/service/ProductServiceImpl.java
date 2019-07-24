package vn.tommy.service;

import vn.tommy.model.Product;
import vn.tommy.model.ProductEntities;

import java.lang.reflect.Array;
import java.util.*;

public class ProductServiceImpl implements ProductService {
    ProductEntities productEntities = new ProductEntities();
    List<Product> listProduct;

    public ProductServiceImpl() {
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

    @Override
    public void sortProduct() {
        Collections.sort(listProduct, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                int nameCompare = p1.getName().compareTo(p2.getName());
                if(nameCompare != 0) {
                    return nameCompare;
                }

                int producerCompare = p1.getProducer().compareTo(p2.getProducer());
                if(producerCompare != 0) {
                    return producerCompare;
                }

                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
    }

    public List<Product> search(String keyword) {
        List<Product> products = new ArrayList<>();
        listProduct.forEach((lp) -> {
            if (lp.getName().toLowerCase().contains(keyword.toLowerCase())) {
                products.add(lp);
            }
        });
        return products;
    }
}
