package isp.lab4.exercise1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Exercise1 {

    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
       // System.out.println("The order was placed at: " + datetime1);
        Address address1 = new Address("East Way","Westville");
        Customer customer1 = new Customer("75","Elisabeta Athol","1234567890",address1);
        Product product1 = new Product("23","samsung s23",4500.00,customer1);
        product1.setProductCategory(ProductCategory.ELECTRONICS);
        Order order1 = new Order("56",datetime1);
        order1.setProduct(product1);

        order1.setNumberOfProducts(order1.getNumberOfProducts() + 1);
        Product product2 = new Product("15","teddy bear",55.99,customer1);
        product2.setProductCategory(ProductCategory.TOYS);
        order1.setProduct(product2);

        order1.setTotalPrice();
        String s1 = order1.toString();
        System.out.println(s1);

    }
}
