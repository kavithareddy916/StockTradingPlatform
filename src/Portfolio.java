import java.util.ArrayList;

public class Portfolio {

    private final ArrayList<Stock> stocks = new ArrayList<>();

    public void buyStock(Stock stock) {
        stocks.add(stock);
        System.out.println("\nStock Purchased Successfully!");
    }

    public void displayPortfolio() {

        if (stocks.isEmpty()) {
            System.out.println("\nPortfolio is Empty!");
            return;
        }

        System.out.println("\n========= YOUR PORTFOLIO =========");

        double totalInvestment = 0;

        for (Stock stock : stocks) {
            System.out.println("--------------------------------");
            System.out.println(stock);
            totalInvestment += stock.getTotalValue();
        }

        System.out.println("--------------------------------");
        System.out.println("Total Investment : ₹" + totalInvestment);
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }
}
