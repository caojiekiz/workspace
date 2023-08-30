package beginner.chapter3.section1;

public class Calculator {
    // add/multiply/divide
    public Calculator() {

    }
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
    }
}

