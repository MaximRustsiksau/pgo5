package org.example;

import org.example.entity.Guest;
import org.example.entity.Product;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Laptop", 1200.50, "LP123");
        Product product2 = new Product("Smartphone", 800.25, "SP456", 10);
        Product product3 = new Product("Headphones", 150.75, "HD789");
        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println("Input Guest or Login");
        Scanner scanner = new Scanner(System.in);
        String log = scanner.nextLine();
        User user = new User("dima", "hasp", "dai@,com", "afdas");
        User user1 = new User("maxim", "rust", "1234@,com", "aasdas");
        Guest guest = new Guest("asd");

       switch (log){
           case "Login":
               for(int i = 0;i <= 2;i++)
               users.add(user);
               System.out.println(users.toString());
               break;
           case "Guest":
               guests.add(guest);
               System.out.println(guest.toString());
       }
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}