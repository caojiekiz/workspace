package beginner.chapter3.section3;

public class Order02 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order02(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        if(shipping.equals("Regular")) {
            return 0;
        } else if(shipping.equals("Express")) {
            return 1.75;
        } else {
            return 0.5;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order02 book = new Order02(true, 9.99, "Express");
        Order02 chemistrySet = new Order02(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}

