package beginner.chapter3.section3;

public class Order04 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order04(boolean filled, double cost, String shippingMethod) {
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
        double shippingCost;
        // declare switch statement here
        switch(shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = 0.5;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order04 book = new Order04(true, 9.99, "Express");
        Order04 chemistrySet = new Order04(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}

