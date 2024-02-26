package isp.lab6.exercise3;

import java.util.HashMap;

import java.util.Scanner;
public class ActiveSession {
    private String username;
    private HashMap<Product, Integer> shoppingCart = new HashMap<>();

    //constructor

    public ActiveSession(String username) {
        this.username = username;
    }
    //methods

    public String getUsername() {
        return username;
    }

    public HashMap<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }
    public void addToCart(Product product,int quantity){

        System.out.println(product.name + "was added to your cart");
        double cost = product.price * quantity;
        System.out.println("Total cost of the product: " + cost);
    }
}
