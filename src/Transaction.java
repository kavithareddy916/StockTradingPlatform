import java.time.LocalDateTime;

public class Transaction {

    private String type;
    private String stockName;
    private int quantity;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(String type, String stockName, int quantity, double amount) {
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction Type : " + type +
                "\nStock Name       : " + stockName +
                "\nQuantity         : " + quantity +
                "\nAmount           : $" + amount +
                "\nDate & Time      : " + dateTime;
    }
}