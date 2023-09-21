import java.util.Scanner;

public class TipCalculatorVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int ppl = scan.nextInt();
        scan.nextLine();
        System.out.print("What percentage are you tipping? (0-100)");
        int tip = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the cost for the first item, in dollars and cents (input -1 to end) ");
        double item = scan.nextDouble();
        double totalCost = item;
        while (item != -1) {
            System.out.print("Enter the cost for the first item, in dollars and cents (input -1 to end) ");
            item = scan.nextDouble();
            totalCost += item;
        }
        totalCost++; //removing the -1
        double tipped = (int) (((totalCost * (double) (tip) / 100 ) * 100 ) + 0.5 ) / 100.00;

        System.out.print("---------------------------------------");
        System.out.print("Total bill before tip: $" + totalCost);
        System.out.print("Total percentage: " + tip + "%");
        System.out.print("Total tip: $" + tipped);
        System.out.print("Total bill with tip: " + (totalCost + tipped));
        System.out.print("Per person cost before tip: ")


    }