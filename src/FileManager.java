import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void savePortfolio(ArrayList<Stock> stocks) {

        try {

            FileWriter writer = new FileWriter("PortfolioReport.txt");

            writer.write("========== STOCK PORTFOLIO ==========\n\n");

            double total = 0;

            for (Stock stock : stocks) {

                writer.write("Stock Name : " + stock.getStockName() + "\n");
                writer.write("Price      : $" + stock.getPrice() + "\n");
                writer.write("Quantity   : " + stock.getQuantity() + "\n");
                writer.write("Value      : $" + stock.getTotalValue() + "\n");
                writer.write("--------------------------------------\n");

                total += stock.getTotalValue();
            }

            writer.write("\nTotal Portfolio Value : $" + total);

            writer.close();

            System.out.println("\nPortfolio saved successfully!");
            System.out.println("File Name : PortfolioReport.txt");

        } catch (IOException e) {
            System.out.println("Error while saving file.");
        }

    }
}