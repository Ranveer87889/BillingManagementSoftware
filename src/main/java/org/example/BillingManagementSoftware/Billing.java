package org.example.BillingManagementSoftware;

import java.util.Scanner;

public class Billing {
    private Product product;
    private Cart cart = new Cart();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {

        int choice;
        do {
            System.out.println("-------Billing Management--------");
            System.out.println("1. Add item to the cart");
            System.out.println("2. Remove item from the cart");
            System.out.println("3. view cart");
            System.out.println("4. Apply Discount");
            System.out.println("5. Generate Invoice");
            System.out.println("6. Exit");
            System.out.println("----------------------------------");


            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   addItemsToCart();
                    break; // Exit the switch block
                case 2:
                   removeItemsFromCart();
                    break;
                case 3:
                    vieweCart();
                    break;
                    case 4:
                        applyDiscount();
                        break;
                case 5:
                    printInvoice();
                    break;
                case 6:
                    System.out.println("Thank you!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break; // Not strictly necessary here but good for consistency

            }
        } while (choice != 6);

    }

    private void printInvoice() {
    }

    private void applyDiscount() {
        System.out.println("Enter the discount amount");
        double discountAmount = scanner.nextDouble();
    }

    private void vieweCart() {
        for(int i=0;i<cart.getListOfProducts().size();i++){
            System.out.println(cart.getListOfProducts().get(i).getName());
        }
    }

    private void removeItemsFromCart() {
        System.out.println("Enter product id to remove");
        int idx = scanner.nextInt();
        cart.removeProduct(idx);
    }

    private void addItemsToCart() {
        System.out.println("Enter the product name");
        String productName = scanner.next();
        System.out.println("Enter the product price");
        double productPrice = scanner.nextDouble();
        System.out.println("Enter the product Quantity");
        int quantity = scanner.nextInt();
        Product product = new Product(productName,productPrice, quantity);
        cart.add(product);
    }
}
