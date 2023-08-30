package beginner.chapter3.section1;


public class Store11 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store11(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }
    //toString
    public String toString() {
        return "This store sells " + productType + " at a price of " + price + "." ;
    }

    // main method
    public static void main(String[] args) {
        Store11 lemonadeStand = new Store11("Lemonade", 3.75);
        Store11 cookieShop = new Store11("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
}