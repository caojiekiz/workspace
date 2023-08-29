package innerclass;

public class InnerClass01 {
    public static void main(String[] args) {
    Outer outer = new Outer();
    outer.m1();

    }
}
class Outer {
    private int n1 = 100;
    private void m2() {
        System.out.println("outer02 m2()");
    }
    public void m1() {
        System.out.println("m1()");
        final class Inner02 {
            private int n1 =800;
            public void f1() {
                //局部内部类可以直接访问外部类的成员
                System.out.println("外部n1 = " + Outer.this.n1);
                System.out.println("n1 = " + n1);
                m2();
            }
        }
        //外部类在方法中,可以创建inner02对象,然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
    {//代码块
        System.out.println("代码块...");
    }
    class Inner {//内部类

    }
}
