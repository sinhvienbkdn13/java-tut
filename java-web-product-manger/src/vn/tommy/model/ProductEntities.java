package vn.tommy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductEntities {
    private static List<Product> products;

    public ProductEntities() {
        products = new ArrayList<>();
        initData();
    }

    private void initData() {
        products.add(new Product("Monitor", 15000.00, "Monitor for desktop", "Dell"));
        products.add(new Product("Keyboard", 100.00, "Keyboard for gamer", "R8"));
        products.add(new Product("Mouse", 30.00, "Mouse for fast", "Logitech"));
        products.add(new Product("HDD", 500.00, "HDD 1TB , storage larger", "Segate"));
        products.add(new Product("RAM", 800.00, "RAM 8GB for PC", "Gskill"));
    }

    public List<Product> getListProduct() {
        return products;
    }
}
