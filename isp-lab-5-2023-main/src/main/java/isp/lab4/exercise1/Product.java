package isp.lab4.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;

    //constructor

    public Product(String productId, String name, double price, Customer customer) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.customer = customer;
    }

    //methods

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", customer=" + customer +
                '}';
    }
}
