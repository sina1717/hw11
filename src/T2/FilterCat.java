package T2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCat {
    public static void main(String[] args) {
        Category c1 = new Category(1,"cloth");
        Category c2 = new Category(2,"digital");
        Category c3 = new Category(3,"luxury");

        Product p1 = new Product(1,"computer",c2, 1000);
        Product p2 = new Product(2,"monitor",c2, 200);
        Product p3 = new Product(3,"shirt",c1, 50);
        Product p4 = new Product(4,"watch",c3, 2000);
        Product p5 = new Product(5,"mobil",c2, 800);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        List<Product> filteredProduct =  productList.stream()
                .filter(p-> p.getCategory().equals(c2))
                .collect(Collectors.toList());

        System.out.println(filteredProduct);

    }
}
