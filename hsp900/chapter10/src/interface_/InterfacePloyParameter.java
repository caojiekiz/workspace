package interface_;

public class InterfacePloyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        if01 = new Car();

    }
}
interface IF {}
class Monster implements IF {}
class Car implements IF {}