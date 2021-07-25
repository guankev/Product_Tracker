package com.dev.haskin.product_tracker;

//import java.io.

import java.util.Scanner;

/**
 * This is what will be communicating between user and program implementations
 */
public class UserView {
    Product product;

    public UserView() {
        askForProduct();
    }

    private void askForProduct() {
        System.out.println("what product do you want?");
        Scanner input = new Scanner(System.in);

        setProduct(input.nextLine());
    }

    private void setProduct(String productName) {

        // TODO Constructor in Product class
        //  should pull results after this lineS
        this.product = new Product(productName);
        outputResults();
    }

    private void outputResults() {
        System.out.println(this.product.name);
    }

}
