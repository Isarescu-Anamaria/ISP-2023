package isp.lab4.exercise1;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Product product[] = new Product[10];
    private double price[] = new double[10];
    private int numberOfProducts = 0;
    //constructor

    public Order(String orderId, LocalDateTime date) {
        this.orderId = orderId;
        this.date = date;
    }

    //methods

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = 0.00;
        for(int i = 0; i <= numberOfProducts; i++) {
            this.totalPrice += product[i].getPrice();
        }
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product[numberOfProducts] = product;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", product=" + Arrays.toString(product) +
                '}';
    }

}
