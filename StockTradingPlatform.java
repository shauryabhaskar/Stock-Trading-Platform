package proj1;

import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stocks = {"AAPL", "GOOGL", "TSLA", "YESBANK", "BAJAJHFL", "IRFC", "NIKE", "SBUX"};
        double[] prices = {212.33, 165.37, 347.68, 21.51, 122.99, 130.24, 61.37, 86.54};
        
        int[] ownedStocks = new int[stocks.length];

        int choice;

        do {
            System.out.println("\n--- Stock Trading Platform ---");
            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n--- Market Data ---");
                for (int i = 0; i < stocks.length; i++) {
                    System.out.println(i + ": " + stocks[i] + " - $" + prices[i]);
                }
            } else if (choice == 2) {
                System.out.print("Enter stock number to buy (0 to " + (stocks.length - 1) + "): ");
                int index = scanner.nextInt();
                if (index >= 0 && index < stocks.length) {
                    System.out.print("Enter quantity to buy: ");
                    int qty = scanner.nextInt();
                    if (qty > 0) {
                        ownedStocks[index] += qty;
                        System.out.println("Bought " + qty + " shares of " + stocks[index]);
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid stock number.");
                }
            } else if (choice == 3) {
                System.out.print("Enter stock number to sell (0 to " + (stocks.length - 1) + "): ");
                int index = scanner.nextInt();
                if (index >= 0 && index < stocks.length) {
                    System.out.print("Enter quantity to sell: ");
                    int qty = scanner.nextInt();
                    if (qty > 0 && qty <= ownedStocks[index]) {
                        ownedStocks[index] -= qty;
                        System.out.println("Sold " + qty + " shares of " + stocks[index]);
                    } else {
                        System.out.println("Invalid quantity. You may not have enough shares.");
                    }
                } else {
                    System.out.println("Invalid stock number.");
                }
            } else if (choice == 4) {
                System.out.println("\n--- Your Portfolio ---");
                double totalValue = 0;
                for (int i = 0; i < stocks.length; i++) {
                    double value = ownedStocks[i] * prices[i];
                    totalValue += value;
                    System.out.println(stocks[i] + ": " + ownedStocks[i] + " shares (Value: $" + value + ")");
                }
                System.out.println("Total Portfolio Value: $" + totalValue);
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
