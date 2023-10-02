import java.util.Scanner;

public class Item {
    private String name;
    public Item (String name) {
        this.name = name;
    }
    //setter method
    public void setName (String newName) {
        name = newName;
    }
    public double checkPrice () { //if the item is in the menu, returns its price as a double, if not, returns 0.0
        if (name.equalsIgnoreCase("Hamburger")) {
            return 12.49;
        } else if (name.equalsIgnoreCase("Hamburger with Fries")) {
            return 14.99;
        } else if (name.equalsIgnoreCase("Nachos with Cheese")) {
            return 7.74;
        } else if (name.equalsIgnoreCase("Chicken Noodle Soup")) {
            return 11.29;
        } else if (name.equalsIgnoreCase("Mystery Soup") || name.equalsIgnoreCase("Mystery Soup (ask for allergens)")) {
            return 10.99;
        } else if (name.equalsIgnoreCase("Pierogi") || name.equalsIgnoreCase("Potato and Cheese Pierogi")) {
            return 4.19;
        } else if (name.equalsIgnoreCase("Fries")) {
            return 3.29;
        } else if (name.equalsIgnoreCase("Mashed Potatoes")) {
            return 2.79;
        } else if (name.equalsIgnoreCase("Side Salad")) {
            return 3.59;
        } else if (name.equalsIgnoreCase("Coca Cola")) {
            return 1.79;
        } else if (name.equalsIgnoreCase("Pepsi")) {
            return 1.69;
        } else if (name.equalsIgnoreCase("Ginger Ale")) {
            return 1.79;
        } else if (name.equalsIgnoreCase("Lemonade")) {
            return 1.29;
        } else {
            return 0.0;
        }
    }
}