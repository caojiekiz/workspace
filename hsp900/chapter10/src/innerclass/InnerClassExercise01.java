package innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画...");
            }
        });
    }
    public static void f1(IL il) {
        il.show();
    }

}
interface IL {
    void show();
}