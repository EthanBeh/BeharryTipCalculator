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
    public double checkPrice () {
        if (name.equals("Hamburger")) {
            return 12.49;
        } else if (name.equals("Hamburger with Fries")) {
            return 14.99;
        } else if (name.equals("Nachos with Cheese")) {
            return 7.74;
        } else if (name.equals("Chicken Noodle Soup")) {
            return 11.29;
        } else if (name.equals("Mystery Soup") || name.equals("Mystery Soup (ask for allergens)")) {
            return 10.99;
        } else if (name.equals("Pierogi") || name.equals("Potato and Cheese Pierogi")) {
            return 4.19;
        } else if (name.equals("Fries")) {
            return 3.29;
        } else if (name.equals("Mashed Potatoes")) {
            return 2.79;
        } else if (name.equals("Side Salad")) {
            return 3.59;
        } else if (name.equals("Coca Cola")) {
            return 1.79;
        } else if (name.equals("Pepsi")) {
            return 1.69;
        } else if (name.equals("Ginger Ale")) {
            return 1.79;
        } else if (name.equals("Lemonade")) {
            return 1.29;
        } else {
            return 0.0;
        }
    }
}