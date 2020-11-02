package ProductManagement;

import java.util.Scanner;

public class Management {

    Scanner sc = new Scanner(System.in);
    int noOfProducts=0,count=0;
    Product[] products = new Product[5];

    Management(){
        for (int i=0;i< products.length;i++){
            products[i] = new Product();
        }
    }

    public void addProduct(){

        int choice;
        do {
           products[noOfProducts].createProduct();
           noOfProducts++;
           count++;
           System.out.println("Do you want to add one more product? (1-yes/0-no)");
           choice = sc.nextInt();
        }while(choice==1);

    }

    public void delete(){
        if(count==0){
            System.out.println("No product data yet.....");
        }
        else {
            System.out.println("Enter name of the product you want to delete: ");
            String name = sc.next();
            for (int i = 0; i < noOfProducts; i++) {
                if(products[i].getName().equals(name)){
                    products[i].setDeleted(true);
                }
            }
        }

    }

    public void display(){
        System.out.println("-------Product Details-------");
        if(count==0){
            System.out.println("No product data yet.....");
        }
        else {

            for (int i = 0; i < noOfProducts; i++) {
                if (products[i].getDeleted()==false){
                    products[i].displayProduct();
                }
            }
        }
    }

    public void sort(){
        Product temp;
        if (count!=0) {
            for (int i = 0; i < noOfProducts; i++) {
                for (int j = i+1; j < noOfProducts; j++) {

                    if (products[i].getPrice() > products[j].getPrice()) {
                        temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }

                }
            }
            for (int i = 0; i < noOfProducts; i++) {
                products[i].displayProduct();
            }

        }
        else {
            System.out.println("No product data yet.....");
        }

    }


}
