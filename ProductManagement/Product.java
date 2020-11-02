package ProductManagement;

import java.util.Scanner;

public class Product {

    Scanner sc = new Scanner(System.in);

    private String name,category;
    private int price;
    private int quantity;
    private int production;
    private boolean isDeleted = false;

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setDeleted(boolean isDeleted){
        this.isDeleted  = isDeleted;
    }

    public boolean getDeleted(){
        return isDeleted;
    }

    public void createProduct(){
        System.out.println("Enter name, price, quantity, category, production resp.:");
        name = sc.next();
        price = sc.nextInt();
        quantity = sc.nextInt();
        category = sc.next();
        production = sc.nextInt();
    }

    public void displayProduct(){
//        System.out.println("Name   +   Price   +   Quantity   +   Category   +   Production");
        System.out.println(name+" "+price+" "+quantity+" "+category+" "+production);
    }


}
