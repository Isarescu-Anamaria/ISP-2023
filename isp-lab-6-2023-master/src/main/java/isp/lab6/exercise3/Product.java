package isp.lab6.exercise3;

import java.util.Objects;

public class Product implements Comparable<Product>{
    public String name;
    public double price;

    //constructor

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
    @Override
    public int compareTo(Product o){
        return (int) (this.price - o.price);
    }
}
