import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int ppl = scan.nextInt();
        scan.nextLine();
        System.out.print("What percentage are you tipping? ");
        int tip = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the cost for the first item, in dollars and cents (input -1 to end) ");
        double item = scan.nextDouble();
        double costs[];
        costs = new double[3/* just confused as to how to make this theoretically infinite :/*/];
        costs[0] = item;
        int i = 1;
        while (item != -1) {
            System.out.print("Enter the cost for the first item, in dollars and cents (input -1 to end) ");
            item = scan.nextDouble();
            costs[i] = item;
            i++;
        }
        int size = costs[].length;
        double sum;
        i = 0;
        for (i=0; i<size; i++) { //because the size of the array will be 1 more than the magnitude of the indices, i'm putting < instead of <=
            sum += costs[i];
        }
        sum /= size-1;
    }
}