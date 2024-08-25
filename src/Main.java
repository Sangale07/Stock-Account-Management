import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock Management Code");
    }
}
class Stock{
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
    public String getName() {
        return name;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }
    public double calculateValue() {
        return numberOfShares * sharePrice;
    }
}
class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateValue();
        }
        return totalValue;
    }
}