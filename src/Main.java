import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock Management Code");
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter the number of stocks: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter stock name: ");
            String name = scanner.next();
            System.out.print("Enter number of shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter share price: ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(name, numberOfShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
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
    public void printReport() {
        System.out.println("Stock Report:");
        System.out.println("-------------");
        for (Stock stock : stocks) {
            double value = stock.calculateValue();
            System.out.printf("Stock Name: %s, Number of Shares: %d, Share Price: %.2f, Value: %.2f%n",
                    stock.getName(), stock.getNumberOfShares(), stock.getSharePrice(), value);
        }
        double totalValue = calculateTotalValue();
        System.out.println("-------------");
        System.out.printf("Total Value of Portfolio: %.2f%n", totalValue);
    }

}