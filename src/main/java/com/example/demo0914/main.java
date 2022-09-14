package com.example.demo0914;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        // FIRST PART
//        BurgerOrder order1 = new BurgerOrder(3,5,4,10,false,1);
//        BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
//        BurgerOrder order3 = new BurgerOrder(1,1,0,2,false,3);
//
//        System.out.println(order1);
//        System.out.println(order2);
//        System.out.println(order3);

        //NEXT PART
        FastFoodKitchen kitchen = new FastFoodKitchen();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see what the user wants to do
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Cancel last order");
            System.out.println("\t 3. Show number of orders currently pending.");
            System.out.println("\t 4. Exit");
            System.out.println("\t 5. Check on order");
            System.out.println("\t 6. Cancel an order");

            int num = sc.nextInt();
            switch (num) {

                case 1:
                    System.out.println("How many hamburgers do you want?");
                    int ham = sc.nextInt();
                    System.out.println("How many cheeseburgers do you want?");
                    int cheese = sc.nextInt();
                    System.out.println("How many veggieburgers do you want?");
                    int veggie = sc.nextInt();
                    System.out.println("How many sodas do you want?");
                    int sodas = sc.nextInt();
                    System.out.println("Is your order to go? (Y/N)");
                    char letter = sc.next().charAt(0);
                    boolean TOGO = false;
                    if (letter == 'Y' || letter == 'y') {
                        TOGO = true;
                    }
                    int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                    System.out.println("Thank-you. Your order number is " + orderNum);
                    System.out.println();
                    break;
                case 2:
                    boolean ready = kitchen.cancelLastOrder();
                    if (ready) {
                        System.out.println("Thank you. The last order has been canceled");
                    } else {
                        System.out.println("Sorry. There are no orders to cancel.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Enter the number of the order you would like to check:");
                    int checkNum = sc.nextInt();
                    boolean orderDone = kitchen.isOrderDone(checkNum);
                    if (!(orderDone)) {
                        System.out.println("order is not ready yet");
                    } else if (orderDone) {
                        System.out.println("order is ready");
                    }


                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");

            }

        } // end while loop
    }
}

