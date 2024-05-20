package org.example.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Category {

    String Categoryname;
    ArrayList<String> listofProducts = new ArrayList<>();

    public Category(String categoryname, ArrayList<String> listofProducts) {
        Categoryname = categoryname;
        this.listofProducts = listofProducts;
    }
    public Category(){

    }

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCategoryname(String categoryname) {
        Categoryname = categoryname;
    }

    public ArrayList<String> getListofProducts() {
        return listofProducts;
    }

    public void setListofProducts(ArrayList<String> listofProducts) {
        this.listofProducts = listofProducts;
    }

    public void firstway(){
        System.out.println("Category was create");
    }
    public void secondway(String name){
        System.out.println("You Category was created,named " + name);

    }

}
