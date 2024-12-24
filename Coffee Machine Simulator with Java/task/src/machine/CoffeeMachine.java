package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int money;
    public static int waterSupplies;
    public static int milkSupplies;
    public static int beansSupplies;
    public static int disposableCupsSupplies;
    public static String action;
    public static int coffeeMade;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Initial state
        money = 550;
        waterSupplies = 400;
        milkSupplies = 540;
        beansSupplies = 120;
        disposableCupsSupplies = 9;
        coffeeMade = 0;

        do {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            action = scanner.next();
            if (action.equals("buy")){
                buy();
            } else if (action.equals("fill")){
                fill();
            } else if (action.equals("take")){
                take();
            } else if (action.equals("remaining")){
                remaining();
            } else if (action.equals("clean")){
                clean();
            }
        } while (!action.equals("exit"));
    }

    public static void buy(){
        // 1 espresso
        int water1 = 250;
        int beans1 = 16;
        int money1 = 4;

        //2 - latte
        int water2 = 350;
        int milk2 = 75;
        int beans2 = 20;
        int money2 = 7;

        //3 - cappuccino
        int water3 = 200;
        int milk3 = 100;
        int beans3 = 12;
        int money3 = 6;

        if (coffeeMade > 9){
            System.out.println("I need cleaning!");
        } else {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

            String coffeeChoice = scanner.next();

            if (coffeeChoice.equals("1")) {
                if (waterSupplies < water1) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansSupplies < beans1) {
                    System.out.println("Sorry, not enough beans!");
                } else if (disposableCupsSupplies == 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterSupplies -= water1;
                    beansSupplies -= beans1;
                    disposableCupsSupplies -= 1;
                    money += money1;
                    coffeeMade += 1;
                }
            } else if (coffeeChoice.equals("2")) {
                if (waterSupplies < water2) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkSupplies < milk2) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beansSupplies < beans2) {
                    System.out.println("Sorry, not enough beans!");
                } else if (disposableCupsSupplies == 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterSupplies -= water2;
                    milkSupplies -= milk2;
                    beansSupplies -= beans2;
                    disposableCupsSupplies -= 1;
                    money += money2;
                    coffeeMade += 1;
                }
            } else if (coffeeChoice.equals("3")) {
                if (waterSupplies < water3) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkSupplies < milk3) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beansSupplies < beans3) {
                    System.out.println("Sorry, not enough beans!");
                } else if (disposableCupsSupplies == 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterSupplies -= water3;
                    milkSupplies -= milk3;
                    beansSupplies -= beans3;
                    disposableCupsSupplies -= 1;
                    money += money3;
                    coffeeMade += 1;
                }
            } else if (coffeeChoice.equals("back")) {
            }
        }
    }

    public static void fill(){
        System.out.println("Write how many ml of water you want to add:");
        waterSupplies += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milkSupplies += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        beansSupplies += scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        disposableCupsSupplies += scanner.nextInt();
    }

    public static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void remaining(){
        System.out.println("The coffee machine has:\n" +
                waterSupplies +" ml of water\n" +
                milkSupplies +" ml of milk\n" +
                beansSupplies +" g of coffee beans\n" +
                disposableCupsSupplies + " disposable cups\n" +
                "$"+money+" of money");
    }

    public static void clean(){
        System.out.println("I have been cleaned!");
        coffeeMade = 0;
    }
}