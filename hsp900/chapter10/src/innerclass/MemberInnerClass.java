package innerclass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
    }
}
class Outer08 {
    private int n1 = 10;
    public String name = "zhangsan";
    class Inner08 {
        public void say() {
            //可以直接访问外部类的所有成员,包含私有
            System.out.println("outer08de n1 = " + n1 + "outer08 de name = " + name);
        }
    }
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
    }

}