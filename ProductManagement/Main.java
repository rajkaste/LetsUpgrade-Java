package ProductManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Management mg = new Management();

        int choice,doit;

        do {
            System.out.println("-------Product Management-------");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Sort Products by Price");
            System.out.println("4. Delete Product");
            System.out.println("Choose an option:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mg.addProduct();
                    break;

                case 2:
                    mg.display();
                    break;

                case 3:
                    mg.sort();
                    break;

                case 4:
                    mg.delete();
                    break;

                default:
                    System.out.println("please select a valid option...");

            }

            System.out.println("Do you want to continue? (1-yes/0-no)");
            doit = sc.nextInt();

        }while(doit==1);

    }
}
