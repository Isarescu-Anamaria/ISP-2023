package isp.lab6.exercise3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;

public class OnlineStore {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Double> costs = new ArrayList<>();
    private HashMap<String, ActiveSession> sessions = new HashMap<>();

    //methods

    public ArrayList<Product> getProducts() {
        return products;
    }
    public ArrayList<Product> getProductsSorted() {

        Collections.sort(products);
        for(Product p: products)
            System.out.println(p);

        return products;
    }
    protected boolean addSession(String username){

        boolean var = false;
        for(ActiveSession as:sessions.values())
            if ((as.getUsername().equals(username))) {
                var = true;
            }
        if(var == false){
            ActiveSession ac = new ActiveSession(username);
            sessions.put(username,ac);
            System.out.println("An session was added by: " + username);
        }
        else{
            System.out.println(username + " already have a session");
        }
        return var;
    }
    protected void removeSession(String username){
        sessions.remove(username);
        System.out.println(username + " session is ended");
    }
    public void addToCart(String username,Product product,int quantity){

        products.add(product);
        double cost = product.price * quantity;
        costs.add(cost);
        if(quantity > 1) {
            System.out.println(quantity + " items of " + product.name + " was added to the cart.Total cost: " + cost);
        }
        else {
            System.out.println(quantity + " item of " + product.name + " was added to the cart.Total cost: " + cost);
        }
    }

    public void checkout(String username){
        double totalCost = 0;
        for(double c : costs)
            totalCost += c;
        System.out.println("Total cost of the chart: " + totalCost);

    }
}
