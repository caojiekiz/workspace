package beginner.chapter3.section1;

public class Store05 {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    // constructor method
    public Store05(String product,int count,double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store05 cookieShop = new Store05("cookies", 12, 3.75);
    }
}