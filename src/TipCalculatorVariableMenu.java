import java.util.Scanner;

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
        Item item = new Item(name);
        if (!name.equals("-1") && item.checkPrice() == 0.0) { // checks if the item is in the menu
            System.out.println("You might've misspelled that! Or maybe it's not on our menu! Please try again.");
        }
        double totalCost = item.checkPrice();
        while (!name.equals("-1")) { //loops the code for the user to input items until the user inputs "-1"
            System.out.print("Enter the name of your next item (input -1 to end): ");
            name = scan.nextLine();
            item.setName(name);
            if (!name.equals("-1") && item.checkPrice() == 0.0) {
                System.out.println("You might've misspelled that! Or maybe it's not on our menu! Please try again.");
                continue;
            }
            totalCost += item.checkPrice();
        }
        double tipped = (int) (((totalCost * (double) (tip) / 100) * 100) + 0.5) / 100.00;
        totalCost = (int) ((totalCost * 100) + 0.5) / 100.00;

        System.out.println("---------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + tipped);
        System.out.println("Total bill with tip: $" + (totalCost + tipped));
        System.out.println("Per person cost before tip: $" + ((int) (((totalCost / ppl) * 100) + 0.5) / 100.00));
        System.out.println("Tip per person: $" + ((int) (((tipped / ppl) * 100) + 0.5) / 100.00));
        System.out.println("Total cost per person: $" + ((int) (((totalCost + tipped) / ppl) * 100) / 100.00));
    }
}