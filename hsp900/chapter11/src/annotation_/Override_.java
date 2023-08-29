package annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father {
    public void fly() {
        System.out.println("father fly...");
    }
}
class son extends Father {
    @Override
    public void fly() {
        System.out.println("son fly...");
    }
}