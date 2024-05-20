package org.example;

import org.example.entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<User> users = new ArrayList<>();
//        ArrayList<Guest> guests = new ArrayList<>();
//        ArrayList<Product> products = new ArrayList<>();
//        Product product1 = new Product("Laptop", 1200.50, "LP123");
//        Product product2 = new Product("Smartphone", 800.25, "SP456", 10);
//        Product product3 = new Product("Headphones", 150.75, "HD789");
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//
//        System.out.println("Input Guest or Login");
//        Scanner scanner = new Scanner(System.in);
//        String log = scanner.nextLine();
//        User user = new User("dima", "hasp", "dai@,com", "afdas");
//        User user1 = new User("maxim", "rust", "1234@,com", "aasdas");
//        Guest guest = new Guest("asd");
//
//       switch (log){
//           case "Login":
//               for(int i = 0;i <= 2;i++)
//               users.add(user);
//               System.out.println(users.toString());
//               break;
//           case "Guest":
//               guests.add(guest);
//               System.out.println(guest.toString());
//       }
//        System.out.println("Products:");
//        for (Product product : products) {
//            System.out.println(product.toString());
//        }
        ArrayList<String> products = new ArrayList<>();
        ArrayList<String> products1 = new ArrayList<>();
        ArrayList<String> products2 = new ArrayList<>();
        products.add("product1");
        products1.add("product2");
        products2.add("product3");


        Category category = new Category("cat1",products);
        Category category1 = new Category("cat2",products1);
        Category category2 = new Category("cat3",products2);

        category.secondway("categoryname");
        category.firstway();
        System.out.println(products.toString());
        System.out.println(products1.toString());
        System.out.println(products2.toString());
        ArrayList<String> shopingcard1 = new ArrayList<>();
        shopingcard1.add("product");

        ArrayList<String> shopingcard2 = new ArrayList<>();
        shopingcard2.add("product1");
        ShopingCart shopingCart = new ShopingCart(shopingcard1,"name");
        shopingCart.firstway();
        shopingCart.secondway("na_me");
        ShopingCart shopingCart1 = new ShopingCart(shopingcard2,"n_ame");
        shopingCart1.firstway();
        shopingCart1.secondway("nam_e");
        System.out.println(shopingcard1.toString());
        System.out.println(shopingcard2.toString());


    }
}