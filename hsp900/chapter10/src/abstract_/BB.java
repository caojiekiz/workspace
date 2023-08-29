package abstract_;

public class BB extends Template{
    @Override
    public void job() {
        long num = 0;
        for (int i = 0; i <= 80000; i++) {
            num *= i;
        }
    }
}
