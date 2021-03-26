package GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit ){
            System.out.println("Please enter your choice");
             choice = scanner.nextInt();
             scanner.nextLine();
        switch (choice) {
            case 0:
               // To print choice options;
                printInstructions();
                break;
            case 1:
              //To print and list grocery item;
                groceryList.printGroceryList();
                break;
            case 2:
              // To add an item to the list;
                   addItem();
                   break;
            case 3:
              //  To modify an item in the list;
                modifyItem();
                break;
            case 4:
//              //  To remove an item from the list;
                removeItem();
                break;
            case 5:
                //  To search for an item in the list;
                searchItem();
                break;

            case 6:
                System.out.println("Thank you! :)");
                quit = true;

              //  To quit the application;
        }}
    }

    private static void modifyItem() {
        System.out.println("Please enter the item to be modified:");
        String oldItem = scanner.nextLine();
        System.out.println("Please enter the new item:");
        groceryList.modifyItem(oldItem,scanner.nextLine());
    }

    private static void searchItem() {
        System.out.println("Please enter the item to be searched:");
        String item = scanner.nextLine();
        groceryList.searchItemInList(item);
    }

    private static void removeItem() {
        System.out.println("Please enter the item to be removed:");
        groceryList.removeItemFromList(scanner.nextLine());
    }

    private static void addItem() {
        System.out.println("Please enter the grocery item:");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void printInstructions(){
        System.out.println("0-To print choice options.");
        System.out.println("1-To print and list grocery item.");
        System.out.println("2-To add an item to the list.");
        System.out.println("3-To modify an item in the list.");
        System.out.println("4-To remove an item from the list.");
        System.out.println("5-To search for an item in the list.");
        System.out.println("6-To quit the application.");

    }
}