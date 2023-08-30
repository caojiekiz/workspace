package beginner.chapter3.section1;
//Defining Methods
public class Store06 {
    // instance fields
    String productType;

    // constructor method
    public Store06(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }
    // main method
    public static void main(String[] args) {

    }
}
