package T2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCheep {
    public static void main(String[] args) {
        Category c1 = new Category(1,"cloth");
        Category c2 = new Category(2,"digital");
        Category c3 = new Category(3,"luxury");

        Product p1 = new Product(1,"computer",c2, 1000);
        Product p2 = new Product(2,"monitor",c2, 200);
        Product p3 = new Product(3,"shirt",c1, 50);
        Product p4 = new Product(4,"watch",c3, 2000);
        Product p5 = new Product(5,"mobil",c2, 800);

        List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);

        Product lowPrice = productList
                .stream()
                .filter(p -> p.getCategory().equals(c2))
                .collect(Collectors.toList())
                .stream()
                .min(Comparator.comparing(Product::getPrice))
                .get();

        System.out.println(lowPrice);

    }
}
