import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculatorVariableMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int ppl = scan.nextInt();
        scan.nextLine();
        System.out.print("What percentage are you tipping? (0-100) ");
        int tip = scan.nextInt();
        scan.nextLine();
        System.out.println();
        /* prints out the menu */
        System.out.println("Here's our menu for your perusal!");
        System.out.println("-----MAIN COURSES-----");
        System.out.println("Hamburger: $12.49");
        System.out.println("Hamburger with Fries: $14.99");
        System.out.println("Nachos with Cheese: $7.74");
        System.out.println("Chicken Noodle Soup: $11.29");
        System.out.println("Mystery Soup (ask for allergens): $10.99");
        System.out.println("Potato and Cheese Pierogi: $4.19 per pierog");
        System.out.println("-----SIDES-----");
        System.out.println("Fries: $3.29");
        System.out.println("Mashed Potatoes: $2.79");
        System.out.println("Side Salad: $3.59");
        System.out.println("-----DRINKS-----");
        System.out.println("Coca Cola: $1.79");
        System.out.println("Pepsi: $1.69");
        System.out.println("Ginger Ale: $1.79");
        System.out.println("Lemonade: $1.29");
        System.out.println();
        System.out.print("Enter the name of your first item (input -1 to end): ");
        String name = scan.nextLine();
        ArrayList<String> items = new ArrayList<String>();
        Item item = new Item(name);
        if (!name.equals("-1") && item.checkPrice() == 0.0) { // checks if the item is in the menu
            System.out.println("You might've misspelled that! Or maybe it's not on our menu! Please try again.");
        } else {
            items.add(name);
        }
        double totalCost = item.checkPrice();
        while (!name.equals("-1")) { //loops the code for the user to input items until the user inputs "-1"
            System.out.print("Enter the name of your next item (input -1 to end): ");
            name = scan.nextLine();
            item.setName(name); //resets the name of the item in the variable "item" to the name of the item the user inputted so that that new name can be used by the commands called that use the Item class
            if (!name.equals("-1") && item.checkPrice() == 0.0) { //see line 38
                System.out.println("You might've misspelled that! Or maybe it's not on our menu! Please try again.");
            } else {
                items.add(name);
            }
            totalCost += item.checkPrice(); //adds the cost of the item to total cost, if the user inputs -1, nothing is added
        }
        double tipped = (int) (((totalCost * (double) (tip) / 100) * 100) + 0.5) / 100.00; //creates a double whose value is equal to how much the party has chosen to tip
        totalCost = (int) ((totalCost * 100) + 0.5) / 100.00; //rounds totalCost to the nearest hundred

        System.out.println("---------------------------------------");
        System.out.println("Items ordered: ");
        int i;
        int itemsLength = items.size();
        for (i = 0; i < itemsLength - 1; i++) {
            System.out.println(items.get(i));
        }

        System.out.println("---------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + tipped);
        System.out.println("Total bill with tip: $" + (int) ((totalCost + tipped) * 100 + 0.5) / 100.00);
        System.out.println("Per person cost before tip: $" + ((int) (((totalCost / ppl) * 100) + 0.5) / 100.00));
        System.out.println("Tip per person: $" + ((int) (((tipped / ppl) * 100) + 0.5) / 100.00));
        System.out.println("Total cost per person: $" + ((int) (((totalCost + tipped) / ppl) * 100 + 0.5) / 100.00));
    }
}