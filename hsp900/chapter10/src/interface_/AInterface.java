package interface_;

public interface AInterface {
    public int n1 = 10;
    //在接口中,抽象方法,可以省略abstract
    public void hi();
    default public void ok() {
        System.out.println("ok...");
    }
    public static void cry() {
        System.out.println("cry...");
    }
}
