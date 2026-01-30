package com.jairo.projeto_java_web.config;


import com.jairo.projeto_java_web.Entites.Category;
import com.jairo.projeto_java_web.Entites.Enums.OrderStatus;
import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.Product;
import com.jairo.projeto_java_web.Entites.User;
import com.jairo.projeto_java_web.Repositories.CategoryRepository;
import com.jairo.projeto_java_web.Repositories.OrderRepository;
import com.jairo.projeto_java_web.Repositories.ProductRepository;
import com.jairo.projeto_java_web.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category("Electronics");
        Category category2 = new Category("Books");
        Category category3 = new Category("Computers");

        categoryRepository.saveAll(Arrays.asList(category1,category2,category3));

        User user1=new User("maria","maria@gmail.com","1234","4321");
        User user2=new User("Laura","Laura@gmail.com","8080","9090");
        userRepository.saveAll(Arrays.asList(user1,user2));

        Order order1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),user1, OrderStatus.WAITING_PAYMENT);
        Order order2 = new Order(Instant.parse("2019-07-21T03:42:10Z"), user2,OrderStatus.DELIVERED);

        orderRepository.saveAll(Arrays.asList(order1,order2));

        Product product1 = new Product("The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "w");
        Product product2 = new Product("Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "w");
        Product product3 = new Product("Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "w");
        Product product4 = new Product("PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "w");
        Product product5 = new Product("Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "w ");

        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);

        productRepository.saveAll(Arrays.asList(product1,product2,product3,product4,product5));











    }
}
