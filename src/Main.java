import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Portfolio portfolio = new Portfolio();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("     STOCK TRADING PLATFORM");
            System.out.println("======================================");
            System.out.println("1. Buy Stock");
            System.out.println("2. View Portfolio");
            System.out.println("3. Save Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Stock Name: ");
                    String stockName = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    Stock stock = new Stock(stockName, price, quantity);
                    portfolio.buyStock(stock);

                    break;

                case 2:

                    portfolio.displayPortfolio();

                    break;

                case 3:

                    FileManager.savePortfolio(portfolio.getStocks());

                    break;

                case 4:

                    System.out.println("Thank you for using Stock Trading Platform!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}