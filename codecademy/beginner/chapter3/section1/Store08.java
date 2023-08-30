package beginner.chapter3.section1;

//Adding Parameters
public class Store08 {
    // instance fields
    String productType;

    // constructor method
    public Store08(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        Store08 lemonadeStand = new Store08("Lemonade");
        lemonadeStand.greetCustomer("Laura");
    }
}