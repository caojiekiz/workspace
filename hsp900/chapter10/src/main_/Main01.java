package main_;

public class Main01 {
    private static String name = "hspjy";
    private int n1 = 10000;
    public static void hi() {
        System.out.println("main01的HI方法");
    }
    //非静态方法
    public void cry() {
        System.out.println("main01的cry方法");
    }
    public static void main(String[] args) {
        System.out.println(name);
        hi();
        //System.out.println(n1);
        Main01 main01 = new Main01();//创建对象实例
        main01.cry();
        System.out.println(main01.n1);

    }
}
