package T2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderFilter {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"ali","tehran");
        Customer customer2 = new Customer(2,"reza","tehran");
        Customer customer3 = new Customer(3,"mamad","tehran");

        Category c1 = new Category(1,"cloth");
        Category c2 = new Category(2,"digital");
        Category c3 = new Category(3,"luxury");

        Product p1 = new Product(1,"computer",c2, 1000);
        Product p2 = new Product(2,"monitor",c2, 200);
        Product p3 = new Product(3,"shirt",c1, 50);
        Product p4 = new Product(4,"watch",c3, 2000);
        Product p5 = new Product(5,"mobil",c2, 800);

        Order order1 = new Order(1,customer1,p1, Date.valueOf("2022-1-15"));
        Order order2 = new Order(2,customer2,p1, Date.valueOf("2022-2-4"));
        Order order3 = new Order(3,customer2,p2, Date.valueOf("2022-4-7"));
        Order order4 = new Order(4,customer1,p3, Date.valueOf("2022-1-20"));
        Order order5 = new Order(5,customer3,p5, Date.valueOf("2022-4-20"));
        Order order6 = new Order(6,customer2,p2, Date.valueOf("2022-3-14"));
        Order order7 = new Order(7,customer3,p1, Date.valueOf("2022-1-1"));
        Order order8 = new Order(8,customer3,p4, Date.valueOf("2022-2-19"));
        Order order9 = new Order(9,customer1,p2, Date.valueOf("2022-3-25"));
        Order order10 = new Order(10,customer2,p5, Date.valueOf("2022-5-10"));

        List<Order> orderList = Arrays.asList(order1,order2,order3,order4,order5,order6,order7,order8,order9,order10);

        List<Order> filteredList = orderList
                .stream()
                .filter(o -> o.getDate().after(Date.valueOf("2022-2-1")) & o.getDate().before(Date.valueOf("2022-4-1")))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
