package beginner.chapter3.section1;

public class Store03 {

    // new method: constructor!
    public Store03() {
        System.out.println("I am inside the constructor method.");
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        Store03 lemonadeStand = new Store03();
        // print the instance below
        System.out.println(lemonadeStand);
    }
}
