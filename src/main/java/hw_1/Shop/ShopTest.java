package hw_1.Shop;

import java.util.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
  1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
  2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
  3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
  */

    public static void main(String[] args) {
        Product bread = new Product();
        bread.setCost(30);
        bread.setTitle("bread");

        Product water = new Product();
        water.setCost(60);
        water.setTitle("water");

        Product milk = new Product();
        milk.setCost(40);
        milk.setTitle("milk");

        Product vine = new Product();
        vine.setCost(500);
        vine.setTitle("vine");

        Product meat = new Product();
        meat.setCost(300);
        meat.setTitle("meat");

        List<Product> products = new ArrayList<>();
        products.add(bread);
        products.add(water);
        products.add(milk);
        products.add(vine);
        products.add(meat);

        Shop shop = new Shop();
        shop.setProducts(products);

        System.out.println(shop.sortProductsByPrice());
        System.out.println(shop.getProducts());

        System.out.println(shop.getMostExpensiveProduct());

        assertThat(shop.getProducts())
                .hasSize(5)
                .doesNotHaveDuplicates()
                .hasOnlyElementsOfType(Product.class);

        assertThat(shop.sortProductsByPrice()).isEqualTo(new ArrayList<>(Arrays.asList(bread, milk, water, meat, vine)));

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(vine);
    }
}
