public class Stock {

    private String stockName;
    private double price;
    private int quantity;

    public Stock(String stockName, double price, int quantity) {
        this.stockName = stockName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Stock Name : " + stockName +
                "\nPrice      : ₹" + price +
                "\nQuantity   : " + quantity +
                "\nValue      : ₹" + getTotalValue();
    }
}
