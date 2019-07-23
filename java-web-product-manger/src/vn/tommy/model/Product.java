package vn.tommy.model;

public class Product {
    private static int prodIdIncrement = 0;
    private int id;
    private String name;
    private double price;
    private String description;
    private String producer;

    public Product() {
        setId(prodIdIncrement++);
    }

    public Product(String name, double price, String description, String producer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
        setId(prodIdIncrement++);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
