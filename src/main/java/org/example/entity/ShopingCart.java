package org.example.entity;

import java.util.ArrayList;

public class ShopingCart  {
    ArrayList<String> listofProducts = new ArrayList<>();
    String useraccount;

    public ShopingCart(ArrayList<String> listofProducts, String useraccount) {
        this.listofProducts = listofProducts;
        this.useraccount = useraccount;
    }

    public ArrayList<String> getListofProducts() {
        return listofProducts;
    }

    public void setListofProducts(ArrayList<String> listofProducts) {
        this.listofProducts = listofProducts;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }
    public void firstway(){
        System.out.println("Cart was create");
    }
    public void secondway(String useraccount){
        System.out.println("You Cart was created,named " + useraccount);

    }
}
