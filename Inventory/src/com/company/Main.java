package com.company;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Inventory {

    public static ArrayList<String> products = new ArrayList<>();
    private static String product;


    FileWriter writer;


    public String lastName;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Please tell me your last name.");
        String lastName = userInput.nextLine();

        boolean usernameAccepted = false;
        while (!lastName.equals("Auer")) {
            usernameAccepted = false;
            System.out.println("Sorry, thats is wrong, please try again");
            lastName = userInput.nextLine();
        }


        while (true) {
            System.out.println("What can I do for you today Mr. " + lastName + ".");
            String command = userInput.nextLine();

            if (command.contains("help") | command.contains("Help")) {
                System.out.println("add - add product to inventory");
                System.out.println("remove - remove product from inventory");
                System.out.println("products - see all products in inventory");
            } else if (command.contains("add") | command.contains("Add")) {
                boolean expirationGood = false;
                System.out.println("What are we adding today?");
                product = userInput.nextLine();
                System.out.println("What is the expiration date");
                int expiration = Integer.parseInt(userInput.nextLine());

                while (!expirationGood) {
                    System.out.println("The " + product + " expires on " + expiration + ". Is this correct?");
                    String answer = userInput.nextLine();


                    if (answer.contains("yes")) {
                        String together = product + " " + expiration;
                        try {
                            products.add(together);
                            System.out.println("Okay, i will add " + product + " with the expiration date " + expiration);
                            expirationGood = true;

                        } catch (Exception e) {
                            System.out.println("Im sorry, i could not add " + product + " to inventory, please try again");
                        }


                    } else if (answer.contains("no")) {
                        System.out.println("okay, please re-input the expiration date.");
                        expiration = Integer.parseInt(userInput.nextLine());
                    } else {
                        System.out.println("Sorry, that is an invalid answer");
                    }
                }
            } else if (command.contains("remove") | command.contains("Remove")) {
                boolean completed = false;
                while (!completed) {
                    System.out.println("What do you want to remove");
                    String productRemove = userInput.nextLine();
                    if (productRemove.contains("exit")) {
                        System.out.println("exiting.");
                        completed = true;
                    } else if (products.contains(productRemove)) {
                        System.out.println("okay, i will remove " + productRemove + " for you.");
                        completed = true;
                        products.remove(productRemove);
                    } else {
                        System.out.println("there is no " + productRemove + " in inventory.");
                    }
                }
            } else if (command.contains("search") | command.contains("Search")) {
                System.out.println("Okay, what are we looking for today");
                String lookingFor = userInput.nextLine();
                for(String product : products) {
                    if(product.contains(lookingFor)){
                        System.out.println(product);
                    }
                    else{System.out.println("there are no " + product + "'s in inventory");}

                }

            } else if (command.contains("exit")) {
                for (String product : products) {
                    FileWriter writer = new FileWriter("inventory.txt");
                    writer.write(product + System.lineSeparator());
                }
                System.exit(1);


            } else {
                System.out.println(command + " is not a valid command.");
            }
        }
    }
}