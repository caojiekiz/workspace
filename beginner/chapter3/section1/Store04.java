package beginner.chapter3.section1;

public class Store04 {
    // declare instance fields here!
    String productType;

    // constructor method
    public Store04() {
        System.out.println("I am inside the constructor method.");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        Store04 lemonadeStand = new Store04();

        System.out.println(lemonadeStand);
    }
}
