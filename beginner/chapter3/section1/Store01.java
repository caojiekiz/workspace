package beginner.chapter3.section1;

public class Store01 {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store01(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store01 lemonadeStand = new Store01("lemonade", 42, .99);
        Store01 cookieShop = new Store01("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}
