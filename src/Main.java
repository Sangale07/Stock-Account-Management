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
}